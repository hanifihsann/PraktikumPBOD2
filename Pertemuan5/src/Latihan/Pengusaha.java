/* Nama File    : Pengusaha.java
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Hanif Ihsanul Huda (24060124140183)
 * Tanggal      : 20 Maret 2026 
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp){
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public int hitungMasaKerja(){
        int B = 8; 
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + B;
    }

    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
