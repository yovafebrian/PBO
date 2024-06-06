package week9;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar(4, 6);
        System.out.println("Panjang: " + bd.getPanjang());
        System.out.println("Lebar: " + bd.getLebar());
        System.out.println("Luas: " + bd.luas(bd.getPanjang(), bd.getLebar()));

        BangunRuang br = new BangunRuang(5);
        System.out.println("Sisi: " + br.getSisi());
        System.out.println("Volume Kubus: " + br.hitungVolumeKubus());
    }
}