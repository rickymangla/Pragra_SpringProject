package co.pragra.learning.first_spring_proj;

import org.springframework.stereotype.Component;

@Component
public class Order {

    public boolean show(BMWM3 m3) {
        return true;
    }

    @Override
    public String toString() {
        return "Order{}";
    }
}
