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
public class aksesPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Pegawai p1 = new Pegawai();
    p1.setNip(32260701);
    p1.setNama("Ujang");
    p1.setDepartemen("Direktur");
    p1.setGaji(20000000);
    
//        System.out.println(p1);
    
    Pegawai p2 = new Pegawai();
    p2.setNip(1010203);
    p2.Pegawai("Udin","Manager");
    p2.setGaji(10000000);
    
//        System.out.println(p2);
    
    Pegawai p3 = new Pegawai();
    p3.setNip(32260701);
    p3.setNama("Ucok");
    
//        System.out.println(p3);
    if(p1.equals(p2)){
        System.out.println(p1+" Sama dengan "+p2);
    }else{System.out.println(p1 + "Tidak sama dengan " +p2);}
    
    
        System.out.println("Nama Mahsantri : Sihab");
    }
    
}
