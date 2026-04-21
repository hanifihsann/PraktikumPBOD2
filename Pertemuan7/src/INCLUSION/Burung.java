/* Nama File    : Burung.java
 * Deskripsi    : berisi atribut dan method dalam class Burung
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */


package INCLUSION;

class Burung extends Anabul {

    Burung(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(nama + " terbang");
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}