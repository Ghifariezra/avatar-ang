package com.polymorphism.ibu;

public class IbuKarir extends Ibu {
    private String perusahaan;
    private String posisi;

    public IbuKarir(String nama, int umur, String alamat, String jenisKelamin,
            String keahlianMasak, String perusahaan, String posisi) {
        super(nama, umur, alamat, jenisKelamin, keahlianMasak);
        this.perusahaan = perusahaan;
        this.posisi = posisi;
    }

    @Override
    public void mengurusRumah() {
        System.out.println(nama + " membagi waktu antara rumah dan pekerjaan.");
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja sebagai " + posisi + " di " + perusahaan + ".");
    }
    
    public void presentasi() {
        System.out.println(nama + " sedang melakukan presentasi di kantor.");
    }

    public void mengaturWaktu() {
        System.out.println(nama + " mengatur waktu antara pekerjaan dan keluarga.");
    }

    public void mengikutiMeeting() {
        System.out.println(nama + " mengikuti meeting di kantor.");
    }

    public void melatihTim() {
        System.out.println(nama + " melatih tim kerja di kantornya.");
    }

    public void membuatLaporan() {
        System.out.println(nama + " membuat laporan pekerjaan.");
    }

    public void menghubungiKlien() {
        System.out.println(nama + " menghubungi klien penting.");
    }

    public void infoPekerjaan() {
        System.out.println(nama + " bekerja di " + perusahaan + " sebagai " + posisi + ".");
    }

    public void mulaiKerja() {
        System.out.println(nama + " mulai bekerja di kantor.");
    }

    public void selesaiKerja() {
        System.out.println(nama + " menyelesaikan pekerjaan hari ini.");
    }

    public void meetingOnline() {
        System.out.println(nama + " mengikuti meeting online.");
    }

    public void lembur() {
        System.out.println(nama + " sedang lembur di kantor.");
    }

    public void mengevaluasiKinerja() {
        System.out.println(nama + " melakukan evaluasi kinerja tim.");
    }

    public void menyusunStrategi() {
        System.out.println(nama + " menyusun strategi kerja untuk tim.");
    }

    public void istirahat() {
        System.out.println(nama + " mengambil waktu istirahat sejenak.");
    }

    public void pulangKantor() {
        System.out.println(nama + " pulang dari kantor dan kembali ke rumah.");
    }
}
