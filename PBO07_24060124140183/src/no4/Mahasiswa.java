/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 23 April 2026 
 */

package no4;

class Mahasiswa extends CivitasAkademika {
    String nim;
    Dosen dosenWali;

    Mahasiswa(String nama, String nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    @Override
    String getNomor() {
        return nim;
    }

    void setWali(Dosen d) {
        dosenWali = d;
    }

    void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
        System.out.println("----------------------");
    }
}