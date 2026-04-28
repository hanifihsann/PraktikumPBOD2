/* Nama File    : MAnabul.java
 * Deskripsi    : Program untuk mengilustrasikan penggunaan kelas generik Datum
 *                dengan objek Anabul
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package I_GENERIK_PADA_CLASS;

public class MAnabul {
    public static void main(String[] args) {
        Anabul[] anabuls = new Anabul[3];
        anabuls[0] = new Anggora("Momo", 3.3);
        anabuls[1] = new Kembangtelon("Mimo", 4.0);
        anabuls[2] = new Kucing("Miku", 2.8);

        for (int i = 0; i < anabuls.length; i++) {
            anabuls[i].gerak();
            anabuls[i].bersuara();
            anabuls[i].tampilData();
            System.out.println();
        }

        Datum<Anabul> A = new Datum<>();
        for (int i = 0; i < anabuls.length; i++) {
            A.setIsi(anabuls[i]);
            System.out.println("Isi Datum: " + A.getIsi().nama);
        }
    }
}