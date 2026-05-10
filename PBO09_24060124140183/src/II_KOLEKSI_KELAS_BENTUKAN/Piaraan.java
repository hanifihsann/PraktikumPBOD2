/* Nama File    : Piaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Piaraan
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 10 Mei 2026 
 */


package II_KOLEKSI_KELAS_BENTUKAN;

import java.util.ArrayList;

class Piaraan {
    private int nbelm;
    private ArrayList<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    // enqueue (tambah belakang)
    public void enqueueAnabul(Anabul a) {
        Lanabul.add(a);
        nbelm++;
    }

    // cek member
    public boolean isMember(Anabul a) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i) == a) {
                return true;
            }
        }
        return false;
    }

    // ambil depan tanpa hapus
    public Anabul getAnabul() {
        if (nbelm == 0) return null;
        return Lanabul.get(0);
    }

    // dequeue (ambil + hapus depan)
    public Anabul dequeueAnabul() {
        if (nbelm == 0) return null;

        Anabul temp = Lanabul.get(0);

        for (int i = 0; i < nbelm - 1; i++) {
            Lanabul.set(i, Lanabul.get(i + 1));
        }

        Lanabul.remove(nbelm - 1);
        nbelm--;

        return temp;
    }

    // show nama anabul
    public void showAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(Lanabul.get(i).getNama());
        }
    }

    // hitung kucing
    public int countKucing() {
        int count = 0;

        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i).getClass().getSimpleName().equals("Kucing")) {
                count++;
            }
        }

        return count;
    }

    // bobot kucing
    public double bobotKucing() {
        double total = 0;

        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i).getClass().getSimpleName().equals("Kucing")) {
                Kucing k = (Kucing) Lanabul.get(i);
                total += k.getBobot();
            }
        }

        return total;
    }

    // show jenis
    public void showJenisAnabul() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println(
                Lanabul.get(i).getNama() + " - " +
                Lanabul.get(i).getClass().getSimpleName()
            );
        }
    }
}