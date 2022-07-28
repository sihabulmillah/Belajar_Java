/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author petik
 */
public class perkalian1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        System.out.println("\t \t \t  Tabel Perkalian 1 s/d 5");
        System.out.println("\t \t \t_ _ _ _ _ _ _ _ _ _ _ _ _ _\n\n");
    
    for (int i = 1 ; i <= 5;i++){
        for (int j = 1 ; j <= 5;j++){
        
            int total = i * j;
            System.out.print(i+" x "+j+" = "+total+ "\t");
        }
        System.out.println("");
    }
       
    }
    
}
