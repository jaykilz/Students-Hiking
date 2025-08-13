/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import service.NetworkOperater;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author ALPS
 */
public class ValidateData {

    public ValidateData() {

    }
    Scanner sc = new Scanner(System.in);

    public boolean validateChoice(int choice, int min, int max) {

        if (choice < min || choice > max) {
            System.out.println("Please enter a valid choice (1 - 9).");
            return false;
        } else {
            return true;
        }
    }

    public boolean validateId(String id, List<Student> list) {
        SearchUtil sr = new SearchUtil();
        if (id.length() != 8) {
            System.out.println("ID must have 8 characters.");
            return false;

        } else if (!id.matches("(SE|HE|DE|QE|CE)\\d{6}")) {
            System.out.println("ID must start with SE, HE, DE, QE, CE and contain 6 numbers.");
            return false;

        } else if (sr.hasId(id, list)) {
            System.out.println("ID has existed. Please enter another.");
            return false;

        } else {
            return true;
        }
    }

    public boolean validateName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name must be entered.");
            return false;

        } else if (name.length() < 2 || name.length() > 20) {
            System.out.println("Name must be between 2 to 20 characters.");
            return false;

        } else {
            return true;
        }
    }

    public boolean validatePhone(String phone) {
        NetworkOperater check = new NetworkOperater();
        if (phone.length() != 10) {
            System.out.println("Phone numbers must contain 10 numbers.");
            return false;

        } else if (!check.isVnNetwork(phone)) {
            System.out.println("Invalid phone numbers.");
            return false;

        } else {
            return true;
        }
    }

    public boolean validateEmail(String email) {
        if (email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return true;
        } else {
            System.out.println("Invalid email. Enter again.");
            return false;
        }
    }

    public boolean validateMountCode(String code) {
        if (code.matches("(MT01|MT02|MT03|MT04|MT05|MT06|MT07)")) {
            return true;
        } else {
            System.out.println("Invalid Mountain Code.");
            return false;
        }
    }

    public boolean validateIdInList(String id, List<Student> list) {
        SearchUtil sr = new SearchUtil();
        if (id.length() != 8) {
            System.out.println("ID must have 8 characters.");
            return false;

        } else if (!id.matches("(SE|HE|DE|QE|CE)\\d{6}")) {
            System.out.println("ID must start with SE, HE, DE, QE, CE and contain 6 numbers.");
            return false;

        } else {
            return true;
        }
    }
}
