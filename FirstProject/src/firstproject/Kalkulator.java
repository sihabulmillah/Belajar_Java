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
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner inputuser = new Scanner(System.in);
        float a,b,c,hasil = 0;
        String operator;
        
        System.out.print("nilai a = ");
        a = inputuser.nextFloat();
        System.out.print("operator = ");
        operator = inputuser.next();
        System.out.print("nilai b = ");
        b = inputuser.nextFloat();
//       equals memiliki arti kata mengandung atau memiliki 
        if ("+".equals(operator)){
//       jika tanda tambah mengandung apa yang di inputkan oleh  user dalam operator
            hasil = a + b ;
            System.out.println("Hasil = " + hasil);}
        else if("-".equals(operator)){
            hasil = a - b ;
            System.out.println("Hasil = " + hasil);}
        else if ("*".equals(operator)){
            hasil = a * b ;
            System.out.println("Hasil = " + hasil);}
        else if ("/".equals(operator)){
            hasil = a / b ;
            System.out.println("Hasil = " + hasil);}
        else {System.out.println("Operator " + operator + " tidak di temukan");}
    
        System.out.println("Lanjut Perhitungan ? Ya atau Tidak ");
        String next = inputuser.next();
        
        if(next == "Ya"){
            System.out.println("Operator = ");
            operator = inputuser.next();
            System.out.println("Nilai C = ");
            c = inputuser.nextFloat();
            hasil = hasil + c ;
            System.out.println("Hasil = " + hasil);
        }
        else{System.out.println("Cukup");}
    }
    
}
