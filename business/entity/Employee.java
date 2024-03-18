package BaitapVeNhaTongHop.business.entity;

import BaitapVeNhaTongHop.business.config.InputMethods;

import javax.xml.crypto.Data;
import java.util.Date;

public class Employee {
    public static int nextIdEmployee = 0;

    public int employeeId=0;
    private String employeeName;

    private Date birthday;
    private String address;
    private String phone;
    private Double salary;
    private Double kpi;

    public Employee(String employeeName, Date birthday, String address, String phone, Double salary, Double kpi) {
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.salary = salary;
        this.kpi = kpi;
    }

    public Employee() {
        this.employeeId = ++nextIdEmployee;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getsalary() {
        return salary;
    }

    public void setsalary(Double salary) {
        this.salary = salary;
    }

    public Double getKpi() {
        return kpi;
    }

    public void setKpi(Double kpi) {
        this.kpi = kpi;
    }
    public void inputDataEmployee(){
       this.employeeName = InputMethods.getNameEmployee();
       this.birthday =  InputMethods.getBirthEmployee();
       this.address= InputMethods.getAddressEmployee();
       this.phone = InputMethods.getPhoneEmployee();
       this.salary= InputMethods.getSalaryEmployee();
       this.kpi = InputMethods.getKPIEmployee();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", kpi=" + kpi +
                '}';
    }

}
