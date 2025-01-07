package co.pragra.learning.first_spring_proj.dec22;


import java.util.Objects;

public class Employee {
    String empName;
    String empDept;
    int empId;

    PhoneNumber phoneNumber;

//    String value;


//    public Employee(String empName, String empDept, int empId) {
//        this.empName = empName;
//        this.empDept = empDept;
//        this.empId = empId;
//    }

//    public Employee(String value) {
//        this.value = value;
//    }

    public Employee(String empName, String empDept, int empId, PhoneNumber phoneNumber) {
        this.empName = empName;
        this.empDept = empDept;
        this.empId = empId;
        this.phoneNumber = phoneNumber;
    }

    public Employee(String empName, String empDept, int empId) {
        this.empName = empName;
        this.empDept = empDept;
        this.empId = empId;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empDept, employee.empDept);
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empName='" + empName + '\'' +
//                ", empDept='" + empDept + '\'' +
//                ", empId=" + empId +
//                '}';
//    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

//    public void setEmpDept(String empDept) {
//        this.empDept = empDept;
//    }

    public int getEmpId() {
        return empId;
    }

    public PhoneNumber getPhoneNumber() {
        PhoneNumber ph1 = new PhoneNumber(phoneNumber.phNumber);
//        return phoneNumber;
        return ph1;
    }


//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }

//    public void show() {
//        System.out.println("this is parent class show method");
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(empName, employee.empName) && Objects.equals(empDept, employee.empDept) && Objects.equals(phoneNumber, employee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empDept, empId, phoneNumber);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", empId=" + empId +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
