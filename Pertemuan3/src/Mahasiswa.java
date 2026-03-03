/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 03 Maret 2026 
 */

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private ArrayList<MataKuliah> listMatkul;

    public Mahasiswa(){
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi, String dosen, String kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    public void setDosenWali(Dosen d){
        this.dosenWali = d;
    }

    public void setKendaraan(Kendaraan k){
        this.kendaraan = k;
    }

    public void addMatKul(MataKuliah mk){
        listMatkul.add(mk);
    }

    public int getJumlahMatKul(){
        return listMatkul.size();
    }

    public int getJumlahSKS(){
        int total = 0;
        for(MataKuliah mk : listMatkul){
            total += mk.getSks();
        }
        return total;
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        if(dosenWali != null)
            System.out.println("Dosen Wali: " + dosenWali.getnama());

        if(kendaraan != null)
            System.out.println("Kendaraan: " + kendaraan.getjenis());

        System.out.println("Mata Kuliah:");
        for(MataKuliah mk : listMatkul){
            System.out.println("- " + mk.getNama());
        }
    }
}