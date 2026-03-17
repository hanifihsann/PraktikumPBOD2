/* Nama File    : Main.java
 * Deskripsi    : Berisi Main dari method yang ada di class-class yang sudah dibuat
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 14 Maret 2026 
 */

package Latihan;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DosenTetap dosen1 = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                new Date(90,4,5),   
                new Date(115,0,1),     
                5000000,
                "Fakultas Sains dan Matematika"
        );
        DosenTamu dosen2 = new DosenTamu(
                "8765432190",
                "99887766",
                "Budi",
                new Date(88,2,10),
                new Date(120,1,1),
                4500000,
                "Fakultas Teknik",
                new Date(126,11,31)
        );
        Tendik tendik1 = new Tendik(
                "1122334455",
                "Siti",
                new Date(92,6,15),
                new Date(118,5,1),
                3500000,
                "Akademik"
        );

        System.out.println("DATA DOSEN TETAP");
        dosen1.printInfo();
        
        System.out.println("\nDATA DOSEN TAMU");
        dosen2.printInfo();

        System.out.println("\nDATA TENDIK");
        tendik1.printInfo();
    }
}