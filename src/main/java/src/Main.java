/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import java.util.Scanner;

/**
 *
 * @author ALPS
 */
public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("================| Menu |================");
            System.out.println("1. New registration");
            System.out.println("2. Update registration information");
            System.out.println("3. Display registered list");
            System.out.println("4. Delete registration information");
            System.out.println("5. Search participants by name");
            System.out.println("6. Filter data by campus");
            System.out.println("7. Statistics of registration numbers by location");
            System.out.println("8. Save data to file");
            System.out.println("9. Exit the program");
            System.out.println("==========================================");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("add");
                    break;
                case 2:
                    System.out.println("update");
                    break;
                case 3:
                    System.out.println("display");
                    break;
                case 4:
                    System.out.println("delete");
                    break;
                case 5:
                    System.out.println("search");
                    break;
                case 6:
                    System.out.println("filter");
                    break;
                case 7:
                    System.out.println("statistic");
                    break;
                case 8:
                    System.out.println("save");
                    break;
                case 9:
                    System.out.println("close");
                    break;
                default:
                    System.out.println("ERROR");
                    System.exit(0);
            }
        } while (choice != 9);
    }
}
