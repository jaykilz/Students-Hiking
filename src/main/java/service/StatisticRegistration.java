/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import model.Mountain;
import model.Student;

/**
 *
 * @author ALPS
 */
public class StatisticRegistration {

    public StatisticRegistration() {

    }

    public List<Mountain> makeMountList(List<Student> stuList) {
        List<Mountain> mountainList = new ArrayList<>();

        for (Student s : stuList) {
            String code = s.getMountCode();
            Mountain existingMountain = null;

            // tim nui co cung code
            for (Mountain m : mountainList) {
                if (m.getMountCode().equals(code)) {
                    existingMountain = m;
                    break;
                }
            }

            if (existingMountain == null) {
                // tao moi neu chua co
                Mountain newMountain = new Mountain();
                newMountain.setMountCode(code);
                newMountain.setNumberOfRegistraters(1);
                newMountain.setSumOfFee(s.getFee());
                mountainList.add(newMountain);
            } else {
                // cap nhap neu ton tai
                existingMountain.increseNumberOfRegistraters(1);
                existingMountain.increseSumOfFee(s.getFee());
            }
        }
        Collections.sort(mountainList, Comparator.comparing(Mountain::getMountCode));

        return mountainList;
    }
}
