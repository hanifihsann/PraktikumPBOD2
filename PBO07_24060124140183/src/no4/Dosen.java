/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 23 April 2026 
 */

package no4;

class Dosen extends CivitasAkademika {
    String nip;

    Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    @Override
    String getNomor() {
        return nip;
    }
}