import java.util.Scanner;

public class soal5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        str = str.replaceAll("\\s", ""); //menghapus white space pada string

        if(str.length()==12){

            long plat1 = Long.parseLong(str);

            System.out.println(plat1);

             if((plat1-999999)%5==1){
                System.out.println("Berhenti");
            } 

            else {
                  System.out.println("Jalan");
            }
        }

        else if(str.length()>12){
            System.out.println("Plat nomer yang diinputkan terlalu banyak");
        }

        else if(str.length()<12){
            System.out.println("Plat nomer yang diinputkan terlalu sedikit");
        }
        
        scan.close();
    }
}
