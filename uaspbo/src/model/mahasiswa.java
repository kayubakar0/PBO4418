/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author adrian
 */
public class mahasiswa {

    public String getKdmatkul() {
        return kdmatkul;
    }

    public void setKdmatkul(String kdmatkul) {
        this.kdmatkul = kdmatkul;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public int getUas() {
        return uas;
    }

    public void setUas(int uas) {
        this.uas = uas;
    }

   
    private String kdmatkul;
    private String matkul;
    private int uts;
    private int uas;
}
