/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputTest;

import model.Student;
import util.Print;

/**
 *
 * @author ALPS
 */
public class TestPrint {

    public static void main(String[] args) {
        Student s = new Student();
        s.setId("SE204952");
        s.setName("Duy Khiem");
        s.setEmail("laiduykhanh@gmail.com");
        s.setMountCode("3");
        s.setPhoneNumber("0783290702");
        s.setFee(6000000);

        Print p = new Print();
        p.printSingle(s);
    }
}
