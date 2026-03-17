/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen Tamu
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class DosenTamu extends Dosen {
    private String nidk;
    private Date akhirKontrak;

    public DosenTamu(String nip, String nidk, String nama,
                     Date tanggalLahir, Date tmt,
                     double gajiPokok, String fakultas,
                     Date akhirKontrak) {

        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Akhir Kontrak : " + akhirKontrak);
    }
}