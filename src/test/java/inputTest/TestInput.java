/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputTest;

import model.Student;
import util.InputUtil;

/**
 *
 * @author ALPS
 */
public class TestInput {

    public static void main(String[] args) {
        Student stu = new Student();
        InputUtil input = new InputUtil();

        stu.setId(input.studentIdInput("Enter an id:"));
        System.out.println("" + stu.getId());

        stu.setName(input.studentName("Entter student's name:"));
        System.out.println("" + stu.getName());

        stu.setPhoneNumber(input.studentPhone("Enter student's phone numbers:"));
        System.out.println("" + stu.getPhoneNumber());
    }
}
