package co.pragra.learning.first_spring_proj.dec14.domain;

import java.util.List;
import java.util.Map;

public class Person {
    private String firstName;
    private int age;
    private double salary;

    private Map<String,String> scoreCard;
    private List<String> hobbies;

    public Person(String firstName, int age, double salary) {
        this.firstName = firstName;
        this.age = age;
        this.salary = salary;
    }

    public void setScoreCard(Map<String, String> scoreCard) {
        this.scoreCard = scoreCard;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", scoreCard=" + scoreCard +
                ", hobbies=" + hobbies +
                '}';
    }
}
