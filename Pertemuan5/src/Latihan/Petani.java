
/* Nama File    : Petani.java
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Hanif Ihsanul Huda (24060124140183)
 * Tanggal      : 20 Maret 2026 
 */

package Latihan;

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        int C = 1; 
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears() + C;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}