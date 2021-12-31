package com.example.stapp;

public class ProductListData {
    String pimage,pname,pbrand,block,rack,pprice;

    public ProductListData(String pimage,String pname,String pbrand,String pprice,String block,String rack) {
        this.pimage = pimage;
        this.pname=pname;
        this.pbrand=pbrand;
        this.block=block;
        this.rack=rack;
        this.pprice=pprice;
    }

    public String getPimage() {

        return pimage;
    }

    public void setPimage(String pimage) {

        this.pimage = pimage;
    }

    public String getPname() {

        return pname;
    }

    public void setPname(String pname) {

        this.pname = pname;
    }

    public String getPbrand() {

        return pbrand;
    }

    public void setPbrand(String pbrand) {

        this.pbrand = pbrand;
    }

    public String getBlock() {

        return block;
    }

    public void setBlock(String block) {

        this.block = block;
    }

    public String getRack() {

        return rack;
    }

    public void setRack(String rack) {

        this.rack = rack;
    }

    public String getPprice() {

        return pprice;
    }

    public void setPprice(String pprice) {

        this.pprice = pprice;
    }
}
