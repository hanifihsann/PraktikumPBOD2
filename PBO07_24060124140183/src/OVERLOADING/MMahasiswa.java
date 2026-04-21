/* Nama File    : MMahasiswa.java
 * Deskripsi    : main class Mahasiswa
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package OVERLOADING;
public class MMahasiswa {
    public static void main(String[] args) {

        //Default
        Mahasiswa m1 = new Mahasiswa();
        m1.tampil();

        // Tiga parameter
        Mahasiswa m2 = new Mahasiswa("123", "Isan", "Informatika");
        m2.tampil();

        m2.setProgramStudi();
        m2.tampil();

        m2.setProgramStudi("Sistem Informasi");
        m2.tampil();

        Mahasiswa m3 = new Mahasiswa("456", "mpruy", "Teknik Komputer");
        m2.setProgramStudi(m3);
        m2.tampil();

        // kloning
        Mahasiswa m4 = new Mahasiswa(m3);
        m4.tampil();
    }
}