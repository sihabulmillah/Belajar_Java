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
public class objectDiklat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // membuat objec dari class diklat
        Diklat siswa = new Diklat();
        siswa.id = 10;
        siswa.nama = "Ucok";
        siswa.tahun = 2021;
        siswa.angkatan = "IX";
        siswa.budget = 200000;
    
        System.out.println("Nama : "+siswa.nama+" \nid : "+siswa.id+" \ntahun : "+siswa.tahun+
                " \nangkatan : "+siswa.angkatan+" \nbudget : "+siswa.budget);
        
        System.out.println("");
        // membuat object dari class nilai diklat
        nilaiDiklat siswa1 = new nilaiDiklat();
        siswa1.id = 10;
        siswa1.nama = "Ucok";
        siswa1.pretest = 75f;
        siswa1.postest = 90f;
        siswa1.kehadiran = 90f;
        
         System.out.println("Nama : "+siswa1.nama+" \nid : "+siswa1.id+" \nnilai pretest : "+siswa1.pretest+
                " \nnilai postest : "+siswa1.postest+" \nkehadiran : "+siswa1.kehadiran  +"\nNilai Rata-rata : " +siswa1.getHasil()+"\nKeterangan : "+siswa1.getGrade());
        
        
    }
    
}
