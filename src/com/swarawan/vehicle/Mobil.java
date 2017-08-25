package com.swarawan.vehicle;

/**
 * Created by rioswarawan on 8/25/17.
 */
public class Mobil extends Kendaraan {

    boolean bisaTerbang;

    public Mobil() {
        super("Sedan", false);
        super.bisaTerbang = true;
    }

    public void terbang() {
        if (super.bisaTerbang) {
            System.out.println(super.jenis + " bisa terbang");
        } else {
            System.out.println(super.jenis + " tidak bisa terbang");
        }
    }
}
