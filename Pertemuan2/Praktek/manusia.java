/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        cekTVmanusia orang = new cekTVmanusia();
        orang.namamanusia("rian");
        orang.namasaya();
        System.out.println("membeli TV");
        orang.beliTV();
        orang.cekTV();
        System.out.println("Menjual Semua TV TV");
        orang.jualsemuaTV();
        orang.cekTV();
    }
}

class cekTVmanusia {
    String nama;
    boolean tv;
    
    void namamanusia(String newnama){
        nama = newnama;
    }
    void namasaya() {
    System.out.println("nama saya "+nama);
}
    void beliTV(){
        tv = true;
    }
    void jualsemuaTV(){
        tv = false;
    }
    void cekTV(){
        System.out.println("Apakah ada TV ? "+tv);
    }
}