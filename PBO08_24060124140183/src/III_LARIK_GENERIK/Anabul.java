/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package III_LARIK_GENERIK;

class Anabul {
    String nama;

    Anabul(String nama) {
        this.nama = nama;
    }

    void gerak() {
        System.out.println(nama + " bergerak");
    }

    void bersuara() {
        System.out.println(nama + " bersuara");
    }

    void tampilData() {
        System.out.println("Nama: " + nama);

    }
}