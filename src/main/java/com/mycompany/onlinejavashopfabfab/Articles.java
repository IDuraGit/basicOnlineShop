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

    SILK(1, "silk", "red", "Germany"), BOBINET(2, "bobinet", "red", "Japan"), BURLAP(3, "burlap", "red", "Spain"), BENARAS(4, "benaras", "red", "Tunisia"), BATIK(5, "batik", "red", "USA"), BATISTE(6, "batiste", "red", "Bulgaria"), JUTE(7, "jute", "red", "Nepal"), JERSEY(8, "jersey", "red", "Mongolia"), KNIT(9, "knit", "red", "India");

    private int key;
    private String value;
    private String colour;
    private String country;

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    Articles(int key, String value, String colour, String country) {
        this.value = value;
        this.key = key;
        this.colour = colour;
        this.country=country;
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
