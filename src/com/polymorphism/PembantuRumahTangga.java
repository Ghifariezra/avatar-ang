package com.polymorphism;

public class PembantuRumahTangga extends Manusia {
    private String tugasUtama;

    public PembantuRumahTangga(String nama, int umur, String alamat, boolean pekerjaan, String jenisKelamin,
            String tugasUtama) {
        super(nama, umur, alamat, pekerjaan, jenisKelamin);
        this.tugasUtama = tugasUtama;
    }

    public void bekerja() {
        System.out.println(getName() + " sedang melakukan tugas " + tugasUtama + ".");
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan keluarga.");
    }
}
