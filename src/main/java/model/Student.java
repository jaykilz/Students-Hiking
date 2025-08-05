/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALPS
 */
public class Student {

    private String id;
    private String name;
    private String phoneNumber;
    private String email;
    private String mountCode;
    private double fee;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getMountCode() {
        return mountCode;
    }

    public double getFee() {
        return fee;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMountCode(String mountCode) {
        this.mountCode = mountCode;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
