package terganjilgenaper;
import java.util.Scanner;
public class TerGanjilGenaper {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("=======Program Ternary ganjil Genap=======");
    System.out.print("\nMasukkan Angka : ");
    int angka = input.nextInt();
    int hasil = angka % 2;
    
    System.out.println("Rumus : "+angka+" % 2 ");
    System.out.println("Hasilnya Bernilai = "+hasil);
    String operasi = hasil == 0?"Genap":"Ganjil";
    System.out.println("Menghasilkan Bilangan "+operasi);
    
    System.out.println("\n=======Program Selesai=======");
    }
    
}
