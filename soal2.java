import java.util.Scanner;

public class soal2{
    public static void main(String[] args) {
        Scanner sil = new Scanner  (System.in);
        int masuk,keluar,lama,biaya;

        System.out.print("Biaya Parkir :");

        masuk = sil.nextInt();
        System.out.print("Masukan Jumlah Masuk :"+masuk);

        keluar = sil.nextInt();
        System.out.print("Masukan Jumlah Keluar :"+keluar);


        //cek total nilai belanja 
        if(keluar >= masuk) {
            lama = keluar - masuk;
        }else{
            lama = (12 - masuk) + keluar;
        }

        if(lama > 2){
           biaya = 2000 + (lama - 2) * 500;
        }else{
            biaya = 2000;
        }
        System.out.println("Lama =    "+lama);
        System.out.println("Biaya =    "+biaya);
        sil.close();
    }
}
