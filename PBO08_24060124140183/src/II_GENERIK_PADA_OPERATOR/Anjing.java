/* Nama File    : Anjing.java
 * Deskripsi    : berisi atribut dan method dalam class Anjing
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */


package II_GENERIK_PADA_OPERATOR;

class Anjing extends Anabul {

    Anjing(String nama) {
        super(nama);
    }

    @Override
    void gerak() {
        System.out.println(nama + " berjalan melata");
    }

    @Override
    void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}