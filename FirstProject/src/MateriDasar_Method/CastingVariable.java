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
public class CastingVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int bilangan1 = 33;
        // ubah bilangan1 yang bertipe int ke bilangan 2 yang bertipe float
        float bilangan2 = (float) bilangan1 / 5;
        System.out.println(bilangan2);
       
        
        // casting dari string ke int
        String bilangan3 = "20";
        String bilangan4 = "15";
        //mengubah bilangan 3 dari string ke int
        int bilangan5 = Integer.parseInt(bilangan3);
        int bilangan6 = Integer.parseInt(bilangan4);
        System.out.println(bilangan3 + bilangan4);
        System.out.println(bilangan5 + bilangan6);
        
        // casting dari int ke string
        
        int bilangan7 = 20433;
        int bilangan8 = 40;
        
        String str_bil7 = String.valueOf(bilangan7);
        String str_bil8 = String.valueOf(bilangan8);
        
        System.out.println(bilangan7 + bilangan8);
        System.out.println(str_bil7 + str_bil8);
                
    
    }
    
}
