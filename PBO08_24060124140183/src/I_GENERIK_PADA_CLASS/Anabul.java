/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */


package I_GENERIK_PADA_CLASS;

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