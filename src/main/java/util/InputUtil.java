/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ALPS
 */
public class InputUtil {

    Scanner sc = new Scanner(System.in);

    public InputUtil() {

    }

    public int intInput(String mes, int min, int max) {
        int number = -1;

        while (true) {
            try {

                System.out.println("" + mes);
                number = sc.nextInt();
                sc.nextLine();

                if (number < min || number > max) {
                    System.out.println("PLEASE ENTER A CHOICE (1 - 9).");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("PLEASE ENTER AN INTEGER NUMBER.");
                sc.nextLine();
            }
        }
        return number;

    }

    public String studentIdInput(String mes) {
        String str;

        while (true) {
            System.out.println("" + mes);
            str = sc.nextLine();

            if (str.length() != 8) {
                System.out.println("ID must have 8 characters.");
            } else if (!str.matches("(SE|HE|DE|QE|CE)\\d{6}")) {
                System.out.println("ID must start with SE, HE, DE, QE, CE and contain 6 numbers.");
            } // if xu li id da co
            else {
                return str;
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
        NetworkOperater check = new NetworkOperater();

        while (true) {
            System.out.println("" + mes);
            phone = sc.nextLine();
            sc.nextLine();

            if (phone.length() != 10) {
                System.out.println("Phone numbers must contain 10 numbers.");
            } else if (!check.isVnNetwork(phone)) {
                System.out.println("Invalid phone numbers.");
            } else {
                return phone;
            }
        }
    }

}
