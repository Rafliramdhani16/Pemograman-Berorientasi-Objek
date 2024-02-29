import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah bilangan dari pengguna
        System.out.print("Masukkan jumlah bilangan (N): ");
        int N = scanner.nextInt();

        // Memeriksa apakah jumlah bilangan valid
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
            return;
        }

        // Meminta input bilangan dari pengguna dan menghitung totalnya
        int total = 0;
        for (int i = 1; i <= N; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = scanner.nextInt();
            total += bilangan;
        }

        // Menampilkan hasil total
        System.out.println("Total: " + total);

        scanner.close();
    }
}
