package Tugas;

public class Mahasiswa extends Orang {
    private String nrp;
    private String jurusan; // added new field

    public Mahasiswa(String nrp, String nama, String alamat, String jurusan){
        super(nama, alamat);
        setNrp(nrp);
        setJurusan(jurusan); // set the jurusan
    }
    public String getNrp(){
        return nrp;
    }
    public void setNrp(String nrp){
        this.nrp = nrp;
    }
    public String getJurusan(){ // getter for jurusan
        return jurusan;
    }
    public void setJurusan(String jurusan){ // setter for jurusan
        this.jurusan = jurusan;
    }
}