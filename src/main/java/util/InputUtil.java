/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author ALPS
 */
public class InputUtil {

    Scanner sc = new Scanner(System.in);
    ValidateData vld = new ValidateData();

    public InputUtil() {

    }

    public int intInput(String mes) {
        int number = -1;
        while (true) {
            try {

                System.out.println("" + mes);
                number = sc.nextInt();
                sc.nextLine();

                if (vld.validateChoice(number, 1, 9)) {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("PLEASE ENTER AN INTEGER NUMBER.");
                sc.nextLine();
            }
        }
        return number;

    }

    public String studentIdInput(String mes, List<Student> list) {
        String id;

        while (true) {
            System.out.println("" + mes);
            id = sc.nextLine();

            if (vld.validateId(id, list)) {
                return id;
            }
        }
    }

    public String studentName(String mes) {
        String str;

        while (true) {
            System.out.println("" + mes);
            str = sc.nextLine();
            sc.nextLine();

            if (str.isEmpty()) {
                System.out.println("Name must be entered.");
            } else if (str.length() < 2 || str.length() > 20) {
                System.out.println("Name must be between 2 to 20 characters.");
            } else {
                return str;
            }

        }
    }

    public String studentPhone(String mes) {
        String phone;

        while (true) {
            System.out.println("" + mes);
            phone = sc.nextLine();
            sc.nextLine();

            if (vld.validatePhone(phone)) {
                return phone;
            }
        }
    }

    public String studentEmail(String mes) {
        String str;

        while (true) {
            System.out.println("" + mes);
            str = sc.nextLine();
            sc.nextLine();

            if (vld.validateEmail(str)) {
                return str;
            }
        }
    }

    public String studentMountCode(String mes) {
        String str;
        while (true) {
            System.out.println("" + mes);
            str = sc.nextLine();
            sc.nextLine();

            if (vld.validateMountCode(str)) {
                return str;
            }

        }
    }

    public double fee(String phone) {
        NetworkOperater check = new NetworkOperater();

        if (check.isViettelOrVnpt(phone)) {
            return 6000000 * 0.65;
        } else {
            return 6000000;
        }
    }
}
