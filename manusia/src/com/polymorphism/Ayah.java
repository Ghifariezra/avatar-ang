package com.polymorphism;

public class Ayah extends Manusia {
    private String hobi;
    private int jumlahAnak;
    protected String kendaraan;

    public Ayah(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String hobi,
            int jumlahAnak,
            String kendaraan
    ) {
        super(
                nama,
                umur,
                alamat,
                pekerjaan,
                jenisKelamin
        );
        this.hobi = hobi;
        this.jumlahAnak = jumlahAnak;
        this.kendaraan = kendaraan;
    }

    @Override
    public void bekerja() {
        System.out.println(getName() + " sedang bekerja di kantor.");
    }

    @Override
    public void mengasuh() {
        System.out.println(getName() + " sedang mengasuh anak-anaknya.");
    }

    @Override
    public void bermain() {
        System.out.println(getName() + " sedang bermain " + this.hobi + ".");
    }

    @Override
    public void berbicara() {
        System.out.println(getName() + " sedang berbicara dengan ibu.");
    }

    @Override
    public void memperbaikiKendaraan() {
        System.out.println(getName() + " sedang memperbaiki " + this.kendaraan + ".");
    }

    @Override
    public void memilikiAnak() {
        System.out.println(getName() + " memiliki " + this.jumlahAnak + " anak.");
    }

    // Overloading dari method perkenalan yang berasal dari parent class Manusia
    public void perkenalan(String bekerjaSebagai, String namaAnak) {
        perkenalan(bekerjaSebagai);
        System.out.println("Saya memiliki anak bernama " + namaAnak + ".");
        System.out.println("Saya suka bermain " + this.hobi + ".");
        System.out.println("=================================");
    };
}
