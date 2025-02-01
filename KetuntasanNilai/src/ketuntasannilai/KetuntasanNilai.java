package ketuntasannilai;
import java.util.Scanner;
public class KetuntasanNilai {
    public static void main(String[] args) {
    double progdas, webdsn, basisdata, jrgkmp, jumlah, rata, kkm;
    
        System.out.println("Rata Rata Nilai Mahasiswa Teknik Informatika");
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nWeb Design \t\t: ");
        webdsn = input.nextDouble();
        
        System.out.print("Basis Data \t\t: ");
        basisdata = input.nextDouble();
        
        System.out.print("Jaringan Komputer \t: ");
        jrgkmp = input.nextDouble();
        
        
        System.out.print("Pemrograman Dasar \t: ");
        progdas = input.nextDouble();
        
        kkm = 80;
        
        jumlah =  progdas+webdsn+basisdata+jrgkmp;
        rata = jumlah / 4;
         System.out.println("\nRata-rata: " + rata);
        
        if(rata >= kkm){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
    }
    }
    
}
