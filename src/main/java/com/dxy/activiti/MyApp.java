package com.dxy.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyApp {

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }

//    @Bean
//    CommandLineRunner init(final RepositoryService repositoryService,
//                           final RuntimeService runtimeService,
//                           final TaskService taskService) {
//
//        return new CommandLineRunner() {
//
//            public void run(String... strings) throws Exception {
//                Map<String, Object> variables = new HashMap<String, Object>();
//                variables.put("applicantName", "John Doe");
//                variables.put("email", "john.doe@activiti.com");
//                variables.put("phoneNumber", "123456789");
//                runtimeService.startProcessInstanceByKey("hireProcess", variables);
//            }
//        };
//    }

}
