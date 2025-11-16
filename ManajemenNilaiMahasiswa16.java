import java.util.Scanner;

public class ManajemenNilaiMahasiswa16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput : ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];

        System.out.println("\n=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scanner.nextInt();
        }

        double total = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        double rataRata = total / nilaiMhs.length;

        int nilaiTertinggi = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
        }

        int nilaiTerendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("\n=== DAFTAR SEMUA NILAI ===");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + " : " + nilaiMhs[i]);
        }

        System.out.println("\n=== HASIL ANALISIS NILAI ===");
        System.out.println("Jumlah mahasiswa : " + jumlahMahasiswa);
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);

        System.out.println("\n=== STATISTIK TAMBAHAN ===");
        
        int jumlahDiAtasRata = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > rataRata) {
                jumlahDiAtasRata++;
            }
        }
        System.out.println("Jumlah nilai di atas rata-rata : " + jumlahDiAtasRata);

        int jumlahDiBawahRata = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] < rataRata) {
                jumlahDiBawahRata++;
            }
        }
        System.out.println("Jumlah nilai di bawah rata-rata : " + jumlahDiBawahRata);

        int jumlahSamaRata = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] == rataRata) {
                jumlahSamaRata++;
            }
        }
        System.out.println("Jumlah nilai sama dengan rata-rata : " + jumlahSamaRata);

        System.out.println("\n=== NILAI DALAM URUTAN (Ascending) ===");
        int[] nilaiSorted = nilaiMhs.clone();
        for (int i = 0; i < nilaiSorted.length; i++) {
            for (int j = i + 1; j < nilaiSorted.length; j++) {
                if (nilaiSorted[i] > nilaiSorted[j]) {
                    
                    int temp = nilaiSorted[i];
                    nilaiSorted[i] = nilaiSorted[j];
                    nilaiSorted[j] = temp;
                }
            }
        }
        for (int i = 0; i < nilaiSorted.length; i++) {
            System.out.print(nilaiSorted[i]);
            if (i < nilaiSorted.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
