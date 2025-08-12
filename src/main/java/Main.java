/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

import controller.Control;
import util.InputUtil;

/**
 *
 * @author ALPS
 */
public class Main {

    public static void main(String[] args) {
        int choice;
        InputUtil input = new InputUtil();
        Control ctr = new Control();

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

            choice = input.intInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    ctr.add();
                    break;
                case 2:
                    ctr.update();
                    break;
                case 3:
                    ctr.display();
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
                    System.exit(0);
            }
        } while (choice != 9);
    }
}
