package week_1;

public class AksiMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mhs1 dari kelas Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        
        // Mengatur nilai atribut mhs1
        mhs1.nim = "123456789";
        mhs1.nama = "John Doe";
        mhs1.usia = 20;
        
        // Memanggil method getIdentitas dan belajar dari objek mhs1
        mhs1.getIdentitas();
        mhs1.belajar();

        // Membuat objek mhs2 dari kelas Mahasiswa
        Mahasiswa mhs2 = new Mahasiswa();
        
        // Mengatur nilai atribut mhs2
        mhs2.nim = "987654321";
        mhs2.nama = "Jane Smith";
        mhs2.usia = 21;
        
        // Memanggil method getIdentitas dan belajar dari objek mhs2
        mhs2.getIdentitas();
        mhs2.belajar();
    }
}
