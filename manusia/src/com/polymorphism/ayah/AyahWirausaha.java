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

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Usaha   : " + namaUsaha);
        System.out.println("Bidang  : " + bidangUsaha);
    }

    public void bernegosiasi() {
        System.out.println(nama + " sedang bernegosiasi dengan klien.");
    }
    
    public void memasarkanProduk() {
        System.out.println(nama + " memasarkan produk dari usaha " + namaUsaha + ".");
    }

    public void mengaturKeuangan() {
        System.out.println(nama + " mengatur keuangan usaha " + namaUsaha + ".");
    }

    public void mengembangkanUsaha() {
        System.out.println(nama + " mengembangkan usaha " + namaUsaha + ".");
    }

    public void menghadiriPameran() {
        System.out.println(nama + " menghadiri pameran bisnis untuk usaha " + namaUsaha + ".");
    }

    public void merekrutKaryawan() {
        System.out.println(nama + " merekrut karyawan untuk usaha " + namaUsaha + ".");
    }

    public void infoUsaha() {
        System.out.println(nama + " memiliki usaha " + namaUsaha + " di bidang " + bidangUsaha + ".");
    }

    public void membukaUsaha() {
        System.out.println(nama + " membuka usaha " + namaUsaha + ".");
    }

    public void menutupUsaha() {
        System.out.println(nama + " menutup operasional usaha hari ini.");
    }

    public void menerimaPesanan() {
        System.out.println(nama + " menerima pesanan dari pelanggan.");
    }

    public void melayaniPelanggan() {
        System.out.println(nama + " sedang melayani pelanggan di usaha " + namaUsaha + ".");
    }

    public void mengecekStok() {
        System.out.println(nama + " mengecek stok barang usaha " + namaUsaha + ".");
    }

    public void mencatatPenjualan() {
        System.out.println(nama + " mencatat hasil penjualan usaha.");
    }

    public void promosiOnline() {
        System.out.println(nama + " melakukan promosi online untuk usaha " + namaUsaha + ".");
    }

    public void evaluasiUsaha() {
        System.out.println(nama + " melakukan evaluasi perkembangan usaha.");
    }
    public void membukaCabang() {
        System.out.println(nama + " sedang membuka cabang baru " + namaUsaha + " di luar kota.");
    }

    public void promosiDiSosmed() {
        System.out.println(nama + " sedang mempromosikan produk " + namaUsaha + " di sosial media.");
    }
}
