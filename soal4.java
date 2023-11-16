import java.util.Scanner;
 
public class soal4{
   public static void main(String[] args) {
        Scanner sil = new Scanner(System.in);
        int Harga;
        Double Kode,Diskon;
        String Jenis;
        System.out.print("Pilihan:\n 1. A = 10%\n 2. B = 15%\n 3. C = 20%\n");
        System.out.print("Masukkan Pilihan :");
        Jenis = sil.nextLine();
        System.out.println("================");
        switch(Jenis){
            case "A":
            Kode = 0.10;
            Harga = sil.nextInt();
            System.out.println("Masukkan Harga : "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga : "+Diskon);
            break;
            case "B":
            Kode = 0.15;
            Harga = sil.nextInt();
            System.out.println("Masukkan Harga : "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga : "+Diskon);
            break;
            case "C":
            Kode = 0.20;
            Harga = sil.nextInt();
            System.out.println("Masukkan Harga : "+Harga);
            Diskon  = Kode * Harga;
            System.out.println("Tampilkan Harga : "+Diskon);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
            sil.close();
        }
    }
}
