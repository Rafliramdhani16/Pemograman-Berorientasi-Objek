public class RefresentasiObjek1 {
    public static void main(String[] args) {
        // Membuat objek Lingkaran dengan jari-jari 5 dan menginisialisasi objek l1
        Lingkaran l1 = new Lingkaran(5);
        // Menginisialisasi objek l2 dengan referensi ke objek l1, sehingga l1 dan l2 menunjuk ke objek yang sama
        Lingkaran l2 = l1;

        // Mencetak nilai jari-jari objek l1
        System.out.println(l1.getJari2());
        // Mencetak nilai jari-jari objek l2, yang memiliki nilai yang sama dengan objek l1
        System.out.println(l2.getJari2());

        // Mengubah nilai jari-jari objek l2 menjadi 10
        l2.setJari2(10);

        // Mencetak nilai jari-jari objek l1 setelah diubah melalui objek l2
        System.out.println(l1.getJari2());
        // Mencetak nilai jari-jari objek l2 setelah diubah
        System.out.println(l2.getJari2());
    }
}
