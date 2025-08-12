/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
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
        Student s = new Student();
        students.addNewStudent(s);

    }

    public void update() {

    }
}
