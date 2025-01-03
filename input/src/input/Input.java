package input;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String nama ,alamat;
        int umur;
        float berat;
        double tinggi;
        char gender;

        Scanner input = new Scanner(System.in);

        System.out.println("=====Biodata Siswa=====");
        System.out.println("Silahkan Masukkan Data Diri");

        System.out.print("1. Nama\t\t: ");
        nama = input.nextLine(); // Membaca input nama
        
        System.out.print("2. Alamat \t: ");
        alamat = input.nextLine(); //Membaca input alamat

        System.out.print("3. Umur\t\t: ");
        umur = input.nextInt(); // Membaca input umur

        System.out.print("4. Berat\t: "); 
        berat = input.nextFloat(); // Membaca input berat
        
        System.out.print("5. Tinggi\t: ");
        tinggi = input.nextDouble(); // Membaca input tinggi

        // Membersihkan buffer setelah membaca angka
        input.nextLine();

        System.out.print("6. Gender(L/P)\t: ");
        String genderInput = input.nextLine(); // Membaca input gender sebagai string
        gender = genderInput.charAt(0); // Mengambil karakter pertama dan angka (0) mengambil karakter pertama 

        System.out.println("=======================");
        System.out.println("Nama   = " + nama);
        System.out.println("Alamat = "+ alamat);
        System.out.println("Umur   = " + umur + " Tahun");
        System.out.println("Berat  = " + berat + " Kg");
        System.out.println("Tinggi = " + tinggi + " Cm");
        System.out.println("Gender = " + gender);
        
        System.out.println("====Program Selesai,Terimakasih====");
    }
}
