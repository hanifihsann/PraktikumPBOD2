/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package OVERLOADING;
class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;

    Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
    }

    Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    void setProgramStudi() {
        this.ProgramStudi = "Kosoong";
    }

    void setProgramStudi(String prodi) {
        this.ProgramStudi = prodi;
    }

    void setProgramStudi(Mahasiswa m) {
        this.ProgramStudi = m.ProgramStudi;
    }

    void tampil() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + ProgramStudi);
        System.out.println("-------------------");
    }
}