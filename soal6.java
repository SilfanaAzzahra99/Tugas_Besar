import java.util.Scanner;
 
public class soal6{
   public static void main(String[] args) {
        Scanner sil = new Scanner(System.in);
        int jam_start,menit_start,jam_stop,menit_stop,total_menit1,total_menit2,selang_menit,jam_durasi,menit_durasi;
        
        jam_start = sil.nextInt();
        System.out.print("Jam Start : "+jam_start);
        menit_start = sil.nextInt();
        System.out.print("Menit Start : "+menit_start);
        jam_stop = sil.nextInt();
        System.out.print("Jam Stop : "+jam_stop);
        menit_stop = sil.nextInt();
        System.out.print("Menit Stop : "+menit_stop);

        total_menit1 = jam_start * 60 + menit_start;
        total_menit2 = jam_stop * 60 + menit_stop;

        if(total_menit1 >= total_menit2){
            selang_menit = total_menit2 - total_menit1;
        }else{
            selang_menit = ((12*60)-total_menit1) + total_menit2;
        }

        jam_durasi = selang_menit / 60;
        menit_durasi = selang_menit % 60;

        System.out.print("Jam Durasi : "+jam_durasi);
        System.out.print("Menit Durasi : "+menit_durasi);
        sil.close();
    }

}


