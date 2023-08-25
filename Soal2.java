public class Soal2{
    public static void main(String[] args) {
        int i=42;
        String s = (i<40)?"life":(i>50)?"universe":"everything";
        //Menggunakan operator Ternary. Operator Ternary mirip dengan if conditional
        //karena i=42 maka tidak sesuai dengan 2 kondisi tersebut yaitu i<40 dan i>50. Maka saat dijalankan outputnya "Everything"
        System.out.println(s);
    }
}
