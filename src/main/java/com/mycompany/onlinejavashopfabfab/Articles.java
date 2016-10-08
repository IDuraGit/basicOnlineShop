/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinejavashopfabfab;

/**
 *
 * @author Isaac
 */
public enum Articles {
    
    SILK(1, "silk","red"), BOBINET(2, "bobinet","red"), BURLAP(3, "burlap","red"), BENARAS(4, "benaras","red"), BATIK(5, "batik","red"), BATISTE(6, "batiste","red"), JUTE(7, "jute","red"), JERSEY(8, "jersey","red"), KNIT(9, "knit","red");

    private int key ;
    private String value;
    private String colour;

    

    public String getColour() {
        return colour;
    }


    Articles(int key, String value,String colour) {
        this.value = value;
        this.key = key;
        this.colour=colour;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   }

