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
public class RegistMahasantri {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // memanggil constaktor kosong
        Mahasantri mhs1 = new Mahasantri();
        mhs1.nim = 101020;
        mhs1.nama = "Ujang";
        mhs1.ipk = 3.6f;
        
        System.out.println("Nama : "+mhs1.nama+" \nIPK : "+mhs1.ipk+
                " \nPredikat Kelulusan : "+mhs1.predikat());
        System.out.println("");
        // memanggil konstraktor 2 parameter
        Mahasantri mhs2 = new Mahasantri("Ucup",3.3f );
        System.out.println("Nama : "+mhs2.nama+" \nIPK : "+mhs2.ipk+
                " \nPredikat Kelulusan : "+mhs2.predikat());
       
        // memanggil konstraktor 3 parameter
        Mahasantri mhs3 = new Mahasantri(101021,"Usro",3.95f);
        System.out.println("\nNim : "+mhs3.nim+" \nNama : "+mhs3.nama+" \nIPK : "+mhs3.ipk+
                " \nPredikat Kelulusan : "+mhs3.predikat());
    
        // object references 
        Mahasantri mhs4 = mhs3;
        mhs4.nama = "Udin";
        System.out.println("\nNama : "+mhs4.nama+" \nIPK : "+mhs4.ipk+
                " \nPredikat Kelulusan : "+mhs4.predikat());
        
        
    
    
    }
    
}
