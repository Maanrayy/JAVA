package todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    private static ArrayList<String> toDoList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== TO-DO LIST ==========");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Harap masukkan angka valid: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (choice) {
                case 1:
                    tambahTugas(scanner);
                    break;
                case 2:
                    lihatSemuaTugas();
                    break;
                case 3:
                    hapusTugas(scanner);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan To-Do List App. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void tambahTugas(Scanner scanner) {
        System.out.print("Masukkan tugas baru: ");
        String tugas = scanner.nextLine();
        toDoList.add(tugas);
        System.out.println("Tugas berhasil ditambahkan!");
    }

    private static void lihatSemuaTugas() {
        if (toDoList.isEmpty()) {
            System.out.println("Tidak ada tugas dalam daftar.");
        } else {
            System.out.println("\nDaftar Tugas:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    private static void hapusTugas(Scanner scanner) {
        if (toDoList.isEmpty()) {
            System.out.println("Tidak ada tugas untuk dihapus.");
            return;
        }

        lihatSemuaTugas();
        System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Harap masukkan angka valid: ");
            scanner.next();
        }
        int index = scanner.nextInt();

        if (index < 1 || index > toDoList.size()) {
            System.out.println("Nomor tugas tidak valid.");
        } else {
            String removedTask = toDoList.remove(index - 1);
            System.out.println("Tugas '" + removedTask + "' berhasil dihapus.");
        }
    }
}
