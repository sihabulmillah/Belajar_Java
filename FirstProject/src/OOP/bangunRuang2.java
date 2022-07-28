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
public class bangunRuang2 {
    
    public static class luasSegitiga{
    private float alas;
    private float tinggi;

        public float luasSegitiga(float alas, float tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            float luas = (alas * tinggi / 2);
            return luas;
        }

        public float getAlas() {
            return alas;
        }

        public void setAlas(float alas) {
            this.alas = alas;
        }

        public float getTinggi() {
            return tinggi;
        }

        public void setTinggi(float tinggi) {
            this.tinggi = tinggi;
        }

        @Override
        public String toString() {
            return "luas Segitiga dengan alas = " + alas + " dan tinggi = " + tinggi + 
                    " adalah " + luasSegitiga(alas,tinggi);
        }
}
    public static class kelilingSegitiga{
        private float sisi1;
        private float sisi2;
        private float sisi3;

            public float kelilingSegitiga(float sisi1, float sisi2, float sisi3) {
                this.sisi1 = sisi1;
                this.sisi2 = sisi2;
                this.sisi3 = sisi3;
                float keliling = sisi1  + sisi2 + sisi3;
                return keliling;
            }

            public float getSisi1() {
                return sisi1;
            }

            public void setSisi1(float sisi1) {
                this.sisi1 = sisi1;
            }

            public float getSisi2() {
                return sisi2;
            }

            public void setSisi2(float sisi2) {
                this.sisi2 = sisi2;
            }

            public float getSisi3() {
                return sisi3;
            }

            public void setSisi3(float sisi3) {
                this.sisi3 = sisi3;
            }

            @Override
            public String toString() {
                return "keliling Segitiga dengan sisi1 = " + sisi1 + ", sisi2 = " + sisi2 + " dan sisi3 = " + sisi3 + 
                        " adalah "+kelilingSegitiga(sisi1,sisi2,sisi3);
            }            
}    
    public static class luasJajarGenjang{
        private float alas;
        private float tinggi;

        public float luasJajarGenjang(float alas, float tinggi) {
            this.alas = alas;
            this.tinggi = tinggi;
            float luas = alas * tinggi;
            return luas;
        }

        public float getAlas() {
            return alas;
        }

        public void setAlas(float alas) {
            this.alas = alas;
        }

        public float getTinggi() {
            return tinggi;
        }

        public void setTinggi(float tinggi) {
            this.tinggi = tinggi;
        }

        @Override
        public String toString() {
            return "luas Jajar Genjang dengan alas = " + alas + " dan tinggi = " + tinggi + 
                    " adalah " + luasJajarGenjang(alas,tinggi);
        }        
    }
    public static class kelilingJajarGenjang{
        private float a;
        private float b;

        public float kelilingJajarGenjang(float a, float b) {
            this.a = a;
            this.b = b;
            float keliling = 2 * (a+b);
            return keliling;
        }

        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }

        public float getB() {
            return b;
        }

        public void setB(float b) {
            this.b = b;
        }

        @Override
        public String toString() {
            return "keliling Jajar Genjang dengan alas = " + a + " dan sisi miring  = " + b + 
                    " adalah " + kelilingJajarGenjang(a,b);
        }  
    }
}
