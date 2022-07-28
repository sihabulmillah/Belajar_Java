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
public class Tugas_ProgramKelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Masukan nama siswa : ");
        String nama = scanner .nextLine();
        
        System.out.println("Masukan nilai siswa : ");
        int nilai = scanner.nextInt();
       
        if (nilai > 55){
            System.out.print("Nama siswa : " +nama+" Nilai "+nilai+" dinyatakan Lulus " );}
        else System.out.print("Nama siswa : " +nama+" Nilai "+nilai+" dinyatakan Tidak Lulus ");
        
        if (nilai >=0 && nilai <=30){   
            System.out.println("dengan Grade E: Predikat Sangat Buruk");}
        else if (nilai >=31 && nilai <=55){
            System.out.println("dengan Grade D: Predikat Buruk");}
        else if (nilai >=56 && nilai <=69){
            System.out.println("dengan Grade C: Predikat Cukup");}
        else if (nilai >=70 && nilai <=84){
            System.out.println("dengan Grade B: Predikat Memuaskan");}
        else if (nilai >=85 && nilai <=100){
            System.out.println("dengan Grade A: Predikat Sangat Memuaskan");}
        else System.out.println("Nilai di luar itu ");
     
}
}
