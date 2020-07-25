package me.shiva;

import me.shiva.sweets.Sweet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class NewYearGift{
    private ArrayList<Sweet> sweets;
    NewYearGift(){
        sweets = new ArrayList<Sweet>();
    }
    public void addSweets(Sweet... sweets){
        this.sweets.addAll(Arrays.asList(sweets));
    }
    public ArrayList<Sweet> getSweets() {
        return sweets;
    }
    public void sort(){
        Collections.sort(sweets);
    }
    public int getTotalPrice(){
        int price = 0;
        for(Sweet s:sweets){
            price+=s.getPrice();
        }
        return price;
    }
}