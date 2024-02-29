import java.util.Scanner;

public class latihan2 {
    private double panjang;
    private double lebar;

    // Konstruktor untuk inisialisasi panjang dan lebar
    public latihan2(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk menampilkan nilai atribut panjang, lebar, luas, dan keliling
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk panjang dan lebar
        System.out.print("Panjang: ");
        double panjang = scanner.nextDouble();

        System.out.print("Lebar: ");
        double lebar = scanner.nextDouble();

        // Membuat objek Latihan2
        latihan2 latihan2 = new latihan2(panjang, lebar);

        // Menampilkan nilai atribut panjang, lebar, luas, dan keliling
        latihan2.tampil();

        scanner.close();
    }
}
