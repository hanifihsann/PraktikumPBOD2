/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 03 Maret 2026 
 */


public class MataKuliah {
    /**************ATRIBUT**************/
    private String idMatkul;
    private String nama;
    private Integer sks;

    public MataKuliah (){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah (String idMatkul,String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public String getNama(){
        return nama;
    }

    public Integer getSks(){
        return sks;
    }

    public void setidMatkul(String idM){
        idMatkul = idM;
    }

    public void setnama(String nm){
        nama = nm;
    }    

    public void setSks(Integer s){
        sks = s;
    }
}

