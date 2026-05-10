/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 10 Mei 2026 
 */

package II_KOLEKSI_KELAS_BENTUKAN;

public class Kucing extends Anabul {
    private double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
}