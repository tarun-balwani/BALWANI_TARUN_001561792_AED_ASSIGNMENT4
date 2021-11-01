/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tarunbalwani
 */
public class Encounter {
    
    private int encounterNo;
    private int encPatientId;
    private ArrayList<VitalSign> vitalSignList;

    public int getEncPatientId() {
        return encPatientId;
    }

    public void setEncPatientId(int encPatientId) {
        this.encPatientId = encPatientId;
    }
    
    public Encounter(){
    vitalSignList = new ArrayList<>();
    }

    public int getEncounterNo() {
        return encounterNo;
    }

    public void setEncounterNo(int encounterNo) {
        this.encounterNo = encounterNo;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public void addVitalSign(VitalSign vitalSign){
    this.vitalSignList.add(vitalSign);
            }
    
    
}
