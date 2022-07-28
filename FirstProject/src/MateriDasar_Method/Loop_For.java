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
public class Loop_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hitungan Berurut");
        int s = 10 ;
        for (int i = 1 ; i <= s ; i++){
            System.out.println("Nilai i ke-" + i);}
        
        System.out.print("\nHitungan Mundur\n");
       
//        int l = 0;
//        for (int z = 10 ; z > l ; z--){
//            System.out.println("Nilai z ke-" + z);}
//        
//        System.out.println("\nHitungan Hari");
        String days[]= {"Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Ahad"};
        for (int h = 0 ; h < days.length ; h++){
            if(h == 2){
                System.out.println("Index hari ke-"+ h +" : Libur");
            }else{
            System.out.println("Index hari ke-"+ h +" : " + days[h]);
            }
        }
        









        // nested for (for bersarang)
        // yang di luar akan di jalankan setelah yang di dalam selesai di jalankan
        
//        for (int i =1; i < 5 ;i++ ){
//            for (int j = 1 ; j < 5 ;j++){
//            System.out.println(j);
//            }
//        System.out.println("");
//        }
        


        // membuat urutan angka 1 sampai 5 dg bentuk segitiga siku siku
//        for (int q = 1; q <= 5; q++ ){
//            for (int w = 0 ; w < q ;w++){
//                System.out.print(q);
//            }System.out.println("");
//        }
//        
        

        //membuat urutan angka dari 5 sampai 1 dg bentuk segitiga siku siku 
      
//        for (int s = 5;s >= 1 ;s--){
//            for (int m = 5 ;m >= s;m--){
//                System.out.print(m);
//            }
//            System.out.println("");
//        }


    for (int h = 1 ; h <=5 ; h++){
        for (int j = 1 ; j <= h ; j++){
            System.out.print(j);
        }System.out.println("");
    }

















// membuat hitungan mundur dengan bentuk segitiga siku siku terbalik
//    for (int s = 5 ; s >= 1 ;s--){
//        for (int m = s ;m >= 1 ; m--){
//            System.out.print(m);
//        }System.out.println("");
//    }
















//      
        // hampir sama dengan while 
//    setidaknya akan menampilkan satu buah statement

//        do {
//        aksi
//    }while (kondisi);
//        int v = 1;
//                do {
//                    System.out.println(v);
//                    v++;
//                }while(v < 1 );
//       














    
    }
    
}

