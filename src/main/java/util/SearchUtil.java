/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author ALPS
 */
public class SearchUtil {

    public SearchUtil() {

    }

    public Student searchById(String targetId, List<Student> list) {

        for (Student stu : list) {
            if (stu.getId().equals(targetId)) {
                return stu;
            }
        }

        return null;

    }

    public boolean hasId(String targetId, List<Student> list) {

        for (Student stu : list) {
            if (stu.getId().equals(targetId)) {
                return true;
            }
        }

        return false;

    }

    public List<Student> searchByName(String targetName, List<Student> list) {
        String[] nameCheck;
        List<Student> studentsFound = new ArrayList<>();
        boolean found = false;

        for (Student stu : list) {
            nameCheck = stu.getName().split(" ");

            if (targetName.equals(stu.getName())) {
                studentsFound.add(stu);
                found = true;
            }
            if (!found) {
                for (String value : nameCheck) {
                    if (value.equals(targetName)) {
                        studentsFound.add(stu);
                        break;
                    }
                }
            }
        }
        return studentsFound;

    }
}
