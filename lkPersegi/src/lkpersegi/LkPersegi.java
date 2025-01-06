package lkpersegi;
import java.util.Scanner;

public class LkPersegi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sisi, luas, keliling;
        
        System.out.println("Menghitung Luas Dan Keliling Persegi\n");
        System.out.print("Masukkan Sisi = ");
        
        sisi = input.nextInt();
        luas = sisi * sisi;
        keliling = 4 * sisi;
        
        System.out.println("Luas = Sisi x Sisi");
        System.out.println("Luas = "+sisi+" x "+sisi);
        System.out.print("Luas Persegi = " + luas + " cm2");
    
        
        System.out.println("\n");
        
        System.out.println("Keliling = 4 x sisi");
        System.out.println("Keliling = 4" + " x " + sisi);
        System.out.println("Keliling Persegi = " + keliling + " cm2");
        
        System.out.println("Program Selesai");
    }
    
}
