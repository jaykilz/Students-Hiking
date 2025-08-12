/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Student;
import util.FileStu;
import util.InputUtil;
import util.Print;
import util.Recevie;
import util.SearchUtil;

/**
 *
 * @author ALPS
 */
public class StudentManager {

    private List<Student> students = new ArrayList<>();
    FileStu file = new FileStu();

    public StudentManager() {
        try {
            students = file.fileStuReader("data/Students.csv");
        } catch (Exception e) {
            System.out.println("Errors");
        }
    }

    public void addNewStudent(Student student) {
        Student s = new Student();
        InputUtil input = new InputUtil();
        s.setId(input.studentIdInput("Enter student's ID: ", students));
        s.setName(input.studentName("Enter student's name: "));
        s.setPhoneNumber(input.studentPhone("Enter student's phone number: "));
        s.setEmail(input.studentEmail("Enter student's email: "));
        s.setMountCode(input.studentMountCode("Enter an mountain code: "));
        s.setFee(input.fee(s.getPhoneNumber()));
        
        students.add(s);
        file.saveFile(students);
    }

    public void changeInfoStu() {
        SearchUtil sr = new SearchUtil();
        Recevie rv = new Recevie();
        Print p = new Print();

        String targetId = rv.receiveString("Enter student's ID needing to change: ");

        if (sr.hasId(targetId, students)) {
            p.printSingle(sr.searchById(targetId, students));

        }
    }

    public List<Student> getStudents() {
        return students;
    }

}
