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
public class Percabangan_Else_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai anda : ");
        float nilai = scanner.nextFloat();
        
        if (nilai >= 0 && nilai <= 20 ){
            System.out.println("Nilai anda buruk"); }
        else if (nilai >= 21 && nilai <= 40){
            System.out.println("Nilai anda kurang");}
        else if (nilai >= 41 && nilai <= 60){
            System.out.println("Nilai anda cukup");}
        else if (nilai >= 61 && nilai <= 80){
            System.out.println("Nilai anda baik");}
        else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Nilai anda memuaskan");}
        else {
            System.out.println("Nilai di luar batas");}
    //else adalah kumpulan di luar kemungkinan
    }
}
