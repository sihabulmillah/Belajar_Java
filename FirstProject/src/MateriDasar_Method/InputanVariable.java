/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriDasar_Method;

import java.util.Scanner;
/**
 *
 * @author petik
 */
public class InputanVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            System.out.print("Masukan Nama : ");
            Scanner scanner = new Scanner(System.in);
            String nama = scanner.nextLine(); // baca inputan string
            
            System.out.println("Masukan Umur Anda : ");
            int umur = scanner.nextInt();
            
            System.out.println("Masukan Berat Anda : ");
            float berat = scanner.nextFloat();
            
            System.out.println("Hello " + nama + " umur " + umur);
            System.out.println("Berat anda" + berat + "Kg");
    }       
    
}
