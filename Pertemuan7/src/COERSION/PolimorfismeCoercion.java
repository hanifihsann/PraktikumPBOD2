/* Nama File    : PolimorfismeCoercion.java
 * Deskripsi    : Program utama yang mengilustrasikan polimorfisme Coercion
 * Pembuat      : Hanif Ihsanul Huda
 * Tanggal      : 21 April 2026 
 */

package COERSION;
public class PolimorfismeCoercion {
    public static void main(String[] args) {

        int nilai = 65;

        char karakter = (char) nilai;
        double real = (double) nilai;
        System.out.println("Integer: " + nilai);
        System.out.println("Char: " + karakter);
        System.out.println("Double: " + real);

        String angkaStr = "123";
        int keInt = Integer.parseInt(angkaStr);
        double keDouble = Double.parseDouble(angkaStr);
        System.out.println("String ke int: " +keInt);
        System.out.println("String ke double: " + keDouble);

        String dariInt = Integer.toString(nilai);
        System.out.println("Int ke String: " +dariInt);

        // int -> double -> int
        int a = 10;
        double b = (double) a;
        int c = (int) b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        // String X & Y
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("S: " + S);
        System.out.println("Z: " + Z);

        // String P  & Q 
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("R: " + R);
        System.out.println("D: " + D);

        // Integer A dari S
        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

        // String T dari A
        String T = A.toString();
        System.out.println("T: " + T);
    }
}