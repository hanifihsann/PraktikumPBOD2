/* Nama File    : Main.java
 * Deskripsi    : Berisi Main dari method yang ada di class-class yang sudah dibuat
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 10 Maret 2026 
 */
public class Main {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4,"merah","hitam");
        Lingkaran L1 = new Lingkaran(10, "putih", "merah");
        
        System. out.println ("Persegi ");
        P1.printInfo();
        P1.setSisi(5);      
        System. out.println ("Panjang sisi: " + P1.getSisi());
        System. out.println ("Luas Persegi: " + P1.getLuas());
        System. out.println ("Keliling Persegi: " + P1.getKeliling());
        System. out.println ("Diagonal Persegi: " + P1.getDiagonal());

        System. out.println ("Lingkaran"); 
        L1.printInfo(); 
        L1.setJari(7);
        System. out.println ("Panjang Jari: " + L1.getJari());
        System. out.println ("Luas Lingkaran: " + L1.getLuas());
        System. out.println ("Keliling Lingkaran: " + L1.getKeliling());
    }
}

