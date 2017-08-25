package com.swarawan.calc;

/**
 * Created by rioswarawan on 8/25/17.
 */
public class RunCalc {

    public static void main(String[] args) {
        // Instansiasi
        Calculator casio = new Calculator("Biru", "Casio");
        System.out.println("Warna kalkulator saya : "
                + casio.getColor());

        casio.setColor("Hijau");
    }
}
