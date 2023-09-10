import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int jumlahPenjualan = scan.nextInt();

        int hargaItem = 50000;

        int gajiPokok = 500000;

        int totalPenjualan = jumlahPenjualan * hargaItem;

        double bonusPenjualan = 0;

        if (jumlahPenjualan > 80) {

            bonusPenjualan = totalPenjualan * 0.35;

        } else if (jumlahPenjualan >= 40) {

            bonusPenjualan = totalPenjualan * 0.25;

        } else if (jumlahPenjualan<15){
          
            double denda = (15 - jumlahPenjualan) * hargaItem * 0.15;
            bonusPenjualan = 0;

            gajiPokok = gajiPokok - (int) denda;

        } else {
            bonusPenjualan = totalPenjualan * 0.10;
        }

        double totalGaji = gajiPokok + bonusPenjualan;

        System.out.println(totalGaji);
        
        scan.close();
    }
}
