/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class Dosen extends Pegawai {
    protected String fakultas;
    public Dosen(String nip, String nama, Date tanggalLahir, Date tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}