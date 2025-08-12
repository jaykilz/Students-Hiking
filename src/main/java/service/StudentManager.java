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
import util.ValidateData;

/**
 *
 * @author ALPS
 */
public class StudentManager {

    private List<Student> students = new ArrayList<>();
    FileStu file = new FileStu();

    SearchUtil sr = new SearchUtil();
    UpdateStatus up = new UpdateStatus();
    Recevie rv = new Recevie();
    Print p = new Print();

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

        String targetId;
        while (true) {
            targetId = rv.receiveString("Enter student's ID needing to change: ");

            if (up.checkIdForUpdate(targetId, students)) {
                break;
            }
        }

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

            students.set(students.indexOf(updateStudent), updateStudent); // ghi de vao array list
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

    public void deleteStudent(Student deleteStudent) {
        String targetId;
        while (true) {
            targetId = rv.receiveString("Enter student's ID needing to delete: ");

            if (up.checkIdForUpdate(targetId, students)) {
                break;
            }
        }
        if (sr.hasId(targetId, students)) {

            deleteStudent = sr.searchById(targetId, students);
            p.printSingle(deleteStudent);

            while (true) {
                String choice = rv.receiveString("Are you sure you want to delete this registration? (Y/N): ");
                if (choice.matches("Y|y")) {
                    students.remove(students.indexOf(deleteStudent));
                    file.saveFile(students);
                    System.out.println("Delete successfully.");
                    break;
                } else if (choice.matches("N|n")) {
                    System.out.println("Delete unsuccessfully.");
                    break;
                }
            }
        }
    }

    public void searchName() {
        String findName = rv.receiveString("Enter student's name to find: ");

        List<Student> studentsFound = sr.searchByName(findName, students);

        if (studentsFound.isEmpty()) {
            System.out.println("No one matches the search criteria!");
        } else {
            p.printStudent(studentsFound);
        }

    }

    public void filterCampus() {
        String campus;
        while (true) {
            campus = rv.receiveString("Enter code of campus (e.g., CE, DE, HE, SE, QE) :");
            if (campus.matches("CE|DE|HE|SE|QE")) {
                break;
            }
        }

        List<Student> sameCampus = sr.filterCampus(campus, students);

        if (sameCampus.isEmpty()) {
            System.out.println("No students have registered under this campus.");
        } else {
            p.printStudent(sameCampus);
        }

    }

    public List<Student> getStudents() {
        return students;
    }

}
