package lksegitiga;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LkSegitiga {
    public static void main(String[] args) {
        
        double luas, keliling, alas, tinggi, sisi;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Format tanpa desimal dan membatasi 2 angka di belakang koma

        System.out.println("Menghitung Luas dan Keliling Segitiga");
        
        System.out.print("Masukkan Alas\t= ");
        alas = input.nextDouble();
        
        System.out.print("Masukkan Tinggi\t= ");
        tinggi = input.nextDouble();
        
        sisi = alas;  // Asumsi segitiga sama sisi, sehingga sisi = alas
        luas = 0.5 * (alas * tinggi);
        keliling = sisi + sisi + sisi;  // Keliling segitiga sama sisi
        
        System.out.println("Luas = 0.5 x (Alas x tinggi)");
        System.out.println("Luas = 0.5 x " + (int)alas + " x " + (int)tinggi);
        System.out.println("Luas = " + df.format(luas) + " cm2");  // Menggunakan DecimalFormat
        
        // Perbaikan pada perhitungan keliling
        System.out.println("\nKeliling = sisi + sisi + sisi");
        System.out.println("Keliling = " + df.format(keliling)+ " cm");  // Menggunakan DecimalFormat
    }
}
