public class RefresentasiObjek3 {
    public static void main(String[] args) {
        // Membuat objek l1 dengan jari-jari 5
        Lingkaran l1 = new Lingkaran(5);
        // Menginisialisasi objek l2 dengan referensi ke objek l1, sehingga l1 dan l2 menunjuk ke objek yang sama
        Lingkaran l2 = l1;
        // Membuat objek l3 dengan jari-jari 7
        Lingkaran l3 = new Lingkaran(7);

        // Mencetak nilai jari-jari objek l1
        System.out.println(l1.getJari2());
        // Mencetak nilai jari-jari objek l2, yang sama dengan objek l1 karena l2 mengacu pada objek yang sama dengan l1
        System.out.println(l2.getJari2());
        // Mencetak nilai jari-jari objek l3
        System.out.println(l3.getJari2());

        // Mengubah referensi l2 untuk menunjuk ke objek l3
        l2 = l3;

        // Mencetak kembali nilai jari-jari objek l1, l2, dan l3 setelah l2 diubah untuk menunjuk ke objek l3
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
    }
}
