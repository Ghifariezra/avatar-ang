package com.polymorphism.ibu;

public class IbuRumahTangga extends Ibu {
    private int jumlahAnakDiasuh;

    public IbuRumahTangga(String nama, int umur, String alamat, String jenisKelamin,
            String keahlianMasak, int jumlahAnakDiasuh) {
        super(nama, umur, alamat, jenisKelamin, keahlianMasak);
        this.jumlahAnakDiasuh = jumlahAnakDiasuh;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(nama + " mengurus rumah dan " + jumlahAnakDiasuh + " anak.");
    }

    public void mengajarAnak() {
        System.out.println(nama + " sedang mengajar anak di rumah.");
    }

    public void merencanakanMenu() {
        System.out.println(nama + " merencanakan menu masakan harian.");
    }

    public void mengelolaKeuanganRumah() {
        System.out.println(nama + " mengelola keuangan rumah tangga.");
    }

    public void menjagaAnak() {
        System.out.println(nama + " menjaga dan mengawasi anak-anak.");
    }

    public void mengorganisirAcara() {
        System.out.println(nama + " mengorganisir acara keluarga.");
    }

    public void mengajarkanKeterampilan() {
        System.out.println(nama + " mengajarkan keterampilan baru pada anak.");
    }

    public void infoKeluarga() {
        System.out.println(nama + " mengasuh " + jumlahAnakDiasuh + " anak di rumah.");
    }

    public void menyiapkanSarapan() {
        System.out.println(nama + " menyiapkan sarapan untuk keluarga.");
    }

    public void membersihkanRumah() {
        System.out.println(nama + " sedang membersihkan rumah.");
    }

    public void mencuciPakaian() {
        System.out.println(nama + " mencuci pakaian keluarga.");
    }

    public void menemaniBelajar() {
        System.out.println(nama + " menemani anak belajar di rumah.");
    }

    public void berbelanjaKebutuhan() {
        System.out.println(nama + " berbelanja kebutuhan rumah tangga.");
    }

    public void menyiapkanMakanMalam() {
        System.out.println(nama + " menyiapkan makan malam untuk keluarga.");
    }

    public void beristirahat() {
        System.out.println(nama + " beristirahat setelah menyelesaikan pekerjaan rumah.");
    }
}
