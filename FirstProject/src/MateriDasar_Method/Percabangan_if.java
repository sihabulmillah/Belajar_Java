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
public class Percabangan_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Selamat datang di Bioskop 12 \n");
        System.out.print("Masukan umur anda : ");
        Scanner scanner = new Scanner(System.in);
        int umur = scanner.nextInt();
            if(umur >= 13) {
                System.out.println("Anda Harus Membeyar Tiket Masuk ");}
            System.out.println("Silahkan Masuk");
    
    }
    
}
