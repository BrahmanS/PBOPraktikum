package com.polban.kasus1;
import java.util.logging.Level;
import java.util.logging.Logger;

    public class Restaurant {
        private static final Logger logger = Logger.getLogger(Restaurant.class.getName());
        
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
                    logger.log(Level.INFO, "{0} [{1}] \tRp. {2}", new Object[]{namaMakanan[i], stok[i], hargaMakanan[i]});
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