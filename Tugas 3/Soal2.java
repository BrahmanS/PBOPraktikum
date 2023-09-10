import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("================================");

        for(int i=0;i<3;i++){

            String word=scan.next();
            int num=scan.nextInt();
            System.out.printf("%-15s%03d%n", word, num); //-15 untuk ukuran panjang string 15 karakter, 
                                                                //lalu 03d untuk jika kurang dari 3 digit ditambahkan 0 didepan

        }

        System.out.println("================================");

        scan.close();
    }
}
