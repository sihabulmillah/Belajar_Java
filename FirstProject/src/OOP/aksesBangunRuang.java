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
public class aksesBangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // luas lingkaran
        System.out.println("===Lingkaran===");
        bangunRuang1.luaslingkaran lingkaran = new bangunRuang1.luaslingkaran();
        lingkaran.setJari(7);
        System.out.println(lingkaran);
        
        //keliling lingkaran
        bangunRuang1.kelilingLingkaran kel_lingkaran = new bangunRuang1.kelilingLingkaran();
        kel_lingkaran.setJari(7);
        System.out.println(kel_lingkaran+"\n");
        
        //luas persegi
        System.out.println("===Persegi===");
        bangunRuang1.luasPersegi l_persegi = new bangunRuang1.luasPersegi();
        l_persegi.setSisi(8);
        System.out.println(l_persegi);
    
        //keliling persegi
        bangunRuang1.kelilingPersegi k_persegi = new bangunRuang1.kelilingPersegi();
        k_persegi.setSisi(8);
        System.out.println(k_persegi+"\n");
    
        //luas persegi panjang
        System.out.println("===Persegi Panjang===");
        bangunRuang1.luasPersegiPanjang l_persegipanjang = new bangunRuang1.luasPersegiPanjang();
        l_persegipanjang.luasPersegiPanjang(10,20);
        System.out.println(l_persegipanjang);
    
        //keliling persegi panjang
        bangunRuang1.kelilingPersegiPanjang k_persegipanjang = new bangunRuang1.kelilingPersegiPanjang();
        k_persegipanjang.kelilingPersegiPanjang(10,20);
        System.out.println(k_persegipanjang+"\n");
    
        //luas segitiga
        System.out.println("===Segitiga===");
        bangunRuang2.luasSegitiga l_segitiga = new bangunRuang2.luasSegitiga();
        l_segitiga.luasSegitiga(5,10);
        System.out.println(l_segitiga);
    
        //keliling segitiga
        bangunRuang2.kelilingSegitiga k_segitiga = new bangunRuang2.kelilingSegitiga();
        k_segitiga.kelilingSegitiga(10, 15,10);
        System.out.println(k_segitiga+"\n");
        
        System.out.println("===Jajar Genjang===");
        //luas jajar genjang
        bangunRuang2.luasJajarGenjang l_jajargenjang = new bangunRuang2.luasJajarGenjang();
        l_jajargenjang.luasJajarGenjang(5,10);
        System.out.println(l_jajargenjang);
    
         //keliling jajar genjang
        bangunRuang2.kelilingJajarGenjang k_jajargenjang = new bangunRuang2.kelilingJajarGenjang();
        k_jajargenjang.kelilingJajarGenjang(5,10);
        System.out.println(k_jajargenjang+"\n");        
    }    
}
