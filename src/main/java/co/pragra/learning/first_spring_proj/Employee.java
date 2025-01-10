package co.pragra.learning.first_spring_proj;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${emp.id}")
    private int empId;
    @Value("${emp.empName}")
    private String empName;
    @Value("${emp.salary}")
    private double empSalary;
    @Value("#{'${emp.dept}'.substring(0,4)}")
    private String empDept;
//    @Autowired
    final private PhoneNumber phoneNumber;

    public Employee(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public void setPhoneNumber(PhoneNumber phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empDept='" + empDept + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @PreDestroy
    public void preDestroy() {
        phoneNumber.display();
        System.out.println("Employee is destroyed");
    }
}
