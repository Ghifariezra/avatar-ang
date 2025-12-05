package com.polymorphism.ibu;

public class IbuKarir extends Ibu {
    private String namaPerusahaan;
    private String posisi;

    public IbuKarir(
            String nama,
            int umur,
            String alamat,
            boolean pekerjaan,
            String jenisKelamin,
            String keahlianMasak,
            String pendidikanTerakhir,
            String namaPerusahaan,
            String posisi) {
        super(nama, umur, alamat, true, jenisKelamin, keahlianMasak, pendidikanTerakhir);
        this.namaPerusahaan = namaPerusahaan;
        this.posisi = posisi;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(getName() + " menyeimbangkan antara bekerja di " + namaPerusahaan + " dan mengurus rumah.");
    }

    public void presentasi() {
        System.out
                .println(getName() + " sedang melakukan presentasi sebagai " + posisi + " di " + namaPerusahaan + ".");
    }

    // Overloading perkenalan khusus IbuKarir
    public void perkenalan(String masakanFavorit, String bekerjaSebagai, int pengalamanKerja) {
        super.perkenalan(masakanFavorit, bekerjaSebagai);
        System.out.println("Saya bekerja sebagai " + posisi + " di " + namaPerusahaan + ".");
        System.out.println("Pengalaman kerja saya sudah " + pengalamanKerja + " tahun.");
        System.out.println("Pendidikan terakhir saya adalah " + pendidikanTerakhir + ".");
        System.out.println("=================================");
    }
}
