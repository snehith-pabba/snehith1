package me.shiva.sweets;

public class Sweet implements Comparable<Sweet>{
    private int price;
    private String name;
    Sweet(String name,int price){
        this.name=name;
        this.price=price;
    }
    public int getPrice(){
        return price;
    }

    @Override
    public int compareTo(Sweet o) {
        if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Name:"+name+"   Price:"+price+"\n";
    }
}