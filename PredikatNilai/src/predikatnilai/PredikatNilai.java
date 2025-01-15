package predikatnilai;
import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("        SIAKAD Code University       ");
        System.out.println("=====================================");

        System.out.print("\nNama Dosen \t: ");
        String dosen = input.nextLine();

        System.out.print("Mata Kuliah \t: ");
        String matkul = input.nextLine();

        System.out.print("Nama Mahasiswa \t: ");
        String mhs = input.nextLine();

        System.out.print("Semester \t: ");
        int sms = input.nextInt();

        System.out.print("\nMasukkan Nilai \t: ");
        double nilai = input.nextDouble();

        // Menggunakan operator ternary untuk semua logika
        String hasil = nilai < 0 || nilai > 100 ? "Nilai Tidak Valid" :
            "Huruf\t\t: " +
            (nilai >= 85 ? "A" :
            nilai >= 76 ? "B+" :
            nilai >= 71 ? "B" :
            nilai >= 66 ? "C+" :
            nilai >= 61 ? "C" :
            nilai >= 51 ? "D" : "E") +
            "\nAngka\t\t: " +
            (nilai >= 85 ? "4.0" :
            nilai >= 76 ? "3.5" :
            nilai >= 71 ? "3.0" :
            nilai >= 66 ? "2.5" :
            nilai >= 61 ? "2.0" :
            nilai >= 51 ? "1.0" : "0.0") +
            "\nKeterangan\t: " +
            (nilai >= 61 ? "Lulus" : "Tidak Lulus");

        // Menampilkan hasil
        System.out.println("\n=====================================");
        System.out.println("         Hasil Penilaian             ");
        System.out.println("=====================================");
        System.out.println("Nama Dosen      : " + dosen);
        System.out.println("Mata Kuliah     : " + matkul);
        System.out.println("Nama Mahasiswa  : " + mhs);
        System.out.println("Semester        : " + sms);
        System.out.println("-------------------------------------");
        System.out.println("Nilai\t\t: " + nilai);
        System.out.println(hasil);
        System.out.println("=====================================");

        input.close();
    }
}
