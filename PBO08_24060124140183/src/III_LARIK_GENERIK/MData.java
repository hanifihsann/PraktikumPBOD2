/* Nama File    : MData.java
 * Deskripsi    : Program utama untuk menguji kelas generik Data dengan operasi setIsi, getIsi, dan getSize
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 28 April 2026 
 */

package III_LARIK_GENERIK;

public class MData {
    public static void main(String[] args) {

        Data<Anabul> data = new Data<>();

        data.setIsi(1, new Anggora("Momo", 3.3));
        data.setIsi(2, new Kembangtelon("Mimi", 4.0));
        data.setIsi(3, new Kucing("Miku", 2.8));

        System.out.println("Jumlah elemen: " + data.getSize());

        for (int i = 1; i <= data.getSize(); i++) {
            Anabul a = data.getIsi(i);
            a.gerak();
            a.bersuara();
            a.tampilData();
            System.out.println("----------------");
        }
    }
}


//jadi, Generik adalah konsep di Java agar kita dapat membuat class atau method yang fleksibel, 
//sehingga bisa dipakai untuk berbagai tipe data tanpa harus menulis ulang kode.
