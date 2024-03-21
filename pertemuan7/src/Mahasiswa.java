public class Mahasiswa {
    private String NRP;
    private String nama;

    // Konstruktor default
    public Mahasiswa() {
        // TODO Auto-generated constructor stub
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String NRP, String nama) {
        super();
        this.NRP = NRP;
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public String display() {
        return "NRP: " + NRP + ", Nama: " + nama;
    }

    // Setter untuk NRP
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }

    // Getter untuk NRP
    public String getNRP() {
        return NRP;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }
}
