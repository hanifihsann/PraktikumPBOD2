/* Nama File    : Seminar.java
 * Deskripsi    : berisi atribut dan method dalam class Seminar
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 23 April 2026 
 */

package no4;

public class MSeminar {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Budi", "D001");
        Dosen d2 = new Dosen("Bu Sari", "D002");

        Mahasiswa m1 = new Mahasiswa("Andi", "M001", d1);
        Mahasiswa m2 = new Mahasiswa("Budi", "M002", d1);
        Mahasiswa m3 = new Mahasiswa("Cici", "M003", d2);
        Mahasiswa m4 = new Mahasiswa("Dedi", "M004", d2);
        Mahasiswa m5 = new Mahasiswa("Eka", "M005", d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total Peserta: " + s.countPeserta());
        System.out.println("Daftar Peserta:");
        s.tampilPeserta();
        System.out.println("Jumlah Mahasiswa: " + s.countMahasiswa());
        m1.setWali(d2);
        System.out.println("Data Mahasiswa setelah ubah wali:");
        m1.tampilDataMahasiswa();
    }
}


// Kesimpulan : 
// Polimorfisme adalah satu data atau objek bisa punya banyak bentuk tergantung bagaimana kita mengolahnya. 
// Dari soal tersebut terlihat bahwa nilai yang sama bisa diubah ke tipe lain (int, char, double, String), 
// digabung (konkatenasi) atau dihitung (penjumlahan) tergantung tipe datanya. 
// Jadi, polimorfisme dibuat agar satu data jadi fleksibel, dapat dipakai dalam berbagai bentuk sesuai kebutuhan program.