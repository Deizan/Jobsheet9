import java.util.Scanner;

public class ArrayNilai16Modified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        String[] statusKelulusan = new String[10];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.println("=== INPUT NILAI MAHASISWA ===");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = scanner.nextInt();
        }

        System.out.println("\n=== STATUS KELULUSAN MAHASISWA ===");
        System.out.println("Kriteria kelulusan: Nilai >= 70");
        System.out.println("─".repeat(50));

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
                statusKelulusan[i] = "LULUS";
                jumlahLulus++;
                System.out.println("Mahasiswa ke-" + (i + 1) + " | Nilai: " + nilaiAkhir[i] + " | Status: ✓ LULUS");
            } else {
                statusKelulusan[i] = "TIDAK LULUS";
                jumlahTidakLulus++;
                System.out.println("Mahasiswa ke-" + (i + 1) + " | Nilai: " + nilaiAkhir[i] + " | Status: ✗ TIDAK LULUS");
            }
        }

        System.out.println("─".repeat(50));
        System.out.println("\n=== STATISTIK KELULUSAN ===");
        System.out.println("Total mahasiswa: " + nilaiAkhir.length);
        System.out.println("Jumlah yang lulus: " + jumlahLulus);
        System.out.println("Jumlah yang tidak lulus: " + jumlahTidakLulus);
        
        double persentaseLulus = (jumlahLulus * 100.0) / nilaiAkhir.length;
        double persentaseTidakLulus = (jumlahTidakLulus * 100.0) / nilaiAkhir.length;
        System.out.println("Persentase lulus: " + String.format("%.2f", persentaseLulus) + "%");
        System.out.println("Persentase tidak lulus: " + String.format("%.2f", persentaseTidakLulus) + "%");

        System.out.println("\n=== RINGKASAN DETAIL ===");
        System.out.println("Mahasiswa yang LULUS:");
        boolean adaYangLulus = false;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (statusKelulusan[i].equals("LULUS")) {
                System.out.println("  - Mahasiswa ke-" + (i + 1) + " (Nilai: " + nilaiAkhir[i] + ")");
                adaYangLulus = true;
            }
        }
        if (!adaYangLulus) {
            System.out.println("  - Tidak ada mahasiswa yang lulus");
        }

        System.out.println("\nMahasiswa yang TIDAK LULUS:");
        boolean adaYangTidakLulus = false;
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (statusKelulusan[i].equals("TIDAK LULUS")) {
                System.out.println("  - Mahasiswa ke-" + (i + 1) + " (Nilai: " + nilaiAkhir[i] + ")");
                adaYangTidakLulus = true;
            }
        }
        if (!adaYangTidakLulus) {
            System.out.println("  - Tidak ada mahasiswa yang tidak lulus");
        }

        scanner.close();
    }
}
