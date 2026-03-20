/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Hanif Ihsanul Huda (24060124140183)
 * Tanggal      : 20 Maret 2026 
 */

package Latihan;

import java.time.LocalDate;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tgl, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public static int getCounterMns(){
        return counterMns;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
