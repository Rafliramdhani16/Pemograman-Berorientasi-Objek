public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    public MataKuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

    public double nilaiIndex() {
        double nilai = 0;
        switch (index) {
            case "A":
                nilai = 4.0;
                break;
            case "AB":
                nilai = 3.5;
                break;
            case "B":
                nilai = 3.0;
                break;
            case "BC":
                nilai = 2.5;
                break;
            case "C":
                nilai = 2.0;
                break;
            case "D":
                nilai = 1.0;
                break;
            case "E":
                nilai = 0;
                break;
            default:
                System.out.println("Index tidak valid");
        }
        return nilai;
    }

    public String display() {
        return kode + " - " + nama + " - " + index;
    }
}
