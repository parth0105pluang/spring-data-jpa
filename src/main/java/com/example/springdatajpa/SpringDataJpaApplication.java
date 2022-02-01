package com.example.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(EmployeeRepository repository){
        return (args -> {
                   //insertJavaAdvocates(repository);
                   //System.out.println(repository.findAll());
                   System.out.println(repository.findEmployeeByLastNameContaining("ma"));
                });
    }
    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new Employee("Parth","Sharma"));
        repository.save(new Employee("Parth1","Sharma1"));
        repository.save(new Employee("Parth2","Sharma2"));

}
}
