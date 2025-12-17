package com.polymorphism.ayah;

public class AyahPekerja extends Ayah {
    private String perusahaan;
    private String jabatan;

    public AyahPekerja(String nama, int umur, String alamat, String jenisKelamin,
            int jumlahAnak, String kendaraan,
            String perusahaan, String jabatan) {
        super(nama, umur, alamat, jenisKelamin, jumlahAnak, kendaraan);
        this.perusahaan = perusahaan;
        this.jabatan = jabatan;
    }

    @Override
    public void bekerja() {
        System.out.println(nama + " bekerja sebagai " + jabatan + " di " + perusahaan + ".");
    }

    @Override
    public void perkenalan() {
        super.perkenalan();
        System.out.println("Pekerjaan   : " + jabatan);
        System.out.println("Perusahaan  : " + perusahaan);
    }

    public void rapat() {
        System.out.println(nama + " sedang mengikuti rapat di " + perusahaan + ".");
    }

    public void mengelolaProyek() {
        System.out.println(nama + " sedang mengelola proyek penting di " + perusahaan + ".");
    }

    public void melakukanPresentasi() {
        System.out.println(nama + " sedang melakukan presentasi di kantor.");
    }

    public void mengirimEmail() {
        System.out.println(nama + " mengirim email terkait pekerjaan.");
    }

    public void melakukanBisnisCall() {
        System.out.println(nama + " sedang melakukan panggilan bisnis.");
    }

    public void mengaturJadwal() {
        System.out.println(nama + " mengatur jadwal kerjanya.");
    }

    public void infoPekerjaan() {
        System.out.println(nama + " bekerja sebagai " + jabatan + " di perusahaan " + perusahaan + ".");
    }

    public void mulaiKerja() {
        System.out.println(nama + " mulai bekerja di " + perusahaan + ".");
    }

    public void selesaiKerja() {
        System.out.println(nama + " telah menyelesaikan pekerjaan hari ini.");
    }

    public void lembur() {
        System.out.println(nama + " sedang lembur di " + perusahaan + ".");
    }

    public void meetingOnline() {
        System.out.println(nama + " mengikuti meeting online dengan tim kerja.");
    }

    public void evaluasiKinerja() {
        System.out.println(nama + " sedang melakukan evaluasi kinerja proyek.");
    }

    public void memberiArahanTim() {
        System.out.println(nama + " memberikan arahan kepada tim di " + perusahaan + ".");
    }

    public void menyusunLaporan() {
        System.out.println(nama + " sedang menyusun laporan pekerjaan.");
    }

    public void istirahatKerja() {
        System.out.println(nama + " sedang istirahat sejenak dari pekerjaan.");
    }

    public void pulangKantor() {
        System.out.println(nama + " pulang dari kantor setelah bekerja.");
    }
}
