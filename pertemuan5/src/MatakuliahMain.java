public class MatakuliahMain {
    public static void main (String[] args){
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemograman 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemograman 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "Pemograman Beroeientasi Object", "B", 3);

        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        double IPK = ((mk1.nilaiIndex()*3) + (mk2.nilaiIndex()*3) + (mk3.nilaiIndex()*3) )/9;
        System.out.println(IPK);

    }


}
