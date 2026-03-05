package com.gentech.relationship;

import com.gentech.relationship.entity.UserProfile;
import com.gentech.relationship.entity.Users;
import com.gentech.relationship.repository.UserProfileRepository;
import com.gentech.relationship.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOnetooneApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringOnetooneApplication.class, args);
	}
    @Autowired
    private UsersRepository usersRepo;

    @Autowired
    private UserProfileRepository userProfileRepo;

    @Override
    public void run(String... args) throws Exception {
        Users user=new Users();
        user.setFirstName("Vijay");
        user.setJobName("Software Developer");

        UserProfile profile=new UserProfile();
        profile.setEmailId("vijay@gmail.com");
        profile.setPhoneNumber(9010203040L);
        profile.setSalary(55000);
        profile.setLocation("Bangalore");

        user.setUserProfile(profile);
        profile.setUser(user);

        usersRepo.save(user);
    }
}
