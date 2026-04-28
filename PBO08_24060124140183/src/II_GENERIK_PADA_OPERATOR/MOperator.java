/* Nama File    : MOperator.java
 * Deskripsi    : Program utama untuk menguji prosedur generik Tukar dan fungsi generik Bobot2.
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package II_GENERIK_PADA_OPERATOR;

public class MOperator {
    public static void main(String[] args) {
        //Tukar Integer
        Integer[] angka = {3, 6};
        OperatorGenerik.Tukar(angka, 0, 1);
        System.out.println("Integer: " + angka[0] + " " + angka[1]);

        //Tukar Strung
        String[] teks = {"A", "B"};
        OperatorGenerik.Tukar(teks, 0, 1);
        System.out.println("String: " + teks[0] + " " + teks[1]);

        //Tukar Anabul
        Anabul[] hewan = {
            new Anjing("Bolt"),
            new Kucing("Grey", 2.5)
        };
        OperatorGenerik.Tukar(hewan, 0, 1);
        System.out.println("Anabul: " + hewan[0].nama + " & " + hewan[1].nama);
        
        //Bobot2
        Kucing k1 = new Anggora("Momo", 3.0);
        Kucing k2 = new Kembangtelon("Mimo", 4.0);

        double total = OperatorGenerik.Bobot2(k1, k2);
        System.out.println("Total bobot: " + total);
    }
}
