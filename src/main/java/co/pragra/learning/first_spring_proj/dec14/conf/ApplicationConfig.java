package co.pragra.learning.first_spring_proj.dec14.conf;

import co.pragra.learning.first_spring_proj.BMWM3;
import co.pragra.learning.first_spring_proj.IEngine;
import co.pragra.learning.first_spring_proj.PetrolEngine;
import co.pragra.learning.first_spring_proj.Student;
import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ApplicationConfig {

    @Bean
    Person person() {
        Person p = new Person("Robin", 30, 5000);
        p.setHobbies(Arrays.asList("eating", "sleeping"));
        p.setScoreCard(addValues());
        return p;
    }

    Map<String, String> addValues() {
        Map<String, String> scoreCard = new HashMap<>();
        scoreCard.put("jk", "jh");
        scoreCard.put("gf", "fd");
        return scoreCard;
    }

    @Bean
        //@Scope(value = "prototype")
    BMWM3 bmwm3() {
        Map<String, Double> priceModel = new HashMap<>();
        priceModel.put("m2", 50000.0);
        priceModel.put("m3", 60000.0);
        priceModel.put("m4", 70000.0);
        return new BMWM3(engine(), "m3", Arrays.asList("auto park", "4WD"), priceModel);
    }

 //   @Bean
    IEngine engine() {
        return new PetrolEngine();
    }

    @Bean
    Student student() {
        return new Student();
    }
}
