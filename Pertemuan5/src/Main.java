/* Nama File    : Main.java
 * Deskripsi    : Berisi Main dari method yang ada di class-class yang sudah dibuat
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 17 Maret 2026 
 */

public class Main {
    public static void main(String[] args) {
        //BangunDatar B1 = new BangunDatar(); (error)

        BangunDatar p1 = new Persegi(10, "Merah", "Hitam");
        Persegi p2 = new Persegi(5, "Biru", "Putih");

        BangunDatar l1 = new Lingkaran(7, "Kuning", "Hijau");
        Lingkaran l2 = new Lingkaran(14, "Ungu", "Abu");

        System.out.println("\nLUAS");
        System.out.println("Luas Persegi : " + p1.getLuas());
        System.out.println("Luas Lingkaran : " + l1.getLuas());

        System.out.println("\nKELILING");
        System.out.println("Keliling Persegi " + p2.getKeliling());
        System.out.println("Keliling Lingkaran " + l2.getKeliling());

        // Is Equal
        System.out.println("\nApakah Equal");
        System.out.println("Apakah luas sama? " + p1.isEqualLuas(l1));
        System.out.println("Apa Keliling sama? " + p2.isEqualKeliling(l2));

        // resize
        p2.zoomIn();
        l2.zoomOut();
        System.out.println("\nSETELAH RESIZE");
        System.out.println(p2.getLuas());
        System.out.println(p2.getKeliling());
        System.out.println(l2.getLuas());
        System.out.println(l2.getKeliling());

        System.out.println("\nINFO");
        p2.printInfo();
        l2.printInfo();
        BangunDatar.printCounterBangunDatar();
    }
}