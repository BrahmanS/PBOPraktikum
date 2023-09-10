import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] words = s.split("[^A-Za-z]+"); //memisahkan selain huruf

        System.out.println(words.length);

        for (String word : words) { //mengulang hingga semua elemmen pada array selesai di iterasi  
                                    //String word deklarasi variable baru lalu menyimpan data dari array words  
            System.out.println(word);
        }

        scan.close();
    }
}