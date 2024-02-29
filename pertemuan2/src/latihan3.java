import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai matakuliah dari pengguna
        System.out.print("Masukkan nilai matakuliah: ");

        // Membaca input
        String input = scanner.nextLine().trim();

        // Memeriksa jika input kosong
        if (input.isEmpty()) {
            System.out.println("Nilai harus diisi");
            scanner.close();
            return;
        }

        // Memeriksa apakah input valid
        try {
            int nilai = Integer.parseInt(input);

            // Proses penentuan nilai indeks matakuliah
            String indeks;
            if (nilai >= 81 && nilai <= 100) {
                indeks = "A";
            } else if (nilai >= 76 && nilai <= 80) {
                indeks = "AB";
            } else if (nilai >= 56 && nilai <= 75) {
                indeks = "B";
            } else if (nilai >= 51 && nilai <= 55) {
                indeks = "BC";
            } else if (nilai >= 41 && nilai <= 50) {
                indeks = "C";
            } else if (nilai >= 21 && nilai <= 40) {
                indeks = "D";
            } else if (nilai >= 0 && nilai <= 20) {
                indeks = "E";
            } else {
                indeks = "Nilai di luar jangkauan";
            }

            // Menampilkan hasil nilai indeks matakuliah
            System.out.println("Nilai Matakuliah: " + indeks);
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }

        scanner.close();
    }
}
