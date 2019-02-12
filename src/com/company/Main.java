package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Gift> gifts = new ArrayList<Gift>();
        gifts.add(new Gift("Jewelery", "female", "High"));
        gifts.add(new Gift("weekend Gateway", "female", "high"));
        gifts.add(new Gift("Selfie stick", "female", "low"));
        gifts.add(new Gift("Wine bottle", "female", "low"));
        gifts.add(new Gift("Perfume", "female", "medium"));
        gifts.add(new Gift("sweater", "female", "medium"));
        gifts.add(new Gift("Smart tv", "male", "high"));
        gifts.add(new Gift("Apple watch", "male", "high"));
        gifts.add(new Gift("Book", "male", "low"));
        gifts.add(new Gift("shoe", "male", "low"));
        gifts.add(new Gift("Guitar", "male", "medium"));
        gifts.add(new Gift("play station", "male", "medium"));


        System.out.println("enter gender");
        String gender = sc.nextLine();
        System.out.println("enter price");
        String price = sc.nextLine();

        if (gender.equalsIgnoreCase("female") && (price.equalsIgnoreCase("high"))) {
            System.out.println(gifts.get(0));
            System.out.println(gifts.get(1));
        } else if (gender.equalsIgnoreCase("Female") && (price.equalsIgnoreCase("low"))) {
            System.out.println(gifts.get(2));
            System.out.println(gifts.get(3));
        } else if (gender.equalsIgnoreCase("female") && (price.equalsIgnoreCase("medium"))) {
            System.out.println(gifts.get(4));
            System.out.println(gifts.get(5));
        } else if (gender.equalsIgnoreCase("male") && (price.equalsIgnoreCase("high"))) {
            System.out.println(gifts.get(6));
            System.out.println(gifts.get(7));
        } else if (gender.equalsIgnoreCase("male") && (price.equalsIgnoreCase("low"))) {
            System.out.println(gifts.get(8));
            System.out.println(gifts.get(9));

        } else if (gender.equalsIgnoreCase("male") && (price.equalsIgnoreCase("medium"))) {
            System.out.println(gifts.get(10));
            System.out.println(gifts.get(11));


        }
    }
}
