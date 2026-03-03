/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class dosen 
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 03 Maret 2026 
 */

public class Dosen {
    /**************ATRIBUT**************/
    private String nip;
    private String nama;
    private String prodi;

    Dosen (){
        nip = "";
        nama = "";
        prodi = "";
    }

    Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getnip(){
        return nip;
    }

    public String getnama(){
        return nama;
    }

    public String getprodi(){
        return prodi;
    }

    public void setnip(String n){
        nip = n;
    }

    public void setnama(String nm){
        nama = nm;
    }

    public void setprodi(String p){
        prodi = p;
    }
}

