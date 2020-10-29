package com.asahi.personalnote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.asahi.personalnote")
@MapperScan("com.asahi.personalnote.mapper")
@SpringBootApplication
public class PersonalnoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalnoteApplication.class, args);
    }

}
