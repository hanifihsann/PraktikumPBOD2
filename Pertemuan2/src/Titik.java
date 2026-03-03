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
    //Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis,double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
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

    //mengembalikan nilai kuadran dari suatu titik
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

    //mengembalikan nilai jarak titik ke titik pusat
    double getJarakPusat(){
        return Math.sqrt (absis*absis + ordinat*ordinat);
    }
    //mengembalikan nilai jarak antara dua titik
    double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //refleksi sumbu X
    void refleksiX(){
        setOrdinat(getOrdinat() * -1);
    }

    //refleksi sumbu Y
    void refleksiY(){
        setAbsis(getAbsis() * -1);
    }

    //mengembalikan nilai titik yang sudah direfleksi terhadap sumbu X
    Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdinat()*-1);
    }

    //mengembalikan nilai titik yang sudah direfleksi terhadap sumbu Y
    Titik getRefleksiY(){
        return new Titik(getAbsis()*-1, getOrdinat());
    }

    //mencetak 
    void printcounter(){
        System.out.println(this.counterTitik);
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }


} //end class Titik