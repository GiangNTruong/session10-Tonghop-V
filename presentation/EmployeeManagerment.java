package BaitapVeNhaTongHop.presentation;

import BaitapVeNhaTongHop.business.config.InputMethods;
import BaitapVeNhaTongHop.business.design.Fuction;
import BaitapVeNhaTongHop.business.implement.EmployeeImplement;

public class EmployeeManagerment {
    public static Fuction EmployeeImplement = new EmployeeImplement();

    public static void main(String[] args) {
        while (true){
            System.out.println("*********************MENU********************** \n" +
                    "1.\tThêm mới 1 nhân viên \n" +
                    "2.\tHiển thị danh sách thông tin nhân viên \n" +
                    "3.\tXem thông tin nhân viên theo mã nhân viên\n" +
                    "4.\tCập nhật thông tin nhân viên\n" +
                    "5.\tXóa nhân viên\n" +
                    "6.\tTìm kiếm nhân viên theo tên (tương đối)\n" +
                    "7.\tSắp xếp và hiển thị danh sách nhân viên theo tên từ a - z\n" +
                    "8.\tThoát\n");
            byte choice = InputMethods.getByte();
            switch (choice){
                case 1: EmployeeImplement.add();
                break;
                case 2: EmployeeImplement.display();
                break;
                case 3: EmployeeImplement.displayId();
                break;
                case 4:EmployeeImplement.edit();
                break;
                case 5:EmployeeImplement.delete();
                break;
                case 6:EmployeeImplement.searchName();
                break;
                case 7:EmployeeImplement.sortAZ();
                break;
                case 8:System.exit(0);
            }
        }

    }
}
