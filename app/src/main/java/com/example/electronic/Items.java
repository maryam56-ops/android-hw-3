package com.example.electronic;

public class Items {


    private String itemname;
    private int itemimage;

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemimage() {
        return itemimage;
    }

    public void setItemimage(int itemimage) {
        this.itemimage = itemimage;
    }


    public Items(String itemname, int itemimage) {
        this.itemname = itemname;
        this.itemimage = itemimage;
    }
}
