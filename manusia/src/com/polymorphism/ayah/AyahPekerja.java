package com.polymorphism.ayah;

public class AyahPekerja extends Ayah {
    private String perusahaan;
    private String jabatan;

    public AyahPekerja(String nama, int umur, String alamat, String jenisKelamin,
            int jumlahAnak, String kendaraan,
            String perusahaan, String jabatan) {
        super(nama, umur, alamat, jenisKelamin, jumlahAnak, kendaraan);
        this.perusahaan = perusahaan;
        this.jabatan = jabatan;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja sebagai " + jabatan + " di " + perusahaan + ".");
    }

    public void rapat() {
        System.out.println(nama + " sedang mengikuti rapat di " + perusahaan + ".");
    }

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Pekerjaan : " + jabatan);
        System.out.println("Perusahaan : " + perusahaan);
    }
}