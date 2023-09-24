package com.polban.kasus2;


public class Penjualan {
    private String[] namaProduk;
    private int[] qty;
    private double[] hargaTotal;
    private int jumlahProduk;

    public Penjualan() {
        namaProduk = new String[10];
        qty = new int[10];
        hargaTotal = new double[10];
        jumlahProduk = 0;
    }

    public void tambahPenjualan(String namaProduk, int qty, double hargaTotal) {
        this.namaProduk[jumlahProduk] = namaProduk;
        this.qty[jumlahProduk] = qty;
        this.hargaTotal[jumlahProduk] = hargaTotal;
        jumlahProduk++;
    }

    public void tampilPesanan() {
        for (int i = 0; i < jumlahProduk; i++) {
            System.out.println(namaProduk[i] + "\t\t" + qty[i] + "\tRp. " + hargaTotal[i]);
        }
    }

    public double hitungTotalBayar() {
        double totalBayar = 0;
        for (int i = 0; i < jumlahProduk; i++) {
            totalBayar += hargaTotal[i];
        }
        return totalBayar;
    }
}