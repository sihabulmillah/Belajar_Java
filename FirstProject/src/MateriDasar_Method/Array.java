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
public class Array {
public static void salam(){
    System.out.println("salam");

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String siswa1 = "Ahmad";
    String siswa2 = "Ali";
    String siswa3 = "Dewi";
    String siswa4 = "Putri";
    // elemennya ada 4
    String[] siswa = {"Ahmad", "Ali", "Dewi","Putri" };
////    //indeksnya hanya 3 karena dari 0
////    
        System.out.print(siswa1);
        System.out.print(siswa2);
        System.out.print(siswa3);
        System.out.println(siswa4);
   
        System.out.print(siswa[0]);
        System.out.print(siswa[1]);
        System.out.print(siswa[2]);
        System.out.println(siswa[3]);
//   //indeks array out of boun akan menghasilkan eror karean tidak ada elemennya
//    
        System.out.println("");
    //pesan eror
    //1 tanda seru = gak boleh pake cara ini
    //2 warning = hanya di sarankan 
    
    //bedanya null=benar" kosong/tidak ada memori/nilai dan noll=masih ada nilai yaitu kosong
     
    //cara membuat array kosong kurung siku nya di simpan di setelah/sebelum tipe data atau setelah variabel
    int[]nomor;
    nomor = new int[5];
    String nama[] = new String[5];
    float nilai [] = new float[5];
    //jika di di dalam array langsung di kasih nilai maka jumlah elemennya akan sesuai dg nilai yg di masukan     
    float total[] = {50f, 70f, 60f, 80f, 100f, 10f, 26f,40f};

    
    nomor[0] = 1;
    nama[0] = "Ahmad";
    nilai[0] = 8.5f;
    
    nomor[1] = 2;
    nama[1] = "Ali";
    nilai[1] = 7.5f;
    
    nomor[2] = 5;
    nama[2] = "Dewi";
    nilai[2] = 9.0f;
    
        System.out.println("nomor   : "+nomor[0]);
        System.out.println("nama    : "+nama[0]);
        System.out.println("nilai   : "+nilai[0]);
        
        System.out.println("Panjang array total : "+total.length);
//        //.length untuk mengetahui jumlah elemen pada array
        System.out.println("");
//        //array 1 dimensi
    String baris1[] = {"usman", "aep", "arya", "lutfi", "iskandar"};
    String baris2[] = {"rahul", "galang", "lucky", "faqih", "sihab", "anugrah"};
    String baris3[] = {"ricky", "putra", "bahri", "sakha"};
//        //array 2 dimensi
    String posisi[][] = new String[3][6];
    posisi[0][0] = "Usman";
    posisi[0][1] = "Aep";
    posisi[0][2] = "Arya";
    posisi[0][3] = "Lutfi";
    posisi[0][4] = "Iskandar";
    
    posisi[1][0] = "Rahul";
    posisi[1][1] = "Galang";
    posisi[1][2] = "Lucky";
    posisi[1][3] = "Faqig";
    posisi[1][4] = "Sihab";
    posisi[1][5] = "Anugrah";
    
    posisi[2][0] = "RIcky";
    posisi[2][1] = "Putra";
    posisi[2][2] = "Bahri";
    posisi[2][3] = "Sakha";
    
       System.out.println(baris1[3]);   
        System.out.println(posisi[2][1]);
    
        System.out.println("");
    String[]nama_santri ={"Ujang", "Ucok", "Ucup", "Usro", "Udin"};
    nama_santri[4] = "Usman"; 
//        System.out.println(nama_santri[1]);
    
        System.out.println(nama_santri[4]);
        
//        System.out.println("jumlah elemen array : "+nama_santri.length);
    }
    
}
