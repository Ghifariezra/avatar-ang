package com.polymorphism.ibu;

public class IbuKarir extends Ibu {
    private String perusahaan;
    private String posisi;

    public IbuKarir(String nama, int umur, String alamat, String jenisKelamin,
            String keahlianMasak, String perusahaan, String posisi) {
        super(nama, umur, alamat, jenisKelamin, keahlianMasak);
        this.perusahaan = perusahaan;
        this.posisi = posisi;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(nama + " membagi waktu antara rumah dan pekerjaan.");
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja sebagai " + posisi + " di " + perusahaan + ".");
    }

    public void presentasi() {
        System.out.println(nama + " sedang melakukan presentasi di kantor.");
    }
}