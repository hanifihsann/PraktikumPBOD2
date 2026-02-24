/* Nama File    : MTitik.java
 * Deskripsi    : main class titik
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 24 Februari 2026 
 */


public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //mencetak koordinat T1 ke layar
        T1.geser(3,4); //menggeser T1 sejauh (3,4)
        T1.printTitik(); //menampilkan koordinat T1 setelah geser
    
        Titik T2 =T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println(T1.getKuadran());
        
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println(T1.GetJarakPusat());

        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();

    }
}

