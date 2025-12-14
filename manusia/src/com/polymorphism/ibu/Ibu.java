package com.polymorphism.ibu;

import com.polymorphism.Manusia;

public class Ibu extends Manusia {
    protected String keahlianMasak;

    public Ibu(String nama, int umur, String alamat, String jenisKelamin,
            String keahlianMasak) {
        super(nama, umur, alamat, jenisKelamin);
        this.keahlianMasak = keahlianMasak;
    }

    public void memasak() {
        System.out.println(nama + " sedang memasak " + keahlianMasak + ".");
    }

    public void mengurusRumah() {
        System.out.println(nama + " sedang mengurus rumah.");
    }

    public void memberiNasihat() {
        System.out.println(nama + " memberi nasihat kepada anak-anak.");
    }

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Peran : Ibu");
    }
}