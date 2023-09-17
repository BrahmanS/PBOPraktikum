class KelasSatu
{
    {
        System.out.println(11); //instance inisialization block, setiap dipanggil
    }
    static
    {
        System.out.println(2); //static inisialization block, hanya dipanggil sekali dan di awal
    }
    public KelasSatu(int i)
    {   
        System.out.println(3);
    }
    public KelasSatu()
    {
        System.out.println(4);
    }
}

