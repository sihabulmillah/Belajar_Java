/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ulangan;

/**
 *
 * @author petik
 */
public class infoGempa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //membuat object
    Gempa g1 = new Gempa("Tokyo", 5.5f);
    Gempa g2 = new Gempa("Thailand" ,2.5f);
    Gempa g3 = new Gempa("Israel", 12.0f);
    
    //memanggil method dampak
    g1.dampak();
    g2.dampak();
    g3.dampak();
    //mencetak dampak gempa
    System.out.println(g1);
    System.out.println(g2);
    System.out.println(g3);
    }
}
