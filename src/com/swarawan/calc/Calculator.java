package com.swarawan.calc;

/**
 * Created by rioswarawan on 8/25/17.
 */
public class Calculator {
    private int total;
    private String color;
    private String merk;
    private int harga;

    // Constructor, nama sama dengan nama kelas
    // dipanggil pertama kali ketika OBJECT dibuat
    public Calculator(String warna, String merk) {
        color = warna;
        this.merk = merk;
    }

    public void printAtribut() {
        System.out.println("Warna kalkulator : " + color);
        System.out.println("Merk kalkulator : " + merk);
        System.out.println("Total : " + total);
        System.out.println("Harga : " + harga);
    }

    // buat method setter dan getter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
