/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package INCLUSION;
class Anabul {
    String nama;

    Anabul(String nama) {
        this.nama = nama;
    }

    void gerak() {
        System.out.println(nama + " sedang bergerak");
    }

    void bersuara() {
        System.out.println(nama + " bersuara");
    }
}