/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class mobilDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        mobil mobilku = new mobil();
        mobilku.warna = "Hitam";
	mobilku.thProduksi = 2006;
	System.out.println("Warna: " + mobilku.warna);
	System.out.println("Tahun: " + mobilku.thProduksi);  
        
        //mobil2
        mobilku.hidupkanMobil();
        mobilku.ubahgigi();
        System.out.println("Gigi saat ini : "+ mobilku.gigi);
        mobilku.matikanMobil();
    }
}

class mobil {
    String warna;
    int thProduksi;
    int gigi = 1;
    boolean mobil;
    
    void hidupkanMobil() {
        mobil = true;
        System.out.println("Mobil Hidup");
}
    void matikanMobil(){
        mobil = false;
        System.out.println("Mobil Mati");
    }
    void ubahgigi(){
        gigi++;
    }
}