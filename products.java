package com.task1.files;

public class products {
    public static void main(String[] args){
        cars mercedes = new cars();
        mercedes.getColor("green");
        mercedes.getModel("AMG");
        mercedes.getPrice("$100K");

        cars byd = new cars();
        byd.getColor("white");
        byd.getModel("song plus");
        byd.getPrice("$3K");
    }

}
