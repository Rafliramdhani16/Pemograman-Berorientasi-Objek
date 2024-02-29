class Student {
    private String nrp;

    // Method untuk mengatur nilai NRP (Nomor Registrasi Mahasiswa)
    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    // Method untuk mendapatkan nilai NRP
    public String getNrp() {
        return this.nrp;
    }
}

class Main {
    public static void main(String[] args) {
        // Membuat objek Student x
        Student x = new Student();
        // Menginisialisasi objek Student y dengan referensi ke objek x
        Student y = x;

        // Mengatur NRP objek x menjadi "01"
        x.setNrp("01");
        // Mengatur NRP objek y menjadi "02", karena y mengacu pada objek yang sama dengan x
        y.setNrp("02");
        // Mencetak NRP objek x (akan mencetak "02" karena objek x dan y mengacu pada objek yang sama)
        System.out.println(x.getNrp());

        // Membuat objek Student z
        Student z = new Student();
        // Mengatur NRP objek z menjadi "03"
        z.setNrp("03");
        // Mengubah referensi objek x untuk menunjuk ke objek z
        x = z;
        // Mencetak NRP objek x (akan mencetak "03" karena x sekarang mengacu pada objek z)
        System.out.println(x.getNrp());

        // Mencetak NRP objek y (akan mencetak "02" karena y masih mengacu pada objek yang sama dengan x, sebelum x diubah menjadi z)
        System.out.println(y.getNrp());
    }
}
