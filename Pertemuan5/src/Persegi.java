/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 17 Maret 2026 
 */

public class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return Math.sqrt(2 *(sisi * sisi));
    }

    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    public void zoom(int percent){
        sisi = sisi * percent/100;
    }


    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}