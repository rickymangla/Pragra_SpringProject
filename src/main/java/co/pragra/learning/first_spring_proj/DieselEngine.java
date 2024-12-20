package co.pragra.learning.first_spring_proj;

public class DieselEngine implements IEngine{
    private String EngineType="Diesel Engine";
    private Integer horsePower=5500;


    @Override
    public void display() {
        System.out.println("Engine type: " + EngineType + " Horse Power: " + horsePower);

    }

    @Override
    public String toString() {
        return "DieselEngine{" +
                "EngineType='" + EngineType + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
