package com.polymorphism;

public class Ibu extends Manusia {
    private String keahlianMasak;
    protected String pendidikanTerakhir;

    public Ibu (
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String keahlianMasak,
            String pendidikanTerakhir
    ) {
        super(
                nama,
                umur,
                alamat,
                pekerjaan,
                jenisKelamin
        );
        this.keahlianMasak = keahlianMasak;
        this.pendidikanTerakhir = pendidikanTerakhir;
    }
    
    @Override
    public void memasak() {
        System.out.println(getName() + " sedang memasak " + this.keahlianMasak + ".");
    }

    @Override
    public void mengurusRumah() {
        if (this.pekerjaan) {
            System.out.println(getName() + " sedang bekerja di kantor.");
        } else {
            System.out.println(getName() + " sedang mengurus rumah.");
        }
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan ayah.");
    }

    @Override
    public void memberiNasihat() {
        System.out.println(getName() + " memberi nasihat kepada anak-anaknya.");
    }

    // Overloading dari method perkenalan yang berasal dari parent class Manusia
    public void perkenalan(String masakanFavorit, String bekerjaSebagai) {
        perkenalan(bekerjaSebagai);
        System.out.println("Saya memiliki keahlian masak " + this.keahlianMasak + ".");
        System.out.println("Saya memiliki pendidikan terakhir " + this.pendidikanTerakhir + ".");
        System.out.println("Saya suka memasak " + masakanFavorit + ".");
        System.out.println("=================================");
    };
}
