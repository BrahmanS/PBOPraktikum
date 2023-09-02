import java.io.*;
import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        System.out.println("Input First Word : ");
        String A = scan.next();
        System.out.println("Input Second Word : ");
        String B = scan.next();
        scan.close();

        System.out.print("Length : ");
        System.out.println(A.length() + B.length()); //length() untuk menghitung panjang string

        System.out.print("lexicographically : ");
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No"); // compareTo() untuk membandingkan string, dan juga menggunakan ternary
        
    
        System.out.println(capitalized(A) + " " + capitalized(B));
    }
    
    private static String capitalized(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1); 
            // substring() untuk mengambil huruf pertama.
            // toUpperCase() untuk merubah huruf pertama yang sudah diambil menjadi kapital
            // substring() kedua untuk menambah kan huruf kedua hingga akhir ke huruf pertama yang sudah menjadi huruf kapital
        }
    }
}

