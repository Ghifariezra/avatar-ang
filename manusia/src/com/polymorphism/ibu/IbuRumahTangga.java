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

    public void merencanakanMenu() {
        System.out.println(nama + " merencanakan menu masakan harian.");
    }

    public void mengelolaKeuanganRumah() {
        System.out.println(nama + " mengelola keuangan rumah tangga.");
    }

    public void menjagaAnak() {
        System.out.println(nama + " menjaga dan mengawasi anak-anak.");
    }

    public void mengorganisirAcara() {
        System.out.println(nama + " mengorganisir acara keluarga.");
    }

    public void mengajarkanKeterampilan() {
        System.out.println(nama + " mengajarkan keterampilan baru pada anak.");
    }
}