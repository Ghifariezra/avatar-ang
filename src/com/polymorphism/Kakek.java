package com.polymorphism;

public class Kakek extends Manusia {
    private String ceritaNostalgia;

    public Kakek(String nama, int umur, String alamat, boolean pekerjaan, String jenisKelamin, String ceritaNostalgia) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin);
        this.ceritaNostalgia = ceritaNostalgia;
    }

    public void bercerita() {
        System.out.println(getName() + " sedang bercerita: " + ceritaNostalgia);
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan cucunya.");
    }
}
