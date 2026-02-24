/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class titik
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 24 Februari 2026 
 */

public class Titik {
    /**************ATRIBUT**************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /**************METHOD**************/
    //Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis,double ordinat){
        this.absis = 0;
        this.ordinat = 0;
        counterTitik++;
    }

    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        }else if (absis < 0 && ordinat > 0){
            return 2;
        }else if (absis < 0 && ordinat < 0){
            return 3;
        }else if (absis > 0 && ordinat < 0){
            return 4;
        }else {
            return 0;
        }
    }

    double GetJarakPusat(){
        return Math.sqrt (absis*absis + ordinat*ordinat);
    }

    void refleksiX(){
        setOrdinat(getOrdinat() * -1);
    }

    void refleksiY(){
        setAbsis(getAbsis() * -1);
    }

    Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdinat()*-1);
    }

    Titik getRefleksiY(){
        return new Titik(getAbsis()*-1, getOrdinat());
    }

    void printcounter(){
        System.out.println(this.counterTitik);
    }
    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


} //end class Titik