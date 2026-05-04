/* Nama File    : Data.java
 * Deskripsi    : Kelas generik dengan larik statis berukuran 100 elemen serta method setIsi, getIsi, dan getSize.
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package III_LARIK_GENERIK;

class Data<T> {
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    Data() {
        ruang = (T[]) new Object[100]; // larik statis 100
        banyak = 0;
    }

    void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= 100) {
            ruang[posisi - 1] = nilai;

            if (posisi > banyak) {
                banyak = posisi;
            }
        } else {
            System.out.println("Posisi tidak valid!");
        }
    }

    T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return ruang[posisi - 1];
        } else {
            return null;
        }
    }

    int getSize() {
        return banyak;
    }
}