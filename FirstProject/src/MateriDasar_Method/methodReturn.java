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
public class methodReturn {

    public static int pangkatDua(int bil){
        return bil * bil ;
    }
    
    public static float getDiskon(float harga, float persen){
        float diskon = harga * persen / 100;
        return diskon;        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // cara memanggilnya bisa langsung dengan sout
//        System.out.println(pangkatDua(6));
        // atau bisa di simpan dulu di dalam variabel  
        // jika tidak di smipan maka tidak akan tampil
        // untuk mengetahui parameternya bisa dengan keyword ctrl+p
        
//        int bil2 = pangkatDua(10);
//        System.out.println(bil2);
    
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama barang : ");
        String nama = input.next();
        System.out.print("Masukan harga barang : ");
        float harga = input.nextInt();
        System.out.print("Masukan diskon : ");
        byte disk = input.nextByte();
        float diskon = getDiskon(harga,disk);
        System.out.println("Diskon sebesar " + disk +  "% atau sebesar " + diskon);
        float bayar = harga - diskon;
        System.out.println("Jadi anda cukup membayar sebesar " + bayar);
        
        
        belajarMethod.olahJus("Alpukat");
        belajarMethod.salam();
    }
    
}
