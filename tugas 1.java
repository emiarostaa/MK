/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelipatan3;

/**
 *
 * Nama : Emia Rosta Br. Sebayang
 * NIM  : 3411191062
 * Kelas : DSE-B
 */
public class Kelipatan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumOf3 = 0;
        int sumOf5 = 0;
        int repeat = 0;
        
        for(int x = 1; x < 1000; x++){
            if(x % 3 == 0)
                sumOf3 += x;
            
        
    }
        for(int x = 1; x < 1000; x++){
            if(x % 5 == 0)
                sumOf5 += x;
        
        
    }
    
        for(int x = 1; x< 1000; x++){
            if(x % 3 == 0 && x % 5 == 0)
                repeat += x;
}

System.out.println((sumOf3 + sumOf5) - repeat);
    }
}