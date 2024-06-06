package week9;

public class BangunRuang {
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    private double jariJari;

    public BangunRuang(int sisi) {
        this.sisi = sisi;
    }

    public BangunRuang(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public BangunRuang(double jariJari) {
        this.jariJari = jariJari;
    }

    public int hitungVolumeKubus() {
        return sisi * sisi * sisi;
    }

    public int hitungVolumeBalok() {
        return panjang * lebar * tinggi;
    }

    public double hitungVolumeBola() {
        return (4.0 / 3.0) * Math.PI * jariJari * jariJari * jariJari;
    }

    public int getSisi() {
        return sisi;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }
}

