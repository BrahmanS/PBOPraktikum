package com.polban.kasus2;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Bala-Bala", 1000, 20);
        menu.tambahMenuMakanan("Gehu", 1000, 20);
        menu.tambahMenuMakanan("Tahu", 1000, 10);
        menu.tambahMenuMakanan("Molen", 1000, 15);
        menu.tambahMenuMakanan("Baso", 1000, 20);
        menu.tambahMenuMakanan("Mie", 1000, 20);
        menu.tambahMenuMakanan("Keripik", 1000, 10);
        menu.tambahMenuMakanan("Burger", 1000, 15);
        menu.tambahMenuMakanan("Pisang", 1000, 20);
        menu.tambahMenuMakanan("Air", 1000, 20);

        boolean pesanLagi = true;
        Penjualan penjualan = new Penjualan();

        while (pesanLagi) {
            // Menampilkan menu
            menu.tampilMenuMakanan();
            
            System.out.print("Pilih menu (0 untuk selesai): ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 0) {
                pesanLagi = false;
                continue;
            }

            System.out.print("Jumlah yang akan dipesan: ");
            int qty = scanner.nextInt();

            if (menu.pesanMakanan(pilihan, qty, penjualan)) {
                System.out.println("Menu telah ditambahkan ke pesanan.");
            } else {
                System.out.println("Maaf, stok tidak mencukupi.");
            }

            System.out.print("Pesan lagi? (1 untuk Ya, 0 untuk Tidak): ");
            int pesanLagiInput = scanner.nextInt();
            pesanLagi = pesanLagiInput == 1;
        }

        System.out.println("\nPesanan Anda:");
        penjualan.tampilPesanan();
        System.out.println("Total Bayar: Rp. " + penjualan.hitungTotalBayar());

        scanner.close();
    }
}