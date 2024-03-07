import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args) {
        // Deklarasi variabel untuk alas dan tinggi
        int  alas;
        int tinggi; 
        double luas;
        double jawab;

        //



         //scan baru 
       Scanner scn = new Scanner(System.in);


        // Menampilkan hasil
       System.out.print ("Alas Segitiga: ");
       alas =scn.nextInt();

       System.out.print("Tinggi Segitiga: "); 
       tinggi =scn.nextInt();

       System.out.print("Luas segitiga: ");
       luas = scn.nextDouble();

       //hitung 

       jawab = luas *  alas * tinggi;

    

       //menampilkan output 
       System.out.println("---------------------");
       System.out.println("Alas Segitiga : " + alas);
       System.out.println("Tinggi Segitig : "+ tinggi);
       System.out.println("Luas Segitiga:" + luas);
       System.out.println("Jawabanya: " + jawab );
       
       
      
        scn.close();
    }
}
