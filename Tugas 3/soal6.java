import java.math.BigInteger;
import java.util.Scanner;

public class soal6 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String Big1str = scan.nextLine();
        String Big2str = scan.nextLine();

        if(Big1str.length()<=200 && Big2str.length()<=200){

            BigInteger Big1 = new BigInteger(Big1str); //inisialisasi bigint
            BigInteger Big2 = new BigInteger(Big2str);

            BigInteger Tambah = Big1.add(Big2); //operasi tambah pada bigint
            BigInteger Kali = Big1.multiply(Big2); //operasi kali pada bigint

            System.out.println(Tambah.toString());
            System.out.println(Kali.toString());    

        }

        else{
            System.out.println("Input melebihi 200");
        }

        scan.close();
    }
}
