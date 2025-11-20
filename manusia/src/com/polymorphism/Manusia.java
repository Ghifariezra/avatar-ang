package com.polymorphism;

public class Manusia {
    private String nama;
    private int umur;
    protected String alamat;
    protected boolean pekerjaan;
    public String jenisKelamin;

    // Constructor
    public Manusia(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter
    public String getName() {
        return this.nama;
    }

    // Behavior Ayah
    public void bekerja() {
        System.out.println(this.nama + " sedang bekerja di kantor.");
    }

    public void mengasuh() {
        System.out.println(this.nama + " sedang mengasuh peliharaannya.");
    }

    public void memperbaikiKendaraan() {
        System.out.println(this.nama + " sedang memperbaiki kendaraannya.");
    }

    public void memilikiAnak() {
        System.out.println(this.nama + " memiliki anak.");
    }

    public void bermain() {
        System.out.println(this.nama + " sedang bermain.");
    }

    // Behavior Ibu
    public void memasak() {
        System.out.println(this.nama + " sedang memasak makanannya.");
    }

    public void mengurusRumah() {
        if (this.pekerjaan) {
            System.out.println(this.nama + " sedang bekerja di kantor.");
        } else {
            System.out.println(this.nama + " sedang mengurus rumah.");
        }
    }

    public void memberiNasihat() {
        System.out.println(this.nama + " memberi nasihat kepada anak-anaknya.");
    }

    // Default Behavior
    public void berbicara() {
        System.out.println(this.nama + " sedang berbicara dengan teman-temannya.");
    }

    // Default Behavior
    public void berolahraga() {
        System.out.println(this.nama + " sedang berolahraga untuk menjaga kesehatannya.");
    }

    public void perkenalan(String bekerjaSebagai) {
        System.out.println("\n=================================");
        System.out.println("Halo, nama saya " + this.nama + ".");
        System.out.println("Umur saya " + this.umur + " tahun.");
        System.out.println("Saya tinggal di " + this.alamat + ".");
        
        if (this.pekerjaan) {
            System.out.println("Saya sedang bekerja sebagai " + bekerjaSebagai + ".");
        } else {
            System.out.println("Saya menjadi " + bekerjaSebagai + ".");
        }

        System.out.println("Jenis kelamin saya " + this.jenisKelamin + ".");
    }
}
