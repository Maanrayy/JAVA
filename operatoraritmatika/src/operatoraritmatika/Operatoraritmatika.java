package operatoraritmatika;
import java.util.Scanner;

public class Operatoraritmatika {
    
    public static void main(String[] args) {
        
        System.out.println("======Operator Aritmatika======");
        Scanner input = new Scanner(System.in);
        int h1, h2, out; // Deklarasi variabel
        System.out.print("Bilangan Pertama = ");
        h1 = input.nextInt(); // Input bilangan pertama
        System.out.print("Bilangan Kedua   = ");
        h2 = input.nextInt(); // Input bilangan kedua
        out = h1 + h2; // Operasi penjumlahan
        System.out.println("Hasil Dari : " + h1 + " + " + h2 + " adalah " + out); // Output hasil Penjumlahan
        
        out = h1 - h2;
        System.out.println("Hasil Dari : " + h1 + " - " + h2 + " adalah " + out); // Output hasil Pengurangan
        
        out = h2 * h1;
        System.out.println("Hasil Dari : " + h2 + " X " + h1 + " adalah " + out); // Output hasil Perkalian
        
        out = h1 / h2;
        System.out.println("Hasil Dari : " + h1 + " : " + h2 + " adalah " + out); // Output hasil Sisa/Modulus
        
        out = h1 % h2;
        System.out.println("Hasil Dari : " + h1 + " % " + h2 + " adalah " + out); // Output hasil
        
        input.close(); // Menutup Scanner
        System.out.println("=====Program selesai===========");
        
        
    }
}
