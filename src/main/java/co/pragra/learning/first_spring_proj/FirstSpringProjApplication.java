package co.pragra.learning.first_spring_proj;

import co.pragra.learning.first_spring_proj.dec14.conf.ApplicationConfig;
import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import co.pragra.learning.first_spring_proj.dec22.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Collections;
import java.util.HashMap;
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
        Person person2 = context1.getBean("person3", Person.class);
        System.out.println("person2 = " + person2);

//        BMWM3 bm = new BMWM3(new DieselEngine(), "m3");
//        bm.print(bm);
        // System.out.println("bm = " + bm);

        BMWM3 bmwm3 = context1.getBean("bmwm3", BMWM3.class);
        bmwm3.print(bmwm3);

//        BMWM3 bmwm4=context1.getBean("bmwm4",BMWM3.class);
//        bmwm4.print(bmwm4);

        MyHibernate hibernate = context1.getBean("dbConnection", MyHibernate.class);
        System.out.println(hibernate);
        hibernate.postInit();

        BMWM3 bmwm3New = contextNew.getBean("bmwm3", BMWM3.class);
        System.out.println("bmwm3New = " + bmwm3New);

        Student stu = contextNew.getBean("student", Student.class);
        System.out.println("stu = " + stu);

//        Map<Employee, Integer> m = new HashMap<>();
//        Employee emp1 = new Employee("amit", "mechanical", 101);
//        Employee emp2 = new Employee("amit", "mechanical", 101);
//
//        m.put(emp1, 1);
//        m.put(emp2, 2);
//        System.out.println("emp1 hashcode is: " + emp1.hashCode());
//        System.out.println("emp2 hashcode is: " + emp2.hashCode());
//
//        System.out.println("emp1 comparison with emp2 is: " + emp1.equals(emp2));
//
//        System.out.println("map results are: " + m);
//        System.out.println("first employee value is: " + m.get(emp1));
//        System.out.println("second employee value is: " + m.get(emp2));


    }

//    @GetMapping("/api/person")
//    public Map<String,String> getData() {
//        return Collections.singletonMap("name","Robin");
//    }

}
