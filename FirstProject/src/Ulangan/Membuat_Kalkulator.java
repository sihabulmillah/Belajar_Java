/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulangan;
import java.util.Scanner;
/**
 *
 * @author petik
 */
public class Membuat_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
       System.out.print("Masukan bilangan pertama = ");
        float a = scanner.nextFloat();
        
       System.out.print("Operator : ");
       String operator = scanner.next();
       
       System.out.print("Masukan bilangan kedua = ");
        float b = scanner.nextFloat();
      
      float hasil = 0;
    if(null != operator)switch (operator) {
          case "+":
              hasil = a + b ;
                break;
           case "-":
               hasil = a - b ;
                break;
            case "*":
                hasil = a * b ;
               break;
           case "/":
               hasil = a / b ;
               break;
            default:
                break;
        }
       
        
       System.out.println("Hasil Perhitungan dari \n"+a +" " + operator +" " + b +" = " + hasil);
        
       System.out.println("melanjutkan atau mengulang perhitungan ? ");
       String terus = scanner.next();
    } 
}   