package Tugas;

public class Lingkaran extends BentukGeometri implements Simetris {
    private double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double hitungVolume() {
        return 0;  // Lingkaran tidak memiliki volume
    }
    public interface Simetris {
        public boolean cekSimetri();
    }
    @Override
    public boolean cekSimetri() {
        return true;  // Lingkaran selalu simetris
    }
}
