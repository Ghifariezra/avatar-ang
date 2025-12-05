package com.polymorphism.ayah;

public class AyahWirausaha extends Ayah {
    private String namaBisnis;
    private String bidangUsaha;

    public AyahWirausaha(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String hobi,
            int jumlahAnak,
            String kendaraan,
            String namaBisnis,
            String bidangUsaha) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin, hobi, jumlahAnak, kendaraan);
        this.namaBisnis = namaBisnis;
        this.bidangUsaha = bidangUsaha;
    }

    @Override
    public void bekerja() {
        System.out.println(getName() + " sedang mengurus bisnis " + namaBisnis + ".");
    }

    public void bernegosiasi() {
        System.out.println(getName() + " sedang bernegosiasi dengan klien untuk bisnis " + namaBisnis + ".");
    }

    // Overloading perkenalan khusus AyahWirausaha
    public void perkenalan(String bekerjaSebagai, String namaAnak, int lamaUsaha) {
        super.perkenalan(bekerjaSebagai, namaAnak);
        System.out.println("Saya memiliki bisnis " + namaBisnis + " di bidang " + bidangUsaha + ".");
        System.out.println("Bisnis saya sudah berjalan selama " + lamaUsaha + " tahun.");
        System.out.println("=================================");
    }
}