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
public class belajarMethod {

    /**
     * @param args the command line arguments
     */
    public static void salam(){
        System.out.println("Goodbye World");
    }
    
    public static void kaliDua(int bil){
        int hasil = bil * 2;
        System.out.println("dua kali " + bil + " adalah " + hasil);
    
    }
    
    public static void olahJus (String buah){
        System.out.println("1. Potong " + buah + " menjadi beberapa bagian");
        System.out.println("2. Masukan " + buah + " yang sudah di potong kedalam blender");
        System.out.println("3. Masukan air gula ke dalam blender");
        System.out.println("4. Masukan es batu secukupnya");
        System.out.println("5. Nyalakan blender selama 3 menit sampai " + buah + " halus dan "
                + "tercampur rata dengan air gula" );
        System.out.println("6. Tuang jus " + buah + " kedalam gelas");
        System.out.println("7. jus " + buah + " siap disajikan");
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // cara memanggil method salam 
        salam();
        kaliDua(5);
        // method adalah prilaku atau kebiasaan yang bisa di panggil secara berulang ulang
        
        System.out.println("Cara membuat jus Alpukat");
        olahJus("Alpukat");
        
    }
    
}
