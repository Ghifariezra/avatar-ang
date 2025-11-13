package com.polymorphism;

public class Anak extends Manusia {
    private String sekolah;
    private String hobi;

    public Anak(String nama, int umur, String alamat, boolean pekerjaan, String jenisKelamin, String sekolah,
            String hobi) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin);
        this.sekolah = sekolah;
        this.hobi = hobi;
    }

    public void belajar() {
        System.out.println(getName() + " sedang belajar di " + sekolah + ".");
    }

    @Override
    public void bermain() {
        System.out.println(getName() + " sedang bermain " + hobi + ".");
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan orang tua.");
    }

    // Overloading perkenalan khusus Anak
    public void perkenalan(String kelasFavorit) {
        super.perkenalan("Pelajar");
        System.out.println("Saya bersekolah di " + sekolah + ".");
        System.out.println("Kelas favorit saya adalah " + kelasFavorit + ".");
        System.out.println("Hobi saya adalah " + hobi + ".");
        System.out.println("=================================");
    }
}
