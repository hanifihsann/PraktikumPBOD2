/* Nama File    : MOperator.java
 * Deskripsi    : Kelas yang berisi prosedur dan fungsi generik yaitu Tukar dan Bobot2.
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package II_GENERIK_PADA_OPERATOR;

class OperatorGenerik {

    static <G> void Tukar(G[] a, int i, int j) {
        G temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static <G extends Kucing> double Bobot2(G k1, G k2) {
        return k1.bobot + k2.bobot;
    }
}
