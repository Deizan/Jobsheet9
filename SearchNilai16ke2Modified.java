import java.util.Scanner;

public class SearchNilai16ke2Modified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

       
        for (int i = 1; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] == key) {
                ditemukan = true;
                posisi = i;
                break; 
        }
        System.out.println();
        if (ditemukan) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + posisi);
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam .");
        }

        input.close();
    }
}
}