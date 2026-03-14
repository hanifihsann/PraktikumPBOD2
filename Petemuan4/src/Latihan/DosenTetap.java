/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tetap
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class DosenTetap extends Dosen {
    private String nidn;
    public DosenTetap(String nip, String nidn, String nama,
                      Date tanggalLahir, Date tmt,
                      double gajiPokok, String fakultas) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN : " + nidn);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
    }
}