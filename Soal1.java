public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2); 
        // pada tipe data byte hanya bisa mencapai -128 hingga 127 maka akan menyebabkan overflow
        // karena overflow maka nilai keblai ke -128 hingga hasilnya -125

        System.out.println("Hasil 1  "+hasil);
    }
}
