package Tugas;

public abstract class BentukGeometri {
    protected String nama;

    public BentukGeometri(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract double hitungLuas();
    public abstract double hitungVolume();


}
