package com.example.stapp;

public class MyCartListData {
    String productimg,productname,brand,price;

    public MyCartListData(String productimg, String productname, String brand, String price) {
        this.productimg = productimg;
        this.productname = productname;
        this.brand = brand;
        this.price = price;
    }

    public String getProductimg() {
        return productimg;
    }

    public void setProductimg(String productimg) {
        this.productimg = productimg;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
