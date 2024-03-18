package BaitapVeNhaTongHop.business.implement;

import BaitapVeNhaTongHop.business.config.InputMethods;
import BaitapVeNhaTongHop.business.design.Fuction;
import BaitapVeNhaTongHop.business.entity.Employee;

public class EmployeeImplement implements Fuction {
    private static Employee[] employees =new Employee[100];
    private int length = 0;
    @Override
    public void add() {
        if (length==100){
            System.out.println("mảng đầy");
        }else {
            byte number = InputMethods.getNumberEmployee();
            for (int i = 0; i < number; i++) {
                Employee newEmployee = new Employee();
                newEmployee.inputDataEmployee();
                employees[length++] = newEmployee;
            }
        }
    }

    @Override
    public void display() {
        if (length==0){
            System.out.println("Mảng rỗng");
        }else {
            for (int i = 0; i < length; i++) {
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public void displayId() {
        System.out.println("Nhập mã nhân viên bạn muốn xem ");
        byte searchId =InputMethods.getByte();
        for (int i = 0; i < length; i++) {
            if (employees[i].employeeId==searchId){
                System.out.println(employees[i]);
            }
        }
    }


    @Override
    public void edit() {
        System.out.println("Nhập mã nhân viên bạn muốn sửa");
        byte idEdit = InputMethods.getByte();
        for (int i = 0; i < length; i++) {
            if (employees[i].employeeId == idEdit){
                employees[i].inputDataEmployee();
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã nhân viên bạn muốn xóa");
        byte idDelete = InputMethods.getByte();
        int index=-1;

        for (int i = 0; i < length; i++) {
            if (employees[i].employeeId==idDelete){
                index=i;
            }
        }
        if (index!=-1){
            for (int i = index; i < length-1; i++) {
                employees[i]=employees[i+1];
            }
            --length;
            System.out.println("Đã xóa nhân viên có mã "+ idDelete);
        }else {
            System.out.println("Ko có mà xóa");
        }
    }

    @Override
    public void searchName() {
        System.out.println("Nhập tên nhân vien muon tim");
        String search = InputMethods.getString();
        for (int i = 0; i < length; i++) {
            if (employees[i].getEmployeeName().contains(search)){
                System.out.println(employees[i]);
            }
        }
    }

    @Override
    public void sortAZ() {
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if (employees[i].getEmployeeName().compareTo(employees[j].getEmployeeName())>0){
                    Employee temp = employees[i];
                    employees[i]=employees[j];
                    employees[j]=temp;
                }
            }
        }
    }
}
