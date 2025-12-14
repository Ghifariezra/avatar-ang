package com.polymorphism;

public class Manusia {
    protected String nama;
    protected int umur;
    protected String alamat;
    protected String jenisKelamin;

    public Manusia(String nama, int umur, String alamat, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    // ===== Behavior Universal =====
    public void berbicara() {
        System.out.println(nama + " sedang berbicara.");
    }

    public void berjalan() {
        System.out.println(nama + " sedang berjalan.");
    }

    public void makan() {
        System.out.println(nama + " sedang makan.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    // Polymorphism friendly
    public void bekerja() {
        System.out.println(nama + " sedang bekerja.");
    }

    // Template Method
    public void perkenalan() {
        System.out.println("-----------------------------");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
        System.out.println("Alamat : " + alamat);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}