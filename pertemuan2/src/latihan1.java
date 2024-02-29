import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang dan lebar
        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        // Menghitung luas dan keliling persegi panjang
        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        // Menampilkan hasil
        System.out.println("Luas: " + luas);
        System.out.println("Keliling: " + keliling);

        scanner.close();
    }
}

