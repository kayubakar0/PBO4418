
import java.util.*;

/**
 *
 * @author adrian
 */
public class queue {

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
    Queue<String> barang = new LinkedList<>();
    
    public warung(){
        
    }
    public void stokbarang(Queue<String> barang){
        this.barang = barang;
    }
    public Queue<String> ambilstok(){
        return this.barang;
    }
}

class gudang extends warung{
    public void tambahstok(String barang){
        super.ambilstok().add(barang);
    }
    public String kadaluarsa(int index){
        return super.ambilstok().poll();
    }
    public Queue<String> barangSisa(){
        return super.ambilstok();
    } 
}