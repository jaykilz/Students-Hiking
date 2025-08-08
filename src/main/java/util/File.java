/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author ALPS
 */
public class File {

    public File() {

    }

    public void fileReader(String str) {

        String line;
        String[] values;
        try ( BufferedReader br = new BufferedReader(new FileReader(str))) {
            while ((line = br.readLine()) != null) {
                values = line.split(",");
            }
        } catch (IOException e) {
            System.out.println("Can't open file" + e.getMessage());
        }
    }
}
