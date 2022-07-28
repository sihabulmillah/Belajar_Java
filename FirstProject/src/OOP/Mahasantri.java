/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author petik
 */
public class Mahasantri {
    public int nim;
    public String nama;
    public float ipk;
    
    public String predikat(){
        if(this.ipk > 3.75f){
            return "Cumlaude";
        }else{
            return "Welldone";
        }
    }
//    Construktor
    public Mahasantri(int nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public Mahasantri(String nama, float ipk) {
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public Mahasantri() {
    }
}
