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
public class BelajarOverload {

    /**
     * @param args the command line arguments
     */
    public static void show(String input){
        System.out.println("ini adalah method dengan parameter String : " + input);
        
    } 
    public static void show(int input){
        System.out.println("ini adalah method dengan parameter integer : " + input);
    }
    public static void show(float input){
        System.out.println("ini adalah method dengan parameter float : " + input);
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
   
        show("1");
        show(2);
        show(3f);
    
    }
    
}
