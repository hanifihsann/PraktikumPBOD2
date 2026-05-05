/* Nama File    : Teman.java
 * Deskripsi    : berisi atribut dan method dalam class Teman
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 5 Mei 2026 
 */


package I_KOLEKSI_KELAS_DASAR;

import java.util.ArrayList;

class Teman<T> {
    private int nbelm;
    private ArrayList<T> Lnama;

    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public T getNama(int indeks) {
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, T nama) {
        Lnama.set(indeks, nama);
    }

    public void addNama(T nama) {
        setNama(nbelm, nama);
        nbelm++;
    }

    public void delNama(T nama) {
        if (nbelm != 0) {
            for(int i = 0; i < nbelm - 1; i++){
                if (getNama(i) == nama){
                    for(int j = i; j < nbelm -2; j++ ){
                        setNama(j, getNama(j+1));
                    }
                }
            }
            nbelm--;
        }
    } 

    public boolean isMember(T nama) {
        boolean member;
        member = false;
        if(nbelm != 0){
            for(int i = 0; i < nbelm - 1; i++){
                if(getNama(i) == nama){
                    member = true;
                }
            }
        }else{
            member = false;
        }
        return member;
    }

    public void gantiNama(T nama, T namabaru) {
        if(isMember(nama)){
            for(int i = 0; i < nbelm; i++){
                if(getNama(i) == nama){
                    setNama(i, namabaru);
                }
            }
        }
    }

    public int countNama(T nama) {
        int count = 0;
        for (int i = 0; i < nbelm; i++) {
            if (getNama(i) == nama) {
                count++;
            }
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar nama:");
        for (int i = 0; i < nbelm; i++) {
            System.out.println(getNama(i));
        }
    }
}
