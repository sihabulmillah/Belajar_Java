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
public class nilaiDiklat {
    public int id;
    public String nama;
    public float pretest;
    public float postest;
    public float kehadiran;
    
    public float getHasil(){
        float hasil = (float) (0.2 * this.pretest + 0.6 * this.postest + 0.2 * this.kehadiran); 
        return hasil;    
    }
    public String getGrade(){
        if( this.getHasil() > 65 ){
        return "Lulus";
        }else 
            return "Tidak Lulus";
    }        
    }

