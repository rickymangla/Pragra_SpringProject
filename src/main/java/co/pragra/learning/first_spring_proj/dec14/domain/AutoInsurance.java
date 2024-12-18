package co.pragra.learning.first_spring_proj.dec14.domain;

public class AutoInsurance implements Insurance{
    @Override
    public double getQuote() {
        return 300;
    }
}
