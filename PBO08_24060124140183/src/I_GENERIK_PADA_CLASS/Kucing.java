/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package I_GENERIK_PADA_CLASS;

class Kucing extends Anabul {
    double bobot;

    Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    void gerak() {
        System.out.println(nama + " bergerak melata");
    }

    @Override
    void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }

    void tampilData() {
        System.out.println("Nama: " + nama);
        System.out.println("Bobot: " + bobot + " kg");
    }
}