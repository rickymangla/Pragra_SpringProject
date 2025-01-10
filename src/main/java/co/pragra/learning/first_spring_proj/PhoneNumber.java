package co.pragra.learning.first_spring_proj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PhoneNumber {
    @Value("${emp.number}")
    private long number;

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number=" + number +
                '}';
    }

    public void display() {
        System.out.println(number);
    }
}
