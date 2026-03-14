/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class Tendik extends Pegawai {
    private String bidang;

    public Tendik(String nip, String nama,
                  Date tanggalLahir, Date tmt,
                  double gajiPokok, String bidang) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
    }
}