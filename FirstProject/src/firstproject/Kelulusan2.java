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
public class Kelulusan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nama Siswa :");
        String nama = scanner.nextLine();
        System.out.println("Masukkan Nilai Siswa :");
        int nilai = scanner.nextInt();
      
        String grade = null;
        if (nilai >=0 && nilai <= 30){
            grade = "E";
        }else if (nilai >= 31 && nilai <= 55){
            grade = "D";
        }else if (nilai >= 56 && nilai <= 69){
            grade = "C";
        }else if (nilai >= 70 && nilai <=84){
            grade = "B";
        }else if (nilai >= 85 && nilai <=100){
            grade = "A";
        }               
       
        String predikat = "grade";
        switch (grade){
            case ("A") :
               predikat = "Sangat Memuaskan";
                break;
            case ("B") :
                predikat = "Memuaskan";
                break;
            case ("C") :
                predikat = "Cukup";
                break;
            case ("D") :
                predikat = "Buruk";
                break;
            case ("E") :
                predikat = "Sangat Buruk";
                break;
        }
        
        String kelulusan;
        if ( nilai > 55){
            kelulusan = "Lulus";
        }else{
            kelulusan = "Tidak Lulus";
        }
        
        String wisuda = null;
            if ("Lulus".equals(wisuda)){
            System.out.println("Nama Siswa : " +nama+" Nilai "+nilai+" dinyatakan "+kelulusan+" dengan Grade : "+grade +" "+ predikat);}
            else {System.out.println("Nama Siswa : " +nama+" Nilai "+nilai+" dinyatakan "+kelulusan+" dengan Grade : "+grade +" "+ predikat);}
    
    
    
    }
    
}
