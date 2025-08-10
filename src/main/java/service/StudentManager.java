/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import util.File;

/**
 *
 * @author ALPS
 */
public class StudentManager {

    private List<Student> students = new ArrayList<>();
    File file = new File();

    public StudentManager() {
        students = file.fileStuReader("Students.csv");
    }

    public void studentAdd(Student student) {
        students.add(student);
        file.saveFile(students);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
