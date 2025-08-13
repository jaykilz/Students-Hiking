/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import service.StudentManager;
import util.Recevie;

/**
 *
 * @author ALPS
 */
public class Control {

    private StudentManager students = new StudentManager();
    private boolean isModified = false;

    public Control() {

    }

    public void add() {
        Student s = new Student();
        students.addNewStudent(s);
        isModified = true;
    }

    public void update() {
        Student updateStudent = new Student();
        students.changeInfoStu(updateStudent);
        isModified = true;
    }

    public void display() {
        students.displayAll();
    }

    public void delete() {
        Student s = new Student();
        students.deleteStudent(s);
        isModified = true;
    }

    public void searchNames() {
        students.searchName();
    }

    public void filterCampus() {
        students.filterCampus();
    }

    public void statistic() {
        students.statistic();
    }

    public void save() {
        students.saveData();
    }

    public void exit() {
        Recevie rv = new Recevie();
        String choice;
        if (isModified == true) {
            while (true) {
                choice = rv.receiveString("Do you want to save the changes before exiting? (Y/N)");
                if (choice.matches("Y|y")) {
                    save();
                    System.exit(0);
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }
    }
}
