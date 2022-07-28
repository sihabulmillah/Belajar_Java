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
public class Percabangan_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Masukan umur anda : ");
        int umur = scanner.nextInt();
        
        switch(umur){ //Switch case fungsinya sama dengan if else 
        case 17 : System.out.println("Anda berumur 17 tahun");
            break; // gunanya break untuk menghentikan kondisi tersebut
        case 18 : System.out.println("Anda berumur 18 tahun");
            break;
        case 19 : System.out.println("Anda berumur 19 tahun");
            break;
        case 20 : System.out.println("Anda berumur 20 tahun");
            break;
        default : //kumpulan untuk kemungkinan di luar kondisi case
            System.out.println("Anda tidak berumur 17,18,19 atau 20 tahun");}
        //kalau case itu tepat di angka yang di masukan tidak bisa memasukan >/<
    
    }
    
}
