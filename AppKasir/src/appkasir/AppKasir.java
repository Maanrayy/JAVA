package appkasir;
import java.util.Scanner;

public class AppKasir {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menuMakanan = null, menuMinuman = null;
        int pilihanMakanan, pilihanMinuman, hargaMakanan = 0, hargaMinuman = 0, porsiMakanan, porsiMinuman = 0;
        
        // Menu Makanan
        System.out.println("Menu Makanan MaanResto");
        System.out.println("1. Bakso (Rp 10.000)\n2. Mie Ayam (Rp 12.000)\n3. Soto Ayam (Rp 6.000)");
        System.out.print("Pilih makanan: ");
        pilihanMakanan = input.nextInt();
        
        if (pilihanMakanan == 1) {
            menuMakanan = "Bakso";
            hargaMakanan = 10000;
        } else if (pilihanMakanan == 2) {
            menuMakanan = "Mie Ayam";
            hargaMakanan = 12000;
        } else if (pilihanMakanan == 3) {
            menuMakanan = "Soto Ayam";
            hargaMakanan = 6000;
        } else {
            System.out.println("Pilihan makanan tidak valid.");
            return; // Menghentikan program jika pilihan tidak valid
        }
        
        System.out.print("Jumlah porsi makanan: ");
        porsiMakanan = input.nextInt();
        
        // Menu Minuman
        System.out.println("\nMenu Minuman MaanResto");
        System.out.println("1. Es Teh (Rp 5.000)\n2. Es Jeruk (Rp 7.000)\n3. Air Mineral (Rp 3.000)\n4. Tidak pesan minuman");
        System.out.print("Pilih minuman: ");
        pilihanMinuman = input.nextInt();
        
        if (pilihanMinuman == 1) {
            menuMinuman = "Es Teh";
            hargaMinuman = 5000;
        } else if (pilihanMinuman == 2) {
            menuMinuman = "Es Jeruk";
            hargaMinuman = 7000;
        } else if (pilihanMinuman == 3) {
            menuMinuman = "Air Mineral";
            hargaMinuman = 3000;
        } else if (pilihanMinuman == 4) {
            menuMinuman = "Tidak pesan minuman";
            hargaMinuman = 0;
        } else {
            System.out.println("Pilihan minuman tidak valid.");
            return; // Menghentikan program jika pilihan tidak valid
        }
        
        if (pilihanMinuman != 4) {
            System.out.print("Jumlah porsi minuman: ");
            porsiMinuman = input.nextInt();
        }
        
        // Perhitungan Total
        int totalHargaMakanan = hargaMakanan * porsiMakanan;
        int totalHargaMinuman = hargaMinuman * porsiMinuman;
        int totalBayar = totalHargaMakanan + totalHargaMinuman;
        
        // Output
        System.out.println("\n========================");
        System.out.println("Pesanan Anda:");
        System.out.println("Makanan: " + menuMakanan + " x " + porsiMakanan + " = Rp " + totalHargaMakanan);
        if (pilihanMinuman != 4) {
            System.out.println("Minuman: " + menuMinuman + " x " + porsiMinuman + " = Rp " + totalHargaMinuman);
        } else {
            System.out.println("Minuman: Tidak pesan");
        }
        System.out.println("------------------------");
        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}
