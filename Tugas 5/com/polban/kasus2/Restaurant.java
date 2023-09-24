package com.polban.kasus2;



public class Restaurant {
    private Produk[] produk;
    private static byte idProduk = 0;

    public Restaurant() {
        produk = new Produk[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        produk[idProduk] = new Produk(nama, harga, stok);
        idProduk++;
    }

    public void tampilMenuMakanan() {
        System.out.println("Menu Makanan:");
        for (int i = 0; i < idProduk; i++) {
            System.out.println(i + 1 + ". " + produk[i].getNamaProduk() + "\tRp. " + produk[i].getHarga() + "\tStok: " + produk[i].getStok());
        }
    }

    public boolean pesanMakanan(int pilihan, int qty, Penjualan penjualan) {
        int index = pilihan - 1;
        if (index >= 0 && index < idProduk && produk[index].getStok() >= qty) {
            double hargaTotal = produk[index].getHarga() * qty;
            produk[index].kurangiStok(qty);
            penjualan.tambahPenjualan(produk[index].getNamaProduk(), qty, hargaTotal);
            return true;
        }
        return false;
    }
}
