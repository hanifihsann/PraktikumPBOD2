/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik yang menyimpan satu data bertipe bebas.
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package I_GENERIK_PADA_CLASS;

class Datum<G> {
    private G isi;

    G getIsi() {
        return isi;
    }

    void setIsi(G isibaru) {
        this.isi = isibaru;
    }
}