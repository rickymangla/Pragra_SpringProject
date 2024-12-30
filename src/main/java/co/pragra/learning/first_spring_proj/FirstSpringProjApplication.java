package co.pragra.learning.first_spring_proj;

import co.pragra.learning.first_spring_proj.dec14.conf.ApplicationConfig;
import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import co.pragra.learning.first_spring_proj.dec22.Employee;
//import co.pragra.learning.first_spring_proj.dec22.EmployeeNew;
import co.pragra.learning.first_spring_proj.dec22.PhoneNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        Map<Employee, Integer> m = new HashMap<>();
        Employee emp1 = new Employee("amit", "mechanical", 101, new PhoneNumber(987));
        Employee emp2 = new Employee("rahul", "computer", 102, new PhoneNumber(987));
      //  EmployeeNew emp3 = new EmployeeNew("robin", "civil", 103, new PhoneNumber(905), "pass");
        Employee emp3 = new Employee("robin", "civil", 103, new PhoneNumber(876));

        System.out.println("result of double equals");
        System.out.println(emp1 == emp2);
        System.out.println("result of equals method: " + emp1.equals(emp2));

        m.put(emp1, 1);
        m.put(emp2, 2);
        m.put(emp3, 3);
        System.out.println("emp1 hashcode is: " + emp1.hashCode());
        System.out.println("emp2 hashcode is: " + emp2.hashCode());
        System.out.println("emp3 hashcode is: " + emp3.hashCode());
        System.out.println("emp3 is: " + emp3);
        System.out.println("emp2 is: " + emp2);

//        emp3.setEmpStatus("fail");
//        System.out.println("emp3 new hashcode is: " + emp3.hashCode());
//        System.out.println("emp3 new is: " + emp3);

//        emp2.setEmpDept("civil");
//        System.out.println("emp2 new hashcode is: " + emp2.hashCode());
//        System.out.println("emp2 is: " +  emp2);
//        System.out.println("m.get(emp2) = " + m.get(emp2));

//        emp2.setEmpDept("computer");
//        System.out.println("emp2 new hashcode is: " + emp2.hashCode());
//        System.out.println("emp2 is: " +  emp2);
//        System.out.println("m.get(emp2) = " + m.get(emp2));


//        System.out.println("emp1 comparison with emp2 is: " + emp1.equals(emp2));

       // PhoneNumber phoneNumber = emp2.getPhoneNumber();
        System.out.println("phoneNumber is: " + emp2.getPhoneNumber());
//        System.out.println("old phone number is: " + phoneNumber);
//        phoneNumber.setPhNumber(123);
//        System.out.println("new phone number is: " + phoneNumber);

        emp2.getPhoneNumber().setPhNumber(123);
        System.out.println("updated phone number is: " + emp2.getPhoneNumber().getPhNumber());
        //int phNumber = new PhoneNumber().getPhNumber();
        //System.out.println("phNumber = " + new PhoneNumber().getPhNumber());
        PhoneNumber phoneNumber1 = emp2.getPhoneNumber();
        System.out.println("phoneNumber is: " + phoneNumber1);
        System.out.println("emp2 new hashcode is: " + emp2.hashCode());
        System.out.println("emp2 new is: " + emp2);

        System.out.println("map results are: " + m);
        System.out.println("first employee value is: " + m.get(emp1));
        System.out.println("second employee value is: " + m.get(emp2));
        System.out.println("third employee value is: " + m.get(emp3));

//        ph2.setPhNumber(7654);
//        System.out.println("second employee is: " + emp2);
//        System.out.println("second employee new value is: " + m.get(emp2));

//        Set<Employee> employees = m.keySet();
//        for (Employee e : employees) {
//            System.out.println(e);
//        }
    }

//    @GetMapping("/api/person")
//    public Map<String,String> getData() {
//        return Collections.singletonMap("name","Robin");
//    }

}
