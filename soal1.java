import java.util.Scanner;

public class soal1{
    public static void main(String[] args) {
        Scanner sil = new Scanner  (System.in);
        int masuk,keluar,lama;

        System.out.print("Lama Bekerja :");

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
        System.out.print("lama =    "+lama);
        sil.close();
    }
}