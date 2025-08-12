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
            System.out.println("Errors.");
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

    public void changeInfoStu(Student updateStudent) {

        SearchUtil sr = new SearchUtil();
        UpdateStatus up = new UpdateStatus();
        Recevie rv = new Recevie();
        Print p = new Print();

        String targetId = rv.receiveString("Enter student's ID needing to change: ");

        if (sr.hasId(targetId, students)) {
            updateStudent = sr.searchById(targetId, students);
            p.printSingle(updateStudent);

            String newName = up.updateName("Enter new name:");
            String newPhone = up.updatePhone("Enter new phone number: ");
            String newEmail = up.updateEmail("Enter new email: ");
            String newMount = up.updateMount("Enter new mountain code: ");

            if (!newName.isEmpty()) {
                updateStudent.setName(newName);
            }
            if (!newPhone.isEmpty()) {
                updateStudent.setPhoneNumber(newPhone);
            }
            if (!newEmail.isEmpty()) {
                updateStudent.setEmail(newEmail);
            }
            if (!newMount.isEmpty()) {
                updateStudent.setMountCode(newMount);
            }

            students.set(students.indexOf(updateStudent), updateStudent);
            file.saveFile(students);
            System.out.println("Update successfully.");

        } else {
            System.out.println("This student has not registered yet.");
        }
    }

    public void displayAll() {
        Print p = new Print();
        if (students.isEmpty()) {
            System.out.println("No students have registered yet.");
        } else {
            p.printStudent(students);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

}
