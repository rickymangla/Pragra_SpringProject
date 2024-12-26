package co.pragra.learning.first_spring_proj.dec22;

import java.util.Objects;

public class Employee {
    String empName;
    String empDept;
    int empId;

    public Employee(String empName, String empDept, int empId) {
        this.empName = empName;
        this.empDept = empDept;
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empDept, employee.empDept);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(empName, empDept, empId);
//    }

    //    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
}
