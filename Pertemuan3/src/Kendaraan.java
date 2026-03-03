/* Nama File    : kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 03 Maret 2026 
 */


public class Kendaraan {
    /**************ATRIBUT**************/
    private String noPlat;
    private String jenis;

    Kendaraan (){
        noPlat = "";
        jenis = "";
    }

    Kendaraan (String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public String getjenis(){
        return jenis;
    }

    public void setnoPlat(String np){
        noPlat = np;
    }

    public void setnama(String j){
        jenis = j;
    }

}

