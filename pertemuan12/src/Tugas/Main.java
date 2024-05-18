package Tugas;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi("Persegi", 4);
        Kubus kubus = new Kubus("Kubus", 3);
        Lingkaran lingkaran = new Lingkaran("Lingkaran", 5);

        System.out.println(persegi.getNama() + " - Luas: " + persegi.hitungLuas());
        System.out.println(kubus.getNama() + " - Luas: " + kubus.hitungLuas() + ", Volume: " + kubus.hitungVolume());
        System.out.println(lingkaran.getNama() + " - Luas: " + lingkaran.hitungLuas() + ", Simetri: " + lingkaran.cekSimetri());
    }
}
