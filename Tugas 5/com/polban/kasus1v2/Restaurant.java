package com.polban.kasus1v2;


    public class Restaurant {
        
        //mengubah public menjadi private (Always keep data private)
        private String[] namaMakanan;
        private double[] hargaMakanan;
        private int[] stok;
        private static byte idMakanan = 0;

        public Restaurant() {
            namaMakanan = new String [10];
            hargaMakanan = new double[10];
            stok = new int[10];
        }

        public void tambahMenuMakanan (String nama, double harga, int stok) {
            this.namaMakanan[idMakanan] = nama;
            this.hargaMakanan [idMakanan] = harga;
            this.stok[idMakanan] = stok;
        }


        public void tampilMenuMakanan () {
            for (int i=0; i<=idMakanan;i++) {
                if(!isOutOfStock (i)) {
                    System.out.println(namaMakanan [i] +"["+stok [i]+"]"+"\tRp. "+hargaMakanan [i]);
                }
            
            }
        }

        public boolean isOutOfStock (int idMakanan) {
            return stok[idMakanan] == 0;
        }
        public static void nextId() {
            idMakanan++;
        }
    }