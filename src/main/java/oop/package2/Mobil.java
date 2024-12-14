package oop.package2;

public class Mobil {
    private String namamerk;
    private String Tahun;
    private String warna;
    private int jumlahduduk;

    public Mobil() {
        System.out.println("ini akan di eksekusi sesudah initial");
    }

    public Mobil(String x){
        System.out.println("Ini akan di eksekusi setelah initial yang ada parameternya");
    }

    public void setNamamerk(String namamerk) {
        this.namamerk = namamerk;
    }

    public String getNamamerk() {
        return namamerk;
    }

    public String getTahun() {
        return Tahun;
    }

    public void setTahun(String tahun) {
        Tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getJumlahduduk() {
        return jumlahduduk;
    }

    public void setJumlahduduk(int jumlahduduk) {
        this.jumlahduduk = jumlahduduk;
    }
}
