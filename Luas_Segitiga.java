/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas_segitiga;
import java.util.Scanner;

/**
 *
 * Nama : Emia Rosta Br. Sebayang
 * NIM : 3411191062
 * Kelas : DSE-B
 */
public class Luas_Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.println("menghitung luas segitiga");
        System.out.println("========================");
        System.out.println("masukkan alas");
        a=input.nextInt();
        System.out.println("menghitung tinggi");
        t = input.nextInt();
        
        luas = 0.5*a*t;
        System.out.println("luas segitiga adalah " + luas);
    }
    
}
