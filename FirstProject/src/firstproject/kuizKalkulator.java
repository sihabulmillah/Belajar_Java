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
public class kuizKalkulator {

    public static float tambah(float a, float b){
        float hasil = a + b;
       
        return hasil;
    }
    public static float kurang(float a, float b){
        float hasil = a - b;
//        System.out.println(a+" - "+b+" = "+hasil);
        return hasil;
    }
    public static float kali(float a, float b){
        float hasil = a * b;
//        System.out.println(a+" X "+b+" = "+hasil);
        return hasil;
    }
    public static float bagi(float a, float b){
        float hasil = a / b ;
//        System.out.println(a+" / "+b+" = "+hasil);
        return hasil;
    }
   
    public static float berhitung(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan Pertama : ");
        float a = input.nextFloat();
       
        System.out.print("Masukan bilangan kedua : ");
        float b = input.nextFloat();
 
        System.out.print("Masukan operator :  ");
        char operator = input.next().charAt(0);
        
        float hasil = 0;
        
        if(operator == '+'){
            hasil = tambah(a,b);
            System.out.println(hasil);
        }else if(operator == '-'){
            hasil = kurang(a,b);
            System.out.println(hasil);
        }else if(operator == '*'){
            hasil = kali(a,b);
            System.out.println(hasil);
        }else if(operator == '/'){
            hasil = bagi(a,b);
            System.out.println(hasil);
        }
        System.out.println("Tindakan apa selanjutnya ?");
        System.out.println("1. Melanjutkan perhitungan");
        System.out.println("2. Mengulang perhitungan");
        System.out.println("3. Berhenti");
        System.out.print("Masukan pilihan : ");
        int pilih = input.nextInt();
        
        if(pilih == 1){
           berhitung(hasil);
        }else if(pilih == 2){
           berhitung();
        }else if(pilih == 3){
            System.out.println("");
        }else{}
        return hasil;
    } 
    public static float berhitung(float hasil){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan bilangan selanjutnya : ");
        float d = input.nextFloat();
 
        System.out.print("Masukan operator :  ");
        char operator = input.next().charAt(0);
        
        float hasil1 = hasil;
        
        if(operator == '+'){
            hasil1 = tambah(hasil,d);
            System.out.println(hasil1);
        }else if(operator == '-'){
            hasil1 = kurang(hasil,d);
            System.out.println(hasil1);
        }else if(operator == '*'){
            hasil1 = kali(hasil,d);
            System.out.println(hasil1);
        }else if(operator == '/'){
            hasil1 = bagi(hasil,d);
            System.out.println(hasil1);
        } System.out.println("Tindakan apa selanjutnya ?");
        System.out.println("1. Melanjutkan perhitungan");
        System.out.println("2. Mengulang perhitungan");
        System.out.println("3. Berhenti");
        System.out.print("Masukan pilihan : ");
        int pilih = input.nextInt();
        
        if(pilih == 1){
           berhitung(hasil1);
        }else if(pilih == 2){
           berhitung();
        }else if(pilih == 3){
            System.out.println("");
        }else{}  
    return hasil1;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        berhitung();
        
}
}