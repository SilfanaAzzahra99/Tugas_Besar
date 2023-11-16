import java.util.Scanner;
 
public class soal5{
   public static void main(String[] args) {
        Scanner sil = new Scanner(System.in);
        int Gol,Jam,Upah;
        double Gaji;
        System.out.print("Masukkan Pilihan :");
        Gol = sil.nextInt();
        Jam = sil.nextInt();
        System.out.println("Masukkan Jam :     "+Jam);
        Upah = 0;
        System.out.println("================");
        switch(Gol){
            case 1:
            Upah = 3000;
            break;
            case 2:
            Upah = 3500;
            case 3:
            Upah = 4000;
            break;
            case 4:
            Upah = 4500;
            default:
            System.out.println("Salah Pilih ! :(");
        }

        if (Jam > 40){
            Gaji = 40 * Upah + (Jam - 40)* 1.5 * Upah;
        }else{
            Gaji = Jam * Upah;
        }
        System.out.println("Gaji : "+Gaji);
        sil.close();
    }
}

