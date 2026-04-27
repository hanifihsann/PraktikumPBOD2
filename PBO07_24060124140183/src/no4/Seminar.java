package no4;

class Seminar {
    CivitasAkademika[] pesertas = new CivitasAkademika[100];
    int banyakPeserta;

    Seminar() {
        banyakPeserta = 0;
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas penuh!");
        }
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(
                pesertas[i].getNomor() + " - " + pesertas[i].getNama()
            );
        }
    }

    int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jumlah++;
            }
        }
        return jumlah;
    }
}