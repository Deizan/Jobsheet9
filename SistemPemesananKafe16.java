import java.util.Scanner;

public class SistemPemesananKafe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];

        double[] hargaPesanan = new double[jumlahPesanan];

        System.out.println("\n=== INPUT DATA PESANAN ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Pesanan ke-" + (i + 1) + "\n");
            System.out.print("  Nama makanan/minuman : ");
            namaPesanan[i] = scanner.nextLine();
            System.out.print("  Harga : Rp ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }


        System.out.println("\n=== DAFTAR PESANAN ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }


        System.out.println("\n=== TOTAL BIAYA ===");
        System.out.println("Total Biaya Pesanan : Rp " + totalBiaya);

        scanner.close();
    }
}
