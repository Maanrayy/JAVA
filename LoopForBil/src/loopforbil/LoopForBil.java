package loopforbil;
import java.util.Scanner;

public class LoopForBil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bilwal, bilkhir;
                
        System.out.println("Bilangan Genap");
        System.out.print("Masukkan Bilangan Awal  : ");
        bilwal = input.nextInt();
        System.out.print("Masukkan Bilangan Akhir : ");
        bilkhir = input.nextInt();
        
        if (bilwal < bilkhir) {
            System.out.println("Bilangan genap dalam rentang tersebut:");
            for (int f = bilwal; f <= bilkhir; f++) { 
                if (f % 2 == 0) { 
                    System.out.print(f + " "); // Cetak bilangan genap
                }
            }
            System.out.println(); 
        } else {
            System.out.println("Bilangan awal harus lebih kecil dari bilangan akhir.");
        }
        
        input.close(); 
    }
}
