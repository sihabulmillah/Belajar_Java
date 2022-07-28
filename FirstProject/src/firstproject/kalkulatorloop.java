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
public class kalkulatorloop {
     public static float tambah(float a, float b){
        float hasil = a + b;       
        return hasil;
    }
    public static float kurang(float a, float b){
        float hasil = a - b;
        return hasil;
    }
    public static float kali(float a, float b){
        float hasil = a * b;
        return hasil;
    }
    public static float bagi(float a, float b){
        float hasil = a / b ;
        return hasil;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    float a,b,c,hasil;
    char operator;
    int pilih;
    do{
        System.out.print("Masukan bilangan Pertama : ");
         a = input.nextFloat();
       
        System.out.print("Masukan operator :  ");
        operator = input.next().charAt(0);
        
        System.out.print("Masukan bilangan kedua : ");
         b = input.nextFloat();
         System.out.println("");
           
        hasil = 0;
        
        if(operator == '+'){
            hasil = tambah(a,b);
            System.out.println(a+" + "+b+" = "+hasil);
        }else if(operator == '-'){
            hasil = kurang(a,b);
            System.out.println(a+" - "+b+" = "+hasil);
        }else if(operator == '*'){
            hasil = kali(a,b);
            System.out.println(a+" * "+b+" = "+hasil);
        }else if(operator == '/'){
            hasil = bagi(a,b);
            System.out.println(a+" / "+b+" = "+hasil);
        }
        
        System.out.println("");
        System.out.println("Tindakan apa selanjutnya ?");
        System.out.println("1. Melanjutkan perhitungan");
        System.out.println("2. Mengulang perhitungan");
        System.out.println("3. Berhenti");
        System.out.print("Masukan pilihan : ");
        pilih = input.nextInt();
        System.out.println("");
       
        if(pilih == 1){
           System.out.println("Bilangan sebelumnya : " + hasil);
           while(pilih == 1){
               System.out.print("Masukan operator : ");
               operator = input.next().charAt(0);
               System.out.print("Masukan bilangan selanjutnya : ");
               c = input.nextFloat();
               System.out.println("");
               float hasil1 = hasil;
        
        if(operator == '+'){
            hasil1 = tambah(hasil,c);
            System.out.println(hasil+" + "+c+" = "+tambah(hasil,c));
        }else if(operator == '-'){
            hasil1 = kurang(hasil,c);
            System.out.println(hasil+" - "+c+" = "+kurang(hasil,c));
        }else if(operator == '*'){
            hasil1 = kali(hasil,c);
            System.out.println(hasil+" * "+c+" = "+kali(hasil,c));
        }else if(operator == '/'){
            hasil1 = bagi(hasil,c);
            System.out.println(hasil+" / "+c+" = "+bagi(hasil,c));
        }
        System.out.println("");
        System.out.println("Tindakan apa selanjutnya ?");
        System.out.println("1. Melanjutkan perhitungan");
        System.out.println("2. Mengulang perhitungan");
        System.out.println("3. Berhenti");
        System.out.print("Masukan pilihan : ");
        pilih = input.nextInt();
        System.out.println("");
        hasil = hasil1;
        if(pilih == 1){
          System.out.println("Bilangan sebelumnya : "+ hasil1);
            }
           }
        }else if(pilih == 3){ System.out.println("Sukses");
        }
    
    }while(pilih == 2);
    
    }
    
}
