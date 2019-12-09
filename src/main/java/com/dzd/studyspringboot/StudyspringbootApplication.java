package com.dzd.studyspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class StudyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyspringbootApplication.class, args);
    }

}
