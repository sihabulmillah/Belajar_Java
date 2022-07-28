/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;
/**
 *
 * @author petik
 */
public class Aplikasi_Zakat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Aplikasi Perhitungan Zakat");
        System.out.println("=====Macam Macam Zakat=====");
        System.out.println("1. Zakat Fitrah");
        System.out.println("2. Zakat Mal");
        System.out.println("3. Zakat Profesi");
        System.out.println("4. Zakat Perhiasan");
        System.out.println("5. Zakat Rikaz");
        System.out.println("6. Bayar Fidyah Puasa");
        System.out.println("7. Zakat Programer");
        
        Scanner input = new Scanner(System.in);
        int zakat,anggota;
        float hasil,hasil2,hasil3,penghasilan,penghasilan2,mal,emas,emas1;
        
        System.out.print("Zakat mana yang mau di hitung ? \nPilih dengan menggunakan angka : ");
        zakat = input.nextInt();
        
        switch(zakat){
            case 1 :
                System.out.println("===Zakat Fitrah===");
                System.out.println("Harta yang harus dizakatkan sebesar 3,5 liter beras perorang"); 
                System.out.println("Jumlah anggota keluarga X 3,5 ");
                System.out.print("Masukan jumlah anggota keluarga : ");
                anggota = input.nextInt();
                System.out.print("Masukan harga beras perliter : ");
                float harga = input.nextFloat();
                hasil = (float)(anggota * 3.5);
                float beras = (float)3.5 * harga * anggota ;
                System.out.println("Jumlah zakat yang harus dikeluarkan dari " + anggota + " anggota keluarga adalah " + hasil + " Liter beras atau seharga " + beras + " Rupiah");break;    
            
            case 2 :
                System.out.println("===Zakat Mal===");
                System.out.println("Harta yang harus dizakatkan sebesar 2,5% dari penghasilan setahun ");
                System.out.println("Penghasilan setahun = penghasilan perbulan X 12");
                System.out.print("Masukan jumlah penghasilan perbulan : ");
                penghasilan = input.nextFloat();
                hasil2 = penghasilan * 12 ;
                System.out.println("Maka penghasilan selama setahun = " + hasil2);
                
                mal = (float)((float)hasil2 * (2.5/100));  
                System.out.println("Zakat yang harus dikeluarkan adalah sebesar " + mal + " Rupiah" );break;
                
            case 3 :
                System.out.println("===Zakat Profesi===");
                System.out.println("Nishab Zakat Profesi = Rp. 6.240.000");
                float nishab = 6240000 ;
                System.out.println("Harta yang harus dizakatkan sebesar 2,5% dari penghasilan perbulan ");
                System.out.println("Penghasilan bulanan X 2,5%");
                System.out.print("Masukan jumlah penghasilan perbulan : ");
                penghasilan2 = input.nextFloat();
                    if(penghasilan2 >= nishab ){
                        hasil3 = (float)((float) penghasilan2 * (2.5 / 100));
                        System.out.println("Zakat yang harus dikeluarkan adalah sebesar " + hasil3 + " Rupiah");
                    }
                    else {System.out.println("Jumlah Penghasilan Belum Memenuhi Nishab");}
                break;
            
            case 4 :
                System.out.println("===Zakat Perhiasan=== \nBerupa Emas atau Perak");
                System.out.println("Nishab Emas = 80gr \nNishab Perak = 595gr");
                System.out.println("Harta yang harus dizakatkan sebesar 2,5% dari harga perhiasan saat ini");
                System.out.print("Tentukan Perhiasan ! (Emas atau Perak) : ");
                String perhiasan = input.next();
                float hasil4,hasil5,zakat1,perak1;
                    switch(perhiasan){
                        case "Emas":
                        System.out.print("Masukan harga emas saat ini : ");
                        emas = input.nextFloat();
                        System.out.print("Masukan emas yang dimiliki : ");
                        emas1 = input.nextFloat();
                        if(emas1 >= 80){
                            hasil4 = emas * emas1;
                            zakat1 = (float)((float)hasil4 * (2.5/100));
                            System.out.println("Zakat yang harus di keluarkan adalah sebesar " + zakat1 + " Rupiah");}
                        else {System.out.println("Jumlah Emas Belum Memenuhi Nishab");}
                    break;    
                        case "Perak": {
                            System.out.print("Masukan harga perak saat ini : ");
                            perak1 = input.nextFloat();
                            System.out.print("Masukan Perak yang dimiliki : ");
                            float perak = input.nextFloat();
                                if(perak >= 595){
                                hasil5 = perak1 * perak ;
                                float zakat2 = (float)((float)hasil5 * (2.5/100)); 
                                System.out.println("Zakat yang harus di keluarkan adalah sebesar " + zakat2 + "Rupiah");}
                                else{System.out.println("Jumlah Perak Belum Memenuhi Nishab");}
                        }
                    }       
            break;
            
            case 5 :
                System.out.println("===Zakat Rikaz atau Harta Karun===");
                System.out.println("Nishab Rikaz = 85gr Emas atau kisaran seharga 85jt");
                System.out.println("Harta yang harus dizakatkan sebesar 20%");
                System.out.print("Masukan Jumlah Rikaz yang dimiliki : ");
                float rikaz,zakat3;
                      rikaz = input.nextFloat();
                    if(rikaz >= 85000000){
                      zakat3 = (float)((float)rikaz * 20/100);
                      System.out.println("Zakat yang harus dikeluarkan adalah sebesar " + zakat3 + " Rupiah");}
                    else {System.out.println("Rikaz yang dimiliki Belum Memenuhi Nishab");}break;
                    
            case 6 :
                System.out.println("===Bayar Fidyah Puasa===");
                System.out.println("Fidyah perhari sebesar Rp 45.000 untuk 1 anggota keluarga");
                System.out.print("Masukan jumlah anggota keluarga yang tidak mampu berpuasa : ");
                int mampu = input.nextInt();
              
                int c = 1;
                boolean kondisi = true;
                
                    while(kondisi){
                        System.out.print("Masukan jumlah puasa yang di tinggalkan orang ke-" + c +" : ");
                        int mampu1 = input.nextInt();
                        int fidyah1 = 45000 * mampu1 ;
                       
                        System.out.println("Besar Fidyah yang harus di keluarkannya adalah sebesar " + fidyah1 + " Rupiah");
                        if(c == mampu){kondisi = false;
                    }
                    c++;
                    }
                     System.out.print("Masukan jumlah puasa yang mereka tinggalkan : ");
                     int hari = input.nextInt();
                     int fidyah2 = hari * 45000;
                     System.out.println("Fidyah yang harus dibayar keluarga tersebut adalah sebesar " + fidyah2 + " Rupiah");
                break;
            case 7 :
                System.out.println("===Zakat Programmer===");
                System.out.println("Harta yang harus dizakatkan sebesar 2,5% dari harga project");
                System.out.print("Masukan Harga Project : ");
                float harga1 = input.nextFloat();
                float zakat4 = (float)((float)harga1 * (2.5/100));
                System.out.println("Zakat yang harus dikeluarkan adalah sebesar " + zakat4 + " Rupiah");break;
            
            default : {System.out.println("Pilihan Tidak Ditemukan");}    
        }
            System.out.println("Syukron Telah Menggunakan Aplikasi Kami");
            
            
        
    
    }
    
}
