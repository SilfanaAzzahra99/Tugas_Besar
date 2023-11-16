import java.util.Scanner; 
public class soal3{
   public static void main(String[] args) {
        Scanner sil = new Scanner(System.in);
        int pilihan,R1,R2,R3,ResPengganti;
        pilihan = sil.nextInt();
        R1 = sil.nextInt();
        R2 = sil.nextInt();
        R3 = sil.nextInt();
        System.out.println("R1 : "+R1);
        System.out.println("R2 : "+R2);
        System.out.println("R3 : "+R3);
        switch(pilihan){
            case 1:
            ResPengganti = R1 + R2 + R3;
            System.out.print("Resistor Pengganti : "+ResPengganti);
            break;
            case 2:
            ResPengganti = (1/R1) + (1/R2) + (1/R3);
            ResPengganti = 1/ResPengganti;
            System.out.print("Resistor Pengganti :" +ResPengganti);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
            sil.close();
        }
    }
}