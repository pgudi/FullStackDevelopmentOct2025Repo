package com.gentech.relationship;

import com.gentech.relationship.entity.Comments;
import com.gentech.relationship.entity.VideoPost;
import com.gentech.relationship.repository.CommnetsRepository;
import com.gentech.relationship.repository.VideoPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringOnetomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetomanyApplication.class, args);
	}

    @Autowired
    private VideoPostRepository videoRepo;

    @Autowired
    private CommnetsRepository commnetsRepo;

    @Override
    public void run(String... args) throws Exception {
        VideoPost video1=new VideoPost();
        video1.setVideoType("Education");
        video1.setDescription("It describes Spring Boot Topics");

        Comments comment1=new Comments();
        comment1.setCommentType("Positive");
        comment1.setDescription("It provides detail knowledge on Springboot");

        Comments comment2=new Comments();
        comment2.setCommentType("Medium");
        comment2.setDescription("It has not covered real time Scenarios");

        Comments comment3=new Comments();
        comment3.setCommentType("Positive");
        comment3.setDescription("It has more info on Micro services");

        video1.getComments().add(comment1);
        video1.getComments().add(comment2);
        video1.getComments().add(comment3);

        //Second Video
        VideoPost video2 =new VideoPost();
        video2.setVideoType("Cooking");
        video2.setDescription("Veg and Nog Veg Recipes");

        Comments comment4=new Comments();
        comment4.setCommentType("Positive");
        comment4.setDescription("Veg Items Recipes are good");

        Comments comment5=new Comments();
        comment5.setCommentType("Positive");
        comment5.setDescription("Non Veg Items Recipes are good");

        video2.getComments().add(comment4);
        video2.getComments().add(comment5);
        //Save all Changes
        videoRepo.saveAll(List.of(video1, video2));
    }
}
