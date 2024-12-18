package co.pragra.learning.first_spring_proj;

import co.pragra.learning.first_spring_proj.dec14.conf.ApplicationConfig;
import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Collections;
import java.util.Map;

//@SpringBootApplication
//@RestController
public class FirstSpringProjApplication {

    public static void main(String[] args) {
//		SpringApplication.run(FirstSpringProjApplication.class, args);

        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");

        Person person = context.getBean("person", Person.class);
        System.out.println("person = " + person);
//        Person person2 = context.getBean("person2", Person.class);
//        System.out.println("person2 = " + person2);
//        Person person3 = context.getBean("person2", Person.class);
//        System.out.println("person3 = " + person3);

        ApplicationContext contextNew = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person personNew = contextNew.getBean("person", Person.class);
        System.out.println("personNew = " + personNew);

        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Person person2 = context1.getBean(Person.class);
        System.out.println("person2 = " + person2);

    }

//    @GetMapping("/api/person")
//    public Map<String,String> getData() {
//        return Collections.singletonMap("name","Robin");
//    }

}
