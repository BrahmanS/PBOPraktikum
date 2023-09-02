/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author brahm
 */
public class Constants2 {

    /**
     * @param args the command line arguments
     */
    public static final double CM_PER_INCH = 2.54; // Deklarasi konstanta global
    public static void main(String[] args) {
     double paperWidth = 8.5;
     double paperHeight = 11;
     System.out.println("Paper size in centimeters: " + paperWidth *
     CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
