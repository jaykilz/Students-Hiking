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
public class Input {

    Scanner sc = new Scanner(System.in);

    public Input() {

    }

    public double doubleInput() {
        while (true) {
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERROR INPUT");
                sc.nextLine();
            }
        }
    }
}
