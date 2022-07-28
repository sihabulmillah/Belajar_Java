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
public class BiayaParkir11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan Nomor Kendaraan :");
        String nomor = scanner.nextLine();
        
        System.out.println("Masukan Jam Masuk :");
        int masuk = scanner.nextInt();
        
        System.out.println("Masukan Jam Keluar :");
        int keluar = scanner.nextInt();
        
        int waktu;
            if(masuk > keluar){
            waktu = 12-masuk+keluar;}
            else if (masuk < keluar){
            waktu = keluar-masuk;}
            else {waktu = 12;}
            
            
        int harga = 1000*waktu+1000;    
        System.out.println("Biaya Parkir Kendaraan "+nomor+" selama "+waktu+" jam sebesar "+harga);    
    
    
    
    
    
    }
    
}
