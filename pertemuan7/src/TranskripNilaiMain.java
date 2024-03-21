public class TranskripNilaiMain {
    public static void main(String[] args) {
        // membuat objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Membuat obiek Kartu Hasil Mahasiwa
        KartuHasilStudi khs = new KartuHasilStudi("2022");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        // Create Obiek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("223040010", "Rafli");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK(); // Hitung IPK setelah menambahkan KHS
        transkrip.display();
    }
}
