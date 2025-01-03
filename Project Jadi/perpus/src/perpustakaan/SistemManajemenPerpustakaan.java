package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

class Buku {
    private final String judul;
    private final String penulis;
    private boolean dipinjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void pinjam() {
        this.dipinjam = true;
    }

    public void kembalikan() {
        this.dipinjam = false;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Status: " + (dipinjam ? "Dipinjam" : "Tersedia");
    }
}

class Anggota {
    private final String nama;
    private final String id;

    public Anggota(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", ID: " + id;
    }
}

class Perpustakaan {
    private final ArrayList<Buku> koleksiBuku;
    private final ArrayList<Anggota> daftarAnggota;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
        daftarAnggota = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void daftarBuku() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam koleksi.");
        } else {
            for (int i = 0; i < koleksiBuku.size(); i++) {
                System.out.println((i + 1) + ". " + koleksiBuku.get(i));
            }
        }
    }

    public void tambahAnggota(Anggota anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota berhasil ditambahkan.");
    }

    public void daftarAnggota() {
        if (daftarAnggota.isEmpty()) {
            System.out.println("Tidak ada anggota yang terdaftar.");
        } else {
            for (int i = 0; i < daftarAnggota.size(); i++) {
                System.out.println((i + 1) + ". " + daftarAnggota.get(i));
            }
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                if (!buku.isDipinjam()) {
                    buku.pinjam();
                    System.out.println("Buku \"" + judul + "\" berhasil dipinjam.");
                } else {
                    System.out.println("Buku \"" + judul + "\" sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }

    public void kembalikanBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                if (buku.isDipinjam()) {
                    buku.kembalikan();
                    System.out.println("Buku \"" + judul + "\" berhasil dikembalikan.");
                } else {
                    System.out.println("Buku \"" + judul + "\" tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku \"" + judul + "\" tidak ditemukan.");
    }
}

public class SistemManajemenPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                System.out.println("\n========== SISTEM MANAJEMEN PERPUSTAKAAN ==========");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Lihat Daftar Buku");
                System.out.println("3. Tambah Anggota");
                System.out.println("4. Lihat Daftar Anggota");
                System.out.println("5. Pinjam Buku");
                System.out.println("6. Kembalikan Buku");
                System.out.println("7. Keluar");
                System.out.print("Pilih opsi (1-7): ");
                
                while (!scanner.hasNextInt()) {
                    System.out.print("Harap masukkan angka valid: ");
                    scanner.next();
                }
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan judul buku: ");
                        String judul = scanner.nextLine();
                        System.out.print("Masukkan penulis buku: ");
                        String penulis = scanner.nextLine();
                        perpustakaan.tambahBuku(new Buku(judul, penulis));
                    }
                    case 2 -> perpustakaan.daftarBuku();
                    case 3 -> {
                        System.out.print("Masukkan nama anggota: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan ID anggota: ");
                        String id = scanner.nextLine();
                        perpustakaan.tambahAnggota(new Anggota(nama, id));
                    }
                    case 4 -> perpustakaan.daftarAnggota();
                    case 5 -> {
                        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                        String judulPinjam = scanner.nextLine();
                        perpustakaan.pinjamBuku(judulPinjam);
                    }
                    case 6 -> {
                        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                        String judulKembali = scanner.nextLine();
                        perpustakaan.kembalikanBuku(judulKembali);
                    }
                    case 7 -> System.out.println("Terima kasih telah menggunakan Sistem Manajemen Perpustakaan. Sampai jumpa!");
                    default -> System.out.println("Opsi tidak valid. Silakan coba lagi.");
                }
            } while (pilihan != 7);
        }
    }
}
