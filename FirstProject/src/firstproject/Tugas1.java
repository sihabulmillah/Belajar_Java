/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;
/**
 *
 * @author petik
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.print("Masukan Nama Pegawai :");
            Scanner scanner = new Scanner(System.in);
            String nama = scanner.nextLine(); 
            
            System.out.println("Lama Kerja : ");
            float waktu = scanner.nextFloat();
            float gaji = (float) waktu*50000;
                    
            System.out.println("Gaji Pegawai " + nama + " Selama " + waktu + "jam adalah" + gaji);
    
    }
    
}
