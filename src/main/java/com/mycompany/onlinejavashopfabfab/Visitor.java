/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.onlinejavashopfabfab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Isaac
 */
public class Visitor {

    public String id;

    final ArrayList<String> listItemsBasket = new ArrayList<>();

    public List<String> getListItemsBasket() {
        return listItemsBasket;
    }

   
    public List<String> getWatchListItem() {
        return watchListItem;
    }

    public void setWatchListItem(List<String> watchListItem) {
        this.watchListItem = watchListItem;
    }

    public List<String> watchListItem=new ArrayList<>();;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void add(String article) {
        this.getListItemsBasket().add(article);
    }
       public void addWatch(String article) {
        this.getWatchListItem().add(article);
    }
       
}

