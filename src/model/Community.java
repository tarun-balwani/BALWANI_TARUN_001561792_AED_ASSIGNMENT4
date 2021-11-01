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
public class Community {
    private String communityName;
    
    private ArrayList<House> HouseList;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public ArrayList<House> getHouseList() {
        return HouseList;
    }

    public void setHouseList(ArrayList<House> HouseList) {
        this.HouseList = HouseList;
    }
    
    public void addHouse(House house) {
        HouseList.add(house);
    }
    
    
}
