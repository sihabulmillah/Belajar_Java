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
public class BentukDuaDimensi {
    
    public static float luasLingkaran(float jari){
    float luas = (float) ( 3.14 * jari * jari );
    return luas;
    }
    public static float kelilingLingkaran(float jari){
    float keliling = (float) (2 * 3.14 * jari);
    return keliling;
    }
    public static float luasPersegiPanjang(float panjang,float lebar){
    float luas = panjang * lebar;
    return luas;
    }
    public static float luasPersegi(String sisi){
    float luas = Float.parseFloat(sisi)*Float.parseFloat(sisi);
    return luas;
    } 
    public static float luasSegitiga(float alas, float tinggi){
    float luas = alas * tinggi / 2;
    return luas;
    }
    
    
}
