package com.polymorphism.ibu;

public class IbuRumahTangga extends Ibu {
    private int jumlahAnakDiasuh;

    public IbuRumahTangga(String nama, int umur, String alamat, String jenisKelamin,
            String keahlianMasak, int jumlahAnakDiasuh) {
        super(nama, umur, alamat, jenisKelamin, keahlianMasak);
        this.jumlahAnakDiasuh = jumlahAnakDiasuh;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(nama + " mengurus rumah dan " + jumlahAnakDiasuh + " anak.");
    }

    public void mengajarAnak() {
        System.out.println(nama + " sedang mengajar anak di rumah.");
    }
}