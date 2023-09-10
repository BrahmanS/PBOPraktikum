import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String parts[] = str.split(" "); //memisahkan string yang telah diinputkan dengan spasi, lalu memasukkan kedalam array

        int first = Integer.parseInt(parts[0]);
        int second = Integer.parseInt(parts[2]);
        int hasil;
        if(first>=1 && second<=1000){

            switch(parts[1]){
                
                case "+":
                    hasil=first + second;
                    System.out.println(hasil);
                break;

                case "-":
                    hasil=first - second;
                    System.out.println(hasil);
                break;
                    
                case "*":
                    hasil=first * second;
                    System.out.println(hasil);
                break;

                case "/":
                    hasil=first / second;
                    System.out.println(hasil);
                break;

                case "%":
                    hasil=first % second;
                    System.out.println(hasil);
                break;

                default:
                    System.out.println("Salah menginputkan operator");
            }

        } 
        
        else{

            System.out.println("Angka yang di inputkan melebihi/kurang dari batas");
        
        }

        scan.close();

    }
}
