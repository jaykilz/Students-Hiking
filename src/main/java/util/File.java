/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author ALPS
 */
public class File {

    public File() {

    }

    public List<Student> fileStuReader(String str) {

        List<Student> list = new ArrayList<>();
        String line;
        try ( BufferedReader br = new BufferedReader(new FileReader(str))) {
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) { // trong thi bo qua
                    continue;
                }

                String[] values = line.split(",");
                if (values.length < 6) { // du lieu luu sai dinh dang
                    System.out.println("Error in line: " + line);
                    continue;
                }

                String id = values[0];
                String name = values[1];
                String phoneNumber = values[2];
                String email = values[3];
                String mountCode = values[4];
                double fee = Double.parseDouble(values[5]);

                list.add(new Student(id, name, phoneNumber, email, mountCode, fee));
            }
        } catch (IOException e) {
            System.out.println("Can't open file " + e.getMessage());
            System.exit(-1);

        }

        return list;
    }

    public void saveFile(List<Student> students) {
        try ( FileWriter writer = new FileWriter("data/Students.csv")) {
            for (Student s : students) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getPhoneNumber() + "," + s.getEmail() + "," + s.getMountCode() + "," + s.getFee() + "\n");
            }
            System.out.println("Save successfully in Students.csv");
        } catch (IOException e) {
            System.out.println("Can't save into file " + e.getMessage());
            System.exit(-1);
        }
    }
}
