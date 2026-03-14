/* Nama File    : Pegawai.java
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected Date tanggalLahir;
    protected Date tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}