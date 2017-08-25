package com.swarawan.vehicle;

/**
 * Created by rioswarawan on 8/25/17.
 */
public class Kendaraan {

    String jenis;
    String merk;
    String warna;
    String jumlahRoda;
    boolean bisaTerbang;

    public Kendaraan(String jenis) {
        this.jenis = jenis;
    }

    public Kendaraan(String jenis, boolean bisaTerbang){
        this.jenis = jenis;
        this.bisaTerbang = bisaTerbang;
    }

    public void maju() {
        System.out.println(jenis + " berjalan maju");
    }

    public void mundur() {
        System.out.println(jenis + " berjalan mundur");
    }
}
