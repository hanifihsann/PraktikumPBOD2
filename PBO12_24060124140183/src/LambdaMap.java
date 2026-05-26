import java.util.HashMap;
import java.util.Map;

public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("24060124140183", "isan");
        mahasiswa.put("24060124140184", "Hanif");
        mahasiswa.put("24060124140185", "Huda");
        mahasiswa.put("24060124140186", "inul");
        mahasiswa.put("24060124140187", "ihsanul");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM  : " + nim);
            System.out.println("Nama : " + nama);
            System.out.println();
        });
    }
}