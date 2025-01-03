package tester;

import java.util.Scanner;

public class KasirSederhanaBaru {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Program Kasir Sederhana ===");
            System.out.print("Masukkan nama barang: ");
            String namaBarang = scanner.nextLine();
            
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = scanner.nextDouble();
            
            System.out.print("Masukkan jumlah barang: ");
            int jumlahBarang = scanner.nextInt();
            
            double totalHarga = hargaBarang * jumlahBarang;
            System.out.println("\nTotal Harga: " + totalHarga);
            
            System.out.print("Masukkan jumlah uang: ");
            double jumlahUang = scanner.nextDouble();
            
            if (jumlahUang >= totalHarga) {
                System.out.println("Kembalian: " + (jumlahUang - totalHarga));
            } else {
                System.out.println("Uang tidak cukup. Silakan coba lagi.");
            }
        }
    }
}
