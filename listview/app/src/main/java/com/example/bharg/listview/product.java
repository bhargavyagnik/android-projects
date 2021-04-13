package com.example.bharg.listview;

public class product {
    private String title;
    private String desc;
    private String type;
    private double price;
    private boolean sale;

    public product(String title, String desc, String type, double price, boolean sale) {
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.price = price;
        this.sale = sale;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean getSale() {
        return sale;
    }
}
