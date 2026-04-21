/* Nama File    : Main.java
 * Deskripsi    : main dari class-class yang telah dibuat
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package INCLUSION;

public class Main {
    public static void main(String[] args) {

        Anabul k = new Kucing("Kucing");
        Anabul a = new Anjing("Anjing");
        Anabul b = new Burung("Burung");

        k.gerak();
        k.bersuara();

        a.gerak();
        a.bersuara();

        b.gerak();
        b.bersuara();
    }
}