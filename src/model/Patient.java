/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tarunbalwani
 */
public class Patient {
    private int patientId;
    private String patFname;
    private String patLame;
    private int patAge;
    private String patCommunity;
    private String patCity;
    private int patHouse;

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatFname() {
        return patFname;
    }

    public void setPatFname(String patFname) {
        this.patFname = patFname;
    }

    public String getPatLame() {
        return patLame;
    }

    public void setPatLame(String patLame) {
        this.patLame = patLame;
    }

    public int getPatAge() {
        return patAge;
    }

    public void setPatAge(int patAge) {
        this.patAge = patAge;
    }

    public String getPatCommunity() {
        return patCommunity;
    }

    public void setPatCommunity(String patCommunity) {
        this.patCommunity = patCommunity;
    }

    public String getPatCity() {
        return patCity;
    }

    public void setPatCity(String patCity) {
        this.patCity = patCity;
    }

    public int getPatHouse() {
        return patHouse;
    }

    public void setPatHouse(int patHouse) {
        this.patHouse = patHouse;
    }
    @Override
    public String toString(){
        return String.valueOf(patientId);
    }
    
    
    
}
