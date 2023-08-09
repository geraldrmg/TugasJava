import java.util.Scanner;

public class awal{
    public static void main(String[] args) {
        double bukuTulis, pensil, penghapus, peggaris;
        bukuTulis=3000;
        pensil=2000;
        penghapus=1500;

        Scanner input=new Scanner(System.in);
        System.out.println("Masukan Jumlah Beli Buku Tulis");
        double jumlahBuku=input.nextDouble();
        double total=jumlahBuku*bukuTulis;
        System.out.println("Masukan Jumlah Beli Pensil");
        double jumlahPensil=input.nextDouble();
        total +=jumlahPensil*pensil;
        System.out.println("Masukan Jumlah Beli Penghapus");
        double jumlahPenghapus=input.nextDouble();
        total +=jumlahPenghapus*penghapus;
        System.out.println("Masukan Pembayaran:");
        double bayar=input .nextDouble();
        double diskon=0.05*total;
        double kembali=bayar-(total-diskon);
        System.out.println("Total Diskon:"+diskon);
        System.out.println("Total Kembalian:"+kembali);

    
    }
}