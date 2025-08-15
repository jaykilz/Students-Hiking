/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ALPS
 */
public class Mountain {

    public Mountain() {

    }

    private String mountCode;
    private long numberOfRegistraters;
    private Double sumOfFee;

    public String getMountCode() {
        return mountCode;
    }

    public long getNumberOfRegistraters() {
        return numberOfRegistraters;
    }

    public Double getSumOfFee() {
        return sumOfFee;
    }

    public void setMountCode(String mountCode) {
        this.mountCode = mountCode;
    }

    public void setNumberOfRegistraters(long numberOfRegistraters) {
        this.numberOfRegistraters = numberOfRegistraters;
    }

    public void setSumOfFee(Double sumOfFee) {
        this.sumOfFee = sumOfFee;
    }

    public void increaseNumberOfRegistraters(long numberOfRegistraters) {
        this.numberOfRegistraters += numberOfRegistraters;
    }

    public void increaseSumOfFee(Double sumOfFee) {
        this.sumOfFee += sumOfFee;
    }
}
