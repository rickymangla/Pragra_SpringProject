//package co.pragra.learning.first_spring_proj.dec22;
//
//import java.util.Objects;
//
//public class EmployeeNew extends Employee {
//
//    String empStatus;
// //   int empId;
//
////    public EmployeeNew(String empName, String empDept, int empId, String empStatus) {
////        super(empName, empDept, empId);
////        this.empStatus=empStatus;
////     //   this.empId=empId;
////    }
//
//
//    public EmployeeNew(String empName, String empDept, int empId, PhoneNumber phoneNumber, String empStatus) {
//        super(empName, empDept, empId, phoneNumber);
//        this.empStatus = empStatus;
//    }
//
////    @Override
////    public String toString() {
////        return "EmployeeNew{" +
////                "empStatus='" + empStatus + '\'' +
////                ", empName='" + empName + '\'' +
////                ", empDept='" + empDept + '\'' +
////                ", empId=" + empId +
////                '}';
////    }
//
//    @Override
//    public String toString() {
//        return "EmployeeNew{" +
//                "empStatus='" + empStatus + '\'' +
//                ", empName='" + empName + '\'' +
//                ", empDept='" + empDept + '\'' +
//                ", empId=" + empId +
//                ", phoneNumber=" + phoneNumber +
//                '}';
//    }
//
//
////    @Override
////    public void setEmpId(int empId) {
////        this.empId = empId;
////    }
//
//    public void setEmpStatus(String empStatus) {
//        this.empStatus = empStatus;
//    }
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (!super.equals(o)) return false;
//        EmployeeNew that = (EmployeeNew) o;
//        return Objects.equals(empStatus, that.empStatus);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), empStatus);
//    }
//
////    public void show() {
////        System.out.println("this is child class show method");
////    }
//
//}
