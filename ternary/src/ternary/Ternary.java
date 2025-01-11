package ternary;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Cek Kelulusan Siswa");
        
        System.out.print("\nMasukkan Nama Siswa  = ");
        String nama = input.nextLine();
        System.out.print("Masukkan nilai siswa = "); // Tambahkan prompt untuk input
        double nilai = input.nextDouble(); // Ambil input dari pengguna

        int kkm = 80; // Nilai minimum untuk lulus
        String hasil = nilai >= kkm ? "Lulus" : "Tidak Lulus"; // Ternary operator

        // Cetak hasil
        System.out.println("Nilai siswa = " + nilai);
        System.out.println(nama +" dinyatakan " + hasil);
        
        System.out.println("\nProgram Selesai");

        input.close(); // Tutup Scanner
    }
}
