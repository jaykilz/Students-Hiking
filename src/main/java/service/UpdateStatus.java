/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import java.util.Scanner;
import util.ValidateData;
import model.Student;

/**
 *
 * @author ALPS
 */
public class UpdateStatus {

    Scanner sc = new Scanner(System.in);
    ValidateData vld = new ValidateData();

    public UpdateStatus() {

    }

    public boolean checkIdForUpdate(String targetId, List<Student> list) {
        return vld.validateIdInList(targetId, list);
    }

    public String updateName(String mes) {
        while (true) {
            System.out.println("" + mes);
            String newName = sc.nextLine();
            //sc.nextLine();

            if (newName.isEmpty()) {
                return newName;

            } else if (vld.validateName(newName)) {
                return newName;
            }
        }
    }

    public String updatePhone(String mes) {
        while (true) {
            System.out.println("" + mes);
            String newPhone = sc.nextLine();
            //sc.nextLine();

            if (newPhone.isEmpty()) {
                return newPhone;

            } else if (vld.validatePhone(newPhone)) {
                return newPhone;
            }
        }
    }

    public String updateEmail(String mes) {
        while (true) {
            System.out.println("" + mes);
            String newMail = sc.nextLine();
            //sc.nextLine();

            if (newMail.isEmpty()) {
                return newMail;

            } else if (vld.validateEmail(newMail)) {
                return newMail;
            }
        }
    }

    public String updateMount(String mes) {
        while (true) {
            System.out.println("" + mes);
            String newMount = sc.nextLine();
            //sc.nextLine();

            if (newMount.isEmpty()) {
                return newMount;

            } else if (vld.validateMountCode(newMount)) {
                return newMount;
            }
        }
    }

}
