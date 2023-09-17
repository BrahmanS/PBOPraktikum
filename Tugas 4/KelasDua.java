class KelasDua
{
    {
        System.out.println(5);//tidak dipanggil karena tidak di main
    }
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
    }
}
