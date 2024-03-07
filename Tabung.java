import java.util.Scanner;
public class Tabung {
    public static void main(String[] args) {

        int diameter; 
        int tinggi; 
        double jariJari;
        double jawab;

        // scan baru 
        Scanner scn = new Scanner(System.in);

        //menampilkan hasil 
        System.out.print("diameter   tabung : ");
        diameter = scn.nextInt();

        System.out.print("  tinggi     tabung : ");
        tinggi = scn.nextInt();

        //hitung jari jari 
        jariJari = diameter / 2.0;

        //proses hitung rumus 
        jawab = 3.14 * jariJari * jariJari * tinggi;

        //hasil outpur 
        System.out.println("diameter tabung : " + diameter); 
        System.out.println("tinggi : " + tinggi);
        System.out.println("jariJari : " + jariJari);
        System.out.println("jawaban: "  + jawab);
    }   
} 