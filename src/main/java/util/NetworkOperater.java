/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ALPS
 */
public class NetworkOperater {

    public String[] viettel = {"032", "033", "034", "035", "036", "037", "038", "039", "086", "096", "097", "098"};
    public String[] vina = {"091", "094", "081", "082", "083", "084", "085", "088"};
    public String[] mobi = {"090", "093", "089", "070", "076", "077", "078", "079"};
    public String[] vietMobile = {"092", "056", "058", "052"};

    public boolean isVnNetwork(String phone) {
        String prefix = phone.substring(0, 3); // 3 so dau tien

        List<String> allVnNetwork = new ArrayList<>();
        allVnNetwork.addAll(Arrays.asList(viettel));
        allVnNetwork.addAll(Arrays.asList(vina));
        allVnNetwork.addAll(Arrays.asList(mobi));
        allVnNetwork.addAll(Arrays.asList(vietMobile));

        return allVnNetwork.contains(prefix);
    }

    public boolean isViettelOrVnpt(String phone) {
        String prefix = phone.substring(0, 3);

        List<String> str = new ArrayList<>();
        str.addAll(Arrays.asList(viettel));
        str.addAll(Arrays.asList(vina));

        return str.contains(prefix);
    }
}
