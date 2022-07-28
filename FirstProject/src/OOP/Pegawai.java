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
public class Pegawai {
    private int nip;
    private String nama;
    private String departemen;
    private double gaji;

    public int Pegawai(String nama, String departemen) {
        this.nama = nama;
        this.departemen = departemen;
        
        return nip;
    }
    //getter mengambil nilai
    public int getNip() {
        return nip;
    }
    // setter merubah nilai
    // fungsi get dan set adalah sebagai bantuan untuk mengakses property yang aksesnya private
    public void setNip(int nomorInduk) {
        this.nip = nomorInduk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String namaPegawai) {
        this.nama = namaPegawai;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemenPegawai) {
        this.departemen = departemenPegawai;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gajiPegawai) {
        this.gaji = gajiPegawai;
    }

    @Override
    public String toString() {
        return "Pegawai{" + "nip=" + nip + ", nama=" + nama + ", departemen=" + departemen + ", gaji=" + gaji + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    //untuk mengequalskan/membandingkan harus mencari data yang uniqnya saja 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pegawai other = (Pegawai) obj;
        if (this.nip != other.nip) {
            return false;
        }
        return true;
    }
    
    
    
    
}
