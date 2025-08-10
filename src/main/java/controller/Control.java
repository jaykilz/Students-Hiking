/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import util.InputUtil;
import service.StudentManager;

/**
 *
 * @author ALPS
 */
public class Control {

    private StudentManager students = new StudentManager();

    public Control() {

    }

    public void add() {
        Student stu = new Student();
        InputUtil input = new InputUtil();

// nhap input
        stu.setId(input.studentIdInput("Enter an id:"));
        stu.setName(input.studentName("Entter student's name:"));
        stu.setPhoneNumber(input.studentPhone("Enter student's phone numbers:"));
        stu.setEmail(input.studentEmail("Enter student's email: "));
        stu.setMountCode(input.studentMountCode("Enter mount code:"));
        stu.setFee(input.fee(stu.getPhoneNumber()));

// luu vao array list
        students.studentAdd(stu);
    }
}
