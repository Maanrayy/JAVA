package lklingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;

public class LkLingkaran {

    public static void main(String[] args) {
        final double phi = Math.PI; // Menggunakan Math.PI untuk nilai π
        double luas, keliling, jarijari;

        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan Jari-Jari = ");
        jarijari = input.nextDouble();

        // Perhitungan Luas dan Keliling
        luas = phi * jarijari * jarijari;
        keliling = 2 * phi * jarijari;

        // Membuat DecimalFormat untuk membatasi 2 angka di belakang koma
        DecimalFormat df = new DecimalFormat("#.##");

        // Menampilkan rumus dan hasil perhitungan dengan format yang lebih rapi
        System.out.println("Luas = 3,14 x r x r");
        System.out.println("Luas = " + df.format(phi) + " x " + (int)jarijari + " x " + (int)jarijari);
        System.out.println("Luas = " + df.format(luas) + " cm2");

        System.out.println("\nKeliling = 2 x 3,14 x r");
        System.out.println("Keliling = 2 x " + df.format(phi) + " x " + (int)jarijari);
        System.out.println("Keliling = " + df.format(keliling) + " cm");
    }
}
