package util;

import java.util.List;
import model.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ALPS
 */
public class Print {

    public Print() {

    }

    public void printStudent(List<Student> list) {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-12s | %-20s | %-12s | %-12s | %-12s%n", "Student ID", "Name", "Phone", "Peak Code", "Fee");
        System.out.println("----------------------------------------------------------------------------------");
        for (Student s : list) {
            System.out.printf("%-12s | %-20s | %-12s | %-12s | %-12s%n", s.getId(), s.getName(), s.getPhoneNumber(), s.getMountCode(), s.getFee());
        }
        System.out.println("----------------------------------------------------------------------------------");

    }

    public void printSingle(Student s) {
        System.out.println("----------------------------------------------------------------------------------");

        System.out.printf("%-12s : %s", "Student ID", s.getId());
        System.out.printf("%n%-12s : %s", "Name", s.getName());
        System.out.printf("%n%-12s : %s", "Phone", s.getPhoneNumber());
        System.out.printf("%n%-12s : %s", "Mountain ", s.getMountCode());
        System.out.printf("%n%-12s : %.2f%n", "Fee ", s.getFee());
        System.out.println("----------------------------------------------------------------------------------");

    }
}
