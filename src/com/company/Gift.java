package com.company;

public class Gift {
    private String gift;
    private String gender;
    private String price;

    public Gift(){

    }

    public Gift(String gift, String gender, String price) {
        this.gift = gift;
        this.gender = gender;
        this.price = price;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "gift='" + gift +
                '}';
    }
}
