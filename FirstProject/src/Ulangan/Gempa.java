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
public class Gempa {
//member1 var
private String daerah;
private float skala;
private String dampak;
//member2 konstruktor
public Gempa(String daerah, float skala){
this.daerah = daerah;
this.skala = skala;
}
//member3 method
public String dampak(){
    
    this.dampak = "";
    if(this.skala < 3f ){
    this.dampak = "TIDAK TERASA";
    }else if (this.skala <= 5f ){
    this.dampak = "BANGUNAN RETAK RETAK";
    }else if (this.skala <= 8f ){
    this.dampak =  "SELURUH BANGUNAN ROBOH";
    }else {
    this.dampak = "BANGUNAN HANCUR LEBUR DAN BERPOTENSI TSUNAMI";
    }
    return this.dampak;       
}
    
@Override
public String toString() {
    return "Gempa di daerah " + this.daerah + ", dengan skala " +
    this.skala +" richter, berdampak " + this.dampak;
}
}
