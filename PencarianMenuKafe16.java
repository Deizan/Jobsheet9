import java.util.Scanner;

public class PencarianMenuKafe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("=== DAFTAR MENU KAFE ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari : ");
        String cariMakanan = scanner.nextLine();

        int hasil = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMakanan)) {
                hasil = i;
                break;
            }
        }

        System.out.println("\n=== HASIL PENCARIAN ===");
        if (hasil != -1) {
            System.out.println("Makanan \"" + cariMakanan + "\" ditemukan!");
            System.out.println("Makanan tersedia di menu nomor : " + (hasil + 1));
            System.out.println("Nama makanan : " + menu[hasil]);
            System.out.println("Status : Tersedia di kafe kami");
        } else {
            System.out.println("Makanan \"" + cariMakanan + "\" tidak ditemukan!");
            System.out.println("Makanan tidak tersedia di menu kami.");
            System.out.println("Silakan pilih makanan lain dari daftar menu di atas.");
        }

        scanner.close();
    }
}
