package Latihan4;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs =new Mahasiswa("223040010", "Rafli Ramdhani", "Bandung");
        System.out.println(mhs.getNrp()+
                " - " + mhs.getNama()+
                " - " + mhs.getAlamat());
    }
}
