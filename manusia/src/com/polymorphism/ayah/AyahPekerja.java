package com.polymorphism.ayah;

public class AyahPekerja extends Ayah {
    private String namaPerusahaan;
    private String jabatan;

    public AyahPekerja(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String hobi,
            int jumlahAnak,
            String kendaraan,
            String namaPerusahaan,
            String jabatan
    ) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin, hobi, jumlahAnak, kendaraan);
        this.namaPerusahaan = namaPerusahaan;
        this.jabatan = jabatan;
    }

    @Override
    public void bekerja() {
        System.out.println(getName() + " sedang bekerja sebagai " + jabatan + " di " + namaPerusahaan + ".");
    }

    public void rapat() {
        System.out.println(getName() + " sedang menghadiri rapat di " + namaPerusahaan + ".");
    }

    // Overloading perkenalan khusus AyahPekerja
    public void perkenalan(String bekerjaSebagai, String namaAnak, String proyekTerkini) {
        super.perkenalan(bekerjaSebagai, namaAnak);
        System.out.println("Saya bekerja di " + namaPerusahaan + " sebagai " + jabatan + ".");
        System.out.println("Proyek terkini saya adalah " + proyekTerkini + ".");
        System.out.println("Kendaraan saya adalah " + kendaraan + ".");
        System.out.println("=================================");
    }
}