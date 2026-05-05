/* Nama File    : MTeman.java
 * Deskripsi    : 
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 5 Mei 2026 
 */

package I_KOLEKSI_KELAS_DASAR;

public class MTeman {
    public static void main(String[] args) {
        Teman<String> t = new Teman<>();

        t.addNama("menza");
        t.addNama("Hasta");
        t.addNama("Ijat");
        t.addNama("Marcel");
        t.addNama("dinda");
        t.addNama("elza");
        t.addNama("ferdi");
        t.addNama("caesar");
        t.addNama("opan");
        t.addNama("bayu");
        t.addNama("devano");
        t.addNama("lutfi");
        t.addNama("azka");
        t.addNama("atta");
        t.addNama("feri");
        t.addNama("Basil");
        t.addNama("Naufal");
        t.addNama("Velya");
        t.addNama("Rama");

        System.out.println("Daftar Teman:");
        t.showTeman();

        System.out.println("\nJumlah elemen: " + t.getNbelm());

        System.out.println("Nama indeks ke2: " + t.getNama(2));

        t.setNama(2, "Izzatu");
        System.out.println("\nSetelah indeks ke-2 diganti:");
        t.showTeman();

        System.out.println("\nApakah Hasta ada? " + t.isMember("Hasta"));
        System.out.println("Jumlah nama Hasta: " + t.countNama("Hasta"));

        t.gantiNama("Hasta", "Putra");
        System.out.println("\nHasta diganti Putra:");
        t.showTeman();

        t.delNama("menza");
        System.out.println("\nmenza dihapus:");
        t.showTeman();

        System.out.println("\nJumlah elemen akhir: " + t.getNbelm());
    }
}