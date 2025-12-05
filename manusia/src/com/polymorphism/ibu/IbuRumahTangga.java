package com.polymorphism.ibu;

public class IbuRumahTangga extends Ibu {
    private int jumlahAnakDiasuh;
    private String kegiatanRutin;

    public IbuRumahTangga(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String keahlianMasak,
            String pendidikanTerakhir,
            int jumlahAnakDiasuh,
            String kegiatanRutin) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin, keahlianMasak, pendidikanTerakhir);
        this.jumlahAnakDiasuh = jumlahAnakDiasuh;
        this.kegiatanRutin = kegiatanRutin;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(getName() + " sedang mengurus rumah dan " + jumlahAnakDiasuh + " anak.");
    }

    public void mengajarAnak() {
        System.out.println(getName() + " sedang mengajar anak-anaknya di rumah.");
    }

    // Overloading perkenalan khusus IbuRumahTangga
    public void perkenalan(String masakanFavorit, String bekerjaSebagai, String komunitasIbu) {
        super.perkenalan(masakanFavorit, bekerjaSebagai);
        System.out.println("Saya mengurus " + jumlahAnakDiasuh + " anak di rumah.");
        System.out.println("Kegiatan rutin saya adalah " + kegiatanRutin + ".");
        System.out.println("Saya aktif di komunitas " + komunitasIbu + ".");
        System.out.println("=================================");
    }
}