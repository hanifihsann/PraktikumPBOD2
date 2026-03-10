/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 10 Maret 2026 
 */

public class Lingkaran extends BangunDatar{
    private double jari;
    
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border); 
        setJmlSisi(1);
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    public void printInfo(){
        super.printInfo();
        System. out.println ("Jari: " + jari);
    }
}