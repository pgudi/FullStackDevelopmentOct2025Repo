package com.gentech.relationship;

import com.gentech.relationship.entity.Places;
import com.gentech.relationship.entity.Tourists;
import com.gentech.relationship.repository.PlacesRepository;
import com.gentech.relationship.repository.TouristsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringManytomanyApplication.class, args);
	}

    @Autowired
    private PlacesRepository placeRepo;

    @Autowired
    private TouristsRepository touristRepo;

    @Override
    public void run(String... args) throws Exception {
        Places place1=new Places();
        place1.setPlaceName("Hampi");
        place1.setPlaceType("Historical");
        place1.setStateName("Karnataka");

        Places place2=new Places();
        place2.setPlaceName("Mahabalipuram");
        place2.setPlaceType("Historical");
        place2.setStateName("Tamilnadu");

        Tourists tourist1=new Tourists();
        tourist1.setTouristName("Achyuth");
        tourist1.setEmailId("achyuth@gmail.com");
        tourist1.setCountryName("France");

        Tourists tourist2=new Tourists();
        tourist2.setTouristName("Manunath");
        tourist2.setEmailId("manju@gmail.com");
        tourist2.setCountryName("United States");

        Tourists tourist3=new Tourists();
        tourist3.setTouristName("Rohit");
        tourist3.setEmailId("rohit@gmail.com");
        tourist3.setCountryName("United Kingdom");
        // Add Tourists to Place
        place1.getTourists().add(tourist1);
        place1.getTourists().add(tourist2);
        place1.getTourists().add(tourist3);

        place2.getTourists().add(tourist1);
        place2.getTourists().add(tourist2);
        place2.getTourists().add(tourist3);
        //Add Places to Tourist
        tourist1.getPlaces().add(place1);
        tourist1.getPlaces().add(place2);
        tourist2.getPlaces().add(place1);
        tourist2.getPlaces().add(place2);
        tourist3.getPlaces().add(place1);
        tourist3.getPlaces().add(place2);

        touristRepo.saveAll(List.of(tourist1,tourist2,tourist3));
    }
}
