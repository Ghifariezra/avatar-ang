package com.polymorphism;

public class Nenek extends Manusia {
    private String resepKueFavorit;

    public Nenek(String nama, int umur, String alamat, boolean pekerjaan, String jenisKelamin, String resepKueFavorit) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin);
        this.resepKueFavorit = resepKueFavorit;
    }

    public void membuatKue() {
        System.out.println(getName() + " sedang membuat kue dengan resep " + resepKueFavorit + ".");
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan cucu-cucunya.");
    }
}
