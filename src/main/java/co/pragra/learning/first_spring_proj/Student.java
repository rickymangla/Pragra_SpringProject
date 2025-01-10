package co.pragra.learning.first_spring_proj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.yml")
public class Student {

    @Value("${stuName}")
    private String stuName;
    @Value("${stuDept}")
    private String stuDept;
//    @Value("${stuAge}")
//    private int stuAge;

    public Student() {

    }

//    @Override

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuDept='" + stuDept + '\'' +
                '}';
    }
//    public String toString() {
//        return "Student{" +
//                "stuName='" + stuName + '\'' +
//                ", stuDept='" + stuDept + '\'' +
//                ", stuAge=" + stuAge +
//                '}';
//    }
}
