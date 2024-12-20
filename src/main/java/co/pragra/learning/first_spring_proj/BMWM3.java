package co.pragra.learning.first_spring_proj;

import java.util.List;
import java.util.Map;

public class BMWM3 {
    private IEngine engine;
    private String carName;
    private List<String> features;
    private Map<String, Double> modelPrice;

    public BMWM3(IEngine engine, String carName, List<String> features, Map<String, Double> modelPrice) {
        this.engine = engine;
        this.carName = carName;
        this.features = features;
        this.modelPrice = modelPrice;
    }

//    public BMWM3(IEngine engine, String carName) {
//        this.engine = engine;
//        this.carName = carName;
//    }

    public void print(BMWM3 bmwm3) {
        System.out.println(bmwm3);
    }

    @Override
    public String toString() {
        return "BMWM3{" +
                "engine=" + engine +
                ", carName='" + carName + '\'' +
                ", features=" + features +
                ", modelPrice=" + modelPrice +
                '}';
    }
//    @Override
//    public String toString() {
//        return "BMWM3{" +
//                "engine=" + engine +
//                ", carName='" + carName + '\'' +
//                '}';
//    }
}
