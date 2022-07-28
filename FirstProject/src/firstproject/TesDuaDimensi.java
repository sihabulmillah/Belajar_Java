/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;
/**
 *
 * @author petik
 */
public class TesDuaDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Luas lingkaran    
    float jari = 8f;
        System.out.println("Luas Lingkaran dengan jari2 " + jari +" adalah "+ BentukDuaDimensi.luasLingkaran(jari) );
        System.out.println("");
    // keliling lingkaran    
        System.out.println("Keliling lingkarang dengan jari2 "+ jari+ " adalah " + BentukDuaDimensi.kelilingLingkaran(jari));
        System.out.println("");
    // luas persegi panjang
    float panjang = 20f;
    float lebar = 4f;
        System.out.println("Luas persegi panjang dengan panjang "+panjang+ " dan lebar "+lebar+ " adalah "+BentukDuaDimensi.luasPersegiPanjang(panjang, lebar));
        System.out.println("");
    // luas persegi 
    String sisi = "10";
        System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + BentukDuaDimensi.luasPersegi(sisi));
        System.out.println("");
    // luas segitiga    
    float alas = 5f;
    float tinggi = 10f;
        System.out.println("Luas Segitiga dengan alas "+ alas+ ", tinggi "+ tinggi+" adalah " + BentukDuaDimensi.luasSegitiga(alas, tinggi));
        System.out.println("");    
    
    }
    
}
