/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriDasar_Method;

/**
 *
 * @author petik
 */
public class Loop_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("\nWhile");
//        //while di gunakan ketika kita tidak tau jumlah pengulangannya
// pengecekan kondisi di lakukan dahulu jika true maka akan di jalankan 
//        while/selama (kondisi) {
//                aksi
//      }
        
        int b = 1;
        while (b < 10){
            System.out.println(b);
        b++;
        }
        
        System.out.println("\nWhile dan Array");    
        int bilangan[]= {4, 5, 7, 8, 9};
        int total = 0, indexArray = 0;
     
        while(indexArray < bilangan.length){
            total += bilangan[indexArray];
//          total = total + bilangan[indexArray];
            System.out.println(bilangan[indexArray] + " ");
            indexArray++;
     }
        float rata2 = (float)total / bilangan.length;
        System.out.println("rata2-nya : " + rata2);
    }
    
}
