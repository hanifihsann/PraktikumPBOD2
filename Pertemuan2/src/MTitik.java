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

        //getKuadran
        System.out.println("Kuadran T1: " + T1.getKuadran());
        
        // getJarakPusat
        T1.setAbsis(3);
        T1.setOrdinat(4);
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());

        // getJarak
        Titik T3 = new Titik();
        T3.setAbsis(6);
        T3.setOrdinat(8);
        T3.printTitik();
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T3));

        // refleksi X dan Y
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();

        // getrefleksi X dan Y
        Titik RX = T1.getRefleksiX();
        Titik RY = T1.getRefleksiY();

        System.out.print("Refleksi X: ");
        RX.printTitik();

        System.out.print("Refleksi Y: ");
        RY.printTitik();

    }
}

