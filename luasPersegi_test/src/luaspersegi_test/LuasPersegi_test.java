/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luaspersegi_test;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LuasPersegi_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Meminta jumlah persegi panjang
        System.out.print("Masukkan jumlah persegi panjang (n): ");
        int n = input.nextInt();

        // Looping untuk menghitung luas setiap persegi panjang
        for (int i = 1; i <= n; i++) {
            System.out.println("\nPersegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = input.nextDouble();

            // Menghitung luas
            double luas = panjang * lebar;

            // Menampilkan hasil
            System.out.println("Luas = " + luas);
        }

        input.close();
    }
}


   
    

