/* Nama File    : PNS.java
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Hanif Ihsanul Huda (24060124140183)
 * Tanggal      : 20 Maret 2026 
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip){
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        int A = 3; 
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + A;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}