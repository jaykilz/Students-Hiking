/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ALPS
 */
public class Recevie {

    Scanner sc = new Scanner(System.in);

    public Recevie() {

    }

    public String receiveString(String mes) {

        System.out.println("" + mes);
        return sc.nextLine();

    }
}
