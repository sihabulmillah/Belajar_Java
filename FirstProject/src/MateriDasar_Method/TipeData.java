/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriDasar_Method;
//adalah package tempat menyimpan file 

/**
 *
 * @author petik
 */
public class TipeData {
//class adalah tempat untuk menampung kode program
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        System.out.println("Nama saya Sihabul Millah");
        System.out.println("Alamat saya dari Cimahi, Jawa Barat");
        System.out.println("No HP. 087778930142");

        int x = 10;
        int y = 6;

        System.out.println("Hasil dari 10 + 6 =" + (x + y));
        
        //Integer (satuan)
        int b = 10;
        System.out.println("======Integer======");
        System.out.println("nilai i " + b );
        System.out.println("nilai i max " + Integer.MAX_VALUE);
        System.out.println("nilai i min " + Integer.MIN_VALUE);
        System.out.println("besar i " + Integer.BYTES + " Bytes");
        System.out.println("besar i " + Integer.SIZE + " Bit");
        
        //byte(satuan)
        byte s = 6;
        System.out.println("======Byte======");
        System.out.println("nilai b " + s);
        System.out.println("nilai b max " + Byte.MAX_VALUE);
        System.out.println("nilai b min " + Byte.MIN_VALUE);
        System.out.println("besar b " + Byte.BYTES + " Bytes");
        System.out.println("besar b " + Byte.SIZE + " Bit");
        
        //short (satuan)
        short l = 10;
        System.out.println("======Short======");
        System.out.println("nilai s "+ l);
        System.out.println("nilai s max " + Short.MAX_VALUE);
        System.out.println("nilai s min " + Short.MIN_VALUE);
        System.out.println("besar s " + Short.BYTES + " Bytes");
        System.out.println("besar s " + Short.SIZE + " Bit");
        
        //Long (satuan)
        long a = 10L;
        System.out.println("======Long======");
        System.out.println("nilai l "+ a);
        System.out.println("nilai l max " + Long.MAX_VALUE);
        System.out.println("nilai l min " + Long.MIN_VALUE);
        System.out.println("besar l " + Long.BYTES + " Bytes");
        System.out.println("besar l " + Long.SIZE + " Bit");
        
        //double (desimal,dan bilangan real)
        double w = -10.5d;
        System.out.println("======Double======");
        System.out.println("nilai w "+ a);
        System.out.println("nilai w max " + Double.MAX_VALUE);
        System.out.println("nilai w min " + Double.MIN_VALUE);
        System.out.println("besar w " + Double.BYTES + " Bytes");
        System.out.println("besar w " + Double.SIZE + " Bit");
        
        //float (desimal dan bilangan real)
        float q = 10.7f;
        System.out.println("======Float======");
        System.out.println("nilai q "+ q);
        System.out.println("nilai q max " + Float.MAX_VALUE);
        System.out.println("nilai q min " + Float.MIN_VALUE);
        System.out.println("besar q " + Float.BYTES + " Bytes");
        System.out.println("besar q " + Float.SIZE + " Bit");
        
        //char (karakter)berdasarkan ASCII
        String c = "jika";
        System.out.println("======Character======");
        System.out.println("nilai c " + c);
        System.out.println("nilai c max " + Character.MAX_VALUE);
        System.out.println("nilai c min " + Character.MIN_VALUE);
        System.out.println("besar c " + Character.BYTES + " Bytes");
        System.out.println("besar c " + Character.SIZE + " Bit");
        
        //boolean (nilai true atau false)
        boolean g = true;
        System.out.println("======Boolean======");
        System.out.println("nilai g " + g);
        System.out.println("nilai g max " + Boolean.TRUE);
        System.out.println("nilai g min " + Boolean.FALSE);
        System.out.println("besarnya hanya 1 bit");
        
        
        
    }

}
