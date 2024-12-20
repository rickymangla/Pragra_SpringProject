package co.pragra.learning.first_spring_proj;

public class PetrolEngine implements IEngine{
    private String EngineType="Petrol Engine";
    private Integer horsePower=4500;


    @Override
    public void display() {
        System.out.println("Engine type: " + EngineType + " Horse Power: " + horsePower);
    }

    @Override
    public String toString() {
        return "PetrolEngine{" +
                "EngineType='" + EngineType + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
