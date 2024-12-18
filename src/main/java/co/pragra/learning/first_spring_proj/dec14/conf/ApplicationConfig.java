package co.pragra.learning.first_spring_proj.dec14.conf;

import co.pragra.learning.first_spring_proj.dec14.domain.Person;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
}
