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
public class bangunRuang1 {
    
   public static class luaslingkaran{
       private float jari;

        public float luaslingkaran(float jari) {
            this.jari = jari;
            float luas = (3.14f * jari * jari);
            return luas;
        }

        public float getJari() {
            return jari;
        }

        public void setJari(float jari) {
            this.jari = jari;
        }

        @Override
        public String toString() {
            return "luas lingkaran dari jari jari = "+ jari +" adalah " + luaslingkaran(jari);
        }
}
    public static class kelilingLingkaran{
        private float jari;
        
        public float kelilingLingkaran(float jari) {
            this.jari = jari;
            float keliling = (2 * 3.14f * jari);
            return keliling;
        }

        public float getJari() {
            return jari;
        }

        public void setJari(float jari) {
            this.jari = jari;
        }

        @Override
        public String toString() {
            return "keliling lingkaran  dengan jari-jari = " + jari + " adalah " + kelilingLingkaran(jari);
        }
        
    }
    public static class luasPersegi{
        private float sisi;

        public float luasPersegi(float sisi) {
            this.sisi = sisi;
            float luas = sisi * sisi;
            return luas;
        }

        public float getSisi() {
            return sisi;
        }

        public void setSisi(float sisi) {
            this.sisi = sisi;
        }

        @Override
        public String toString() {
            return "luas Persegi dengan sisi = " + sisi + " adalah " + luasPersegi(sisi);
        }
        
    }
    public static class kelilingPersegi{
        private float sisi;

        public float kelilingPersegi(float sisi) {
            this.sisi = sisi;
            float keliling = 4 * sisi ;
            return keliling;
        }

        public float getSisi() {
            return sisi;
        }

        public void setSisi(float sisi) {
            this.sisi = sisi;
        }

        @Override
        public String toString() {
            return  "keliling Persegi dengan sisi = " + sisi + " adalah " + kelilingPersegi(sisi);
        }        
}
    public static class luasPersegiPanjang{
        private float p;
        private float l;

        public float luasPersegiPanjang(float p, float l) {
            this.p = p;
            this.l = l;
            float luas = p * l;
            return luas;
        }

        public float getP() {
            return p;
        }

        public void setP(float p) {
            this.p = p;
        }

        public float getL() {
            return l;
        }

        public void setL(float l) {
            this.l = l;
        }

        @Override
        public String toString() {
            return "luas persegi panjang dengan panjang = " + p + " dan lebar = "+ l +
                    " adalah "+luasPersegiPanjang(p,l);
        }
    }
    public static class kelilingPersegiPanjang{
        private float p;
        private float l;

        public float kelilingPersegiPanjang(float p, float l) {
            this.p = p;
            this.l = l;
            float keliling = 2 * ( p + l );
            return keliling;
        }

        public float getP() {
            return p;
        }

        public void setP(float p) {
            this.p = p;
        }

        public float getL() {
            return l;
        }

        public void setL(float l) {
            this.l = l;
        }

        @Override
        public String toString() {
            return "keliling persegi panjang dengan panjang = " + p + " dan lebar = "+ l +
                    " adalah "+kelilingPersegiPanjang(p,l);
        }
        }  
}  
    

