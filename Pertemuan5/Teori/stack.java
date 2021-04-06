
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        gudang dagangan = new gudang();
        System.out.println(dagangan.barangSisa());
        
        dagangan.tambahstok("shampo");
        dagangan.tambahstok("sabun");
        dagangan.tambahstok("minyak");
        System.out.println(dagangan.barangSisa());
        
        dagangan.kadaluarsa(3);
        System.out.println(dagangan.barangSisa());
    }
}

class warung{
    Stack<String> barang = new Stack<>();
    
    public warung(){
        
    }
    public void stokbarang(Stack<String> barang){
        this.barang = barang;
    }
    public Stack<String> ambilstok(){
        return this.barang;
    }
}

class gudang extends warung{
    public void tambahstok(String barang){
        super.ambilstok().add(barang);
    }
    public String kadaluarsa(int index){
        return super.ambilstok().pop();
    }
    public Stack<String> barangSisa(){
        return super.ambilstok();
    } 
}