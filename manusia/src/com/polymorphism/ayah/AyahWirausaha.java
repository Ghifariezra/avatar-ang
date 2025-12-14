package com.polymorphism.ayah;

public class AyahWirausaha extends Ayah {
    private String namaUsaha;
    private String bidangUsaha;

    public AyahWirausaha(String nama, int umur, String alamat, String jenisKelamin,
            int jumlahAnak, String kendaraan,
            String namaUsaha, String bidangUsaha) {
        super(nama, umur, alamat, jenisKelamin, jumlahAnak, kendaraan);
        this.namaUsaha = namaUsaha;
        this.bidangUsaha = bidangUsaha;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " mengelola usaha " + namaUsaha + ".");
    }

    public void bernegosiasi() {
        System.out.println(nama + " sedang bernegosiasi dengan klien.");
    }

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Usaha : " + namaUsaha);
        System.out.println("Bidang : " + bidangUsaha);
    }
}