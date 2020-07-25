package me.shiva;

import me.shiva.sweets.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner io = new Scanner(System.in);
        int choice;
        Sweet s1 = new Chocolate("Temptations",100);
        Sweet s2 = new Chewy("Black Jack",150);
        Sweet s3 = new Fizzy("Fizz Balls",200);
        Sweet s4 = new Sour("Fizzy Tongues",120);
        NewYearGift gift = new NewYearGift();
        gift.addSweets(s1,s2,s3,s4);
        System.out.println("Sorting Sweets According to price.....");
        gift.sort();
        do{
            System.out.println("Enter '1' to view all sweets : ");
            System.out.println("Enter '2' to know most expensive sweets : ");
            System.out.println("Enter '3' to get the total price :");
            choice=io.nextInt();
            switch (choice){
                case 1:{
                    ArrayList<Sweet> arrayList1=gift.getSweets();
                    for (Sweet s:arrayList1){
                        System.out.println(s.toString());
                    }
                    break;
                }
                case 2:{
                    ArrayList<Sweet> arrayList1=gift.getSweets();
                    System.out.println(arrayList1.get(0).toString());
                    break;
                }
                case 3:{
                    System.out.println("Total Price:"+gift.getTotalPrice());
                    break;
                }
            }
        }while(choice<4);
    }
}
