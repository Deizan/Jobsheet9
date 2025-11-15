import java.util.Scanner;

public class ArrayRataNilai16Modified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = scanner.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = 0;
        double rataRataTidakLulus = 0;

        if (jumlahLulus > 0) {
            rataRataLulus = totalLulus / jumlahLulus;
        }
        if (jumlahTidakLulus > 0) {
            rataRataTidakLulus = totalTidakLulus / jumlahTidakLulus;
        }

        System.out.println("\n=== HASIL ANALISIS ===");
        System.out.println("Banyaknya mahasiswa yang lulus (nilai > 70) = " + jumlahLulus);
        System.out.println("Banyaknya mahasiswa yang tidak lulus (nilai ≤ 70) = " + jumlahTidakLulus);
        
        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        } else {
            System.out.println("Rata-rata nilai lulus = Tidak ada mahasiswa yang lulus");
        }
        
        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
        } else {
            System.out.println("Rata-rata nilai tidak lulus = Tidak ada mahasiswa yang tidak lulus");
        }

        scanner.close();
    }
}
