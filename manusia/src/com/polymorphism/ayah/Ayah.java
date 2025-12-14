package com.polymorphism.ayah;

import com.polymorphism.Manusia;

public class Ayah extends Manusia {
    protected int jumlahAnak;
    protected String kendaraan;

    public Ayah(String nama, int umur, String alamat, String jenisKelamin,
            int jumlahAnak, String kendaraan) {
        super(nama, umur, alamat, jenisKelamin);
        this.jumlahAnak = jumlahAnak;
        this.kendaraan = kendaraan;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja untuk menafkahi keluarga.");
    }

    public void mengasuhAnak() {
        System.out.println(nama + " sedang mengasuh " + jumlahAnak + " anak.");
    }

    public void memperbaikiKendaraan() {
        System.out.println(nama + " sedang memperbaiki " + kendaraan + ".");
    }

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Peran : Ayah");
        System.out.println("Jumlah Anak : " + jumlahAnak);
    }
}