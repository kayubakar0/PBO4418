/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author adria
 */
public class tbl_pendaftaran {
    private String nik;
    private String nama;
    private String gender;
    private String alamat;
    private int usia;
    private String alasan;
    
    public String getNik(){
        return nik;
    }
    
    public void setNik(String nik){
        this.nik = nik;
    }
    
    public String getnama(){
        return nama;
    }
    
    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUsia(){
        return usia;
    }
    
    public void setUsia(int usia){
        this.usia = usia;
    }
    
    public String getAlasan(){
        return alasan;
    }
    
    public void setAlasan(String alasan){
        this.alasan = alasan;
    }
}
