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
public class kalkulator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner inputuser;
        float a,b,hasil = 0;
        String operator;
        
        inputuser = new Scanner(System.in);
        
        System.out.print("nilai a = ");
        a = inputuser.nextFloat();
        System.out.print("operator = ");
        operator = inputuser.next();
        System.out.print("nilai b = ");
        b = inputuser.nextFloat();
                
        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = "+ hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");
  
                }
        
                System.out.println("Pilih 1 untuk lanjut, pilih 2 untuk berhenti");
                float hasil2,c;
                char operator2;
                int perulangan = inputuser.nextInt();

           if (perulangan == 1) {
           System.out.print("operator : ");
           operator2 = inputuser.next().charAt(0);
           System.out.print("nilai c : ");
           c = inputuser.nextFloat();
           
           if(operator2 == '+'){
            //penjumlahan
            hasil2 = hasil + c;
            System.out.println("hasil = " + hasil2);
             } else if (operator2 == '-'){
            // pengurangan
            hasil2 = hasil - c;
            System.out.println("hasil = " + hasil2);
             } else if (operator2 == '*'){
            // perkalian
            hasil2 = hasil * c;
            System.out.println("hasil = " + hasil2);
             } else if (operator2 == '/'){
            // pembagian
            hasil2 = hasil / c;
            System.out.println("hasil = " + hasil2);
             } else {
                 System.out.println("operator tidak ditemukan");
                
             }     
                
        } else{System.out.println("Syukron");}
    
    }
}

    
    
    
