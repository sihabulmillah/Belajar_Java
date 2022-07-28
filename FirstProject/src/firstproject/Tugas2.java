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
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukan Nomor Kendaraan : ");
        Scanner scanner = new Scanner(System.in);
        String nomor = scanner.nextLine(); 
    
        System.out.println("Masukan Jam Masuk : ");
        byte masuk = scanner.nextByte();
        
        System.out.println("Masukan Jam Keluar : ");
        byte keluar = scanner.nextByte();
        byte durasi = (byte) (keluar-masuk);  
        System.out.println("Durasi : " + durasi +" jam");
       
        int biaya = (int)1000+durasi*1000;
        System.out.println("Biaya Parkir Kendaraan " + nomor + " selama " +durasi+ " jam sebesar "+biaya);
       
    }
    
}
