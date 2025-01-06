package lkpersegipanjang;
import java.util.Scanner;


public class LkPersegiPanjang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas, keliling;
        
        System.out.println("Menghitung Luas dan Keliling Persegi Panjang");
        
        System.out.println("==========");
        
        // Input panjang
        System.out.print("Masukkan Panjang = ");
        panjang = input.nextInt();
        
        // Input lebar
        System.out.print("Masukkan Lebar   = ");
        lebar = input.nextInt();
        
        // Perhitungan
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
        
        // Output hasil
        System.out.println("Luas = Panjang x Lebar");
        System.out.println("Luas = " + panjang + " x " + lebar + " ");
        System.out.println("Luas Persegi Panjang = " + luas +" cm2");
        
        System.out.println("==========");
        
        System.out.println("Keliling = 2 x (Panjang + Lebar)");
        System.out.println("Keliling = 2 x (" + panjang + " + " + lebar + ")  ");
        System.out.println("Keliling Persegi Panjang = " + keliling + " cm2");
    } 
}

    
    

