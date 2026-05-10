/* Nama File    : MPiaraan.java
 * Deskripsi    : berisi main program dari class-class yang dibuat
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 10 Mei 2026 
 */

package II_KOLEKSI_KELAS_BENTUKAN;

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        p.enqueueAnabul(new Kucing("Milo", 3.5));
        p.enqueueAnabul(new Kucing("Luna", 2.8));
        p.enqueueAnabul(new Kucing("Kitty", 4.1));

        System.out.println("isi antrian:");
        p.showAnabul();

        System.out.println("\nJumlah elemen: " + p.getNbelm());

        System.out.println("\nJenis Anabul:");
        p.showJenisAnabul();

        System.out.println("\nJumlah Kucing: " + p.countKucing());
        System.out.println("Total Bobot Kucing: " + p.bobotKucing());

        System.out.println("\nAmbil depan: " + p.getAnabul().getNama());

        System.out.println("\nDequeue:");
        p.dequeueAnabul();

        System.out.println("\nSetelah dequeue:");
        p.showAnabul();
    }
}


// Jadi, Koleksi adalah cara menyimpan dan mengelola sekumpulan 
// objek dalam satu struktur data yang bisa bertambah, diakses, diubah, 
// dan dihapus secara dinamis sehinggaa lbih efisien dibanding penggunaan variabel satu per satu.