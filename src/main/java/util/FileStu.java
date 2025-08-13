/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ALPS
 */
public class FileStu {

    public FileStu() {

    }

    /*
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
        }

        return list;
    }
     */
    public List<Student> fileDatReader(String str) {
        List<Student> list = new ArrayList<>();

        try ( DataInputStream dis = new DataInputStream(new FileInputStream("data/registration.dat"))) {
            while (dis.available() > 0) {
                String id = dis.readUTF();
                String name = dis.readUTF();
                String phone = dis.readUTF();
                String email = dis.readUTF();
                String mountCode = dis.readUTF();
                double fee = dis.readDouble();

                Student s = new Student();
                s.setId(id);
                s.setName(name);
                s.setPhoneNumber(phone);
                s.setEmail(email);
                s.setMountCode(mountCode);
                s.setFee(fee);
                list.add(s);
            }
        } catch (IOException e) {
            System.out.println("Can't open file " + e.getMessage());
        }

        return list;
    }


    /*
    public void saveFile(List<Student> students) {
        try {
            File dir = new File("data");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            try ( BufferedWriter bw = new BufferedWriter(new FileWriter("data/temp.csv"))) {

                for (Student s : students) {
                    bw.write(s.getId() + "," + s.getName() + "," + s.getPhoneNumber() + "," + s.getEmail() + "," + s.getMountCode() + "," + s.getFee() + "\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Can't write into temp file: " + e.getMessage());
        }

        File temp = new File("data/temp.csv");
        File rename = new File("data/Students.csv");
        if (rename.exists()) {
            rename.delete();
        }
        boolean flag = temp.renameTo(rename);

        if (flag) {
            System.out.println("Save successfully in Students.csv.");

        } else {
            System.out.println("Can't save file.");

        }

    }
     */
    public void saveDatFile(List<Student> students) {
        try {
            File dir = new File("data");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            try ( DataOutputStream dos = new DataOutputStream(new FileOutputStream("data/temp.dat"))) {
                for (Student s : students) {
                    dos.writeUTF(s.getId());
                    dos.writeUTF(s.getName());
                    dos.writeUTF(s.getPhoneNumber());
                    dos.writeUTF(s.getEmail());
                    dos.writeUTF(s.getMountCode());
                    dos.writeDouble(s.getFee());
                }
            }
        } catch (IOException e) {
            System.out.println("Can't write into temp file: " + e.getMessage());
        }

        File temp = new File("data/temp.dat");
        File rename = new File("data/registration.dat");
        if (rename.exists()) {
            rename.delete();
        }
        boolean flag = temp.renameTo(rename);

        if (flag) {
            System.out.println("Save successfully in registration.dat.");

        } else {
            System.out.println("Can't save file.");

        }

    }
}
