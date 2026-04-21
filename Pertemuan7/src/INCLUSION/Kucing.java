/* Nama File    : Kucinng.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package INCLUSION;

class Kucing extends Anabul {

    Kucing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(nama + " berjalan melata");
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}