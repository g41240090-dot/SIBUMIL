import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Antrian {
    private final Queue<String> antrian;

    public Antrian() {
        antrian = new LinkedList<>();
    }

    // Menambahkan pasien ke antrian
    public void add(String pasien) {
        antrian.add(pasien);
    }

    // Mengambil dan menghapus pasien terdepan dari antrian
    public String poll() {
        return antrian.poll();
    }

    // Mengembalikan jumlah pasien dalam antrian
    public int size() {
        return antrian.size();
    }

    // Menampilkan semua pasien dalam antrian
    public void display() {
        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            antrian.forEach((pasien) -> {
                System.out.println(pasien);
            });
        }
    }
}

public class AntrianPendaftaranPasien {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();
        try (Scanner scanner = new Scanner(System.in)) {
            String pilihan;
            
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Pasien");
                System.out.println("2. Proses Pasien");
                System.out.println("3. Lihat Antrian");
                System.out.println("4. Jumlah Pasien dalam Antrian");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi (1-5): ");
                pilihan = scanner.nextLine();
                
                switch (pilihan) {
                    case "1":
                        System.out.print("Masukkan nama pasien: ");
                        String namaPasien = scanner.nextLine();
                        antrian.add(namaPasien);
                        System.out.println(namaPasien + " telah ditambahkan ke dalam antrian.");
                        break;
                        
                    case "2":
                        String pasienDiproses = antrian.poll();
                        if (pasienDiproses != null) {
                            System.out.println("Pasien yang diproses: " + pasienDiproses);
                        } else {
                            System.out.println("Antrian kosong.");
                        }
                        break;
                        
                    case "3":
                        antrian.display();
                        break;
                        
                    case "4":
                        System.out.println("Jumlah pasien dalam antrian: " + antrian.size());
                        break;
                        
                    case "5":
                        System.out.println("Keluar dari program.");
                        break;
                        
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (!pilihan.equals("5"));
        }
    }
    
}