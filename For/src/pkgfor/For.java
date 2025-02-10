package pkgfor;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int awal, akhir;
        System.out.println("Hitung Angka Terbalik Kelipatan 2");
        System.out.print("Masukan Angka Akhir : ");
        akhir = input.nextInt();
        System.out.print("Masukan Angka Awal  : ");
        awal = input.nextInt();
        
        for(int f = akhir; f >= awal; f-=2 ){
        System.out.print(f+" ");
        
        }   
    }
    
}
