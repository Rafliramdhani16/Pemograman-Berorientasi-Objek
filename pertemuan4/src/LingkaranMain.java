public class LingkaranMain {
    public static void main(String[] args) {
        // Membuat objek Lingkaran l1 dengan jari-jari 5
        Lingkaran l1 = new Lingkaran(5);

        // Menginisialisasi objek Lingkaran l2 dengan referensi ke objek l1, sehingga l1 dan l2 menunjuk ke objek yang sama
        Lingkaran l2 = l1;

        // Mencetak nilai jari-jari objek l1
        System.out.println(l1.getJari2());

        // Mencetak nilai jari-jari objek l2, yang sama dengan objek l1 karena l2 mengacu pada objek yang sama dengan l1
        System.out.println(l2.getJari2());

        // Memanggil method ubahJari2 dengan parameter l1
        ubahJari2(l1);

        // Mencetak kembali nilai jari-jari objek l1 setelah diubah melalui method ubahJari2
        System.out.println(l1.getJari2());

        // Mencetak nilai jari-jari objek l2, yang seharusnya juga terpengaruh karena l2 mengacu pada objek yang sama dengan l1
        System.out.println(l2.getJari2());
    }

    // Method untuk mengubah nilai jari-jari objek Lingkaran yang diterima sebagai parameter menjadi 4
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }
}
