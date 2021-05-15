/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8univ;
import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class univ {
    public String kode;
    public String nim;
    public String nip;
    public Scanner str = new Scanner(System.in);
    
    public univ() {};
    
    public void setkode(){
        System.out.print("masukkan kode kampus : ");
        this.kode = str.nextLine();
    }
    public void setnip() {
        System.out.print("masukkan kode nip : ");
        this.nip = str.nextLine();
    }
    
    public void setnim(){
        System.out.print("masukkan kode Nim : ");
        this.nim = str.nextLine();
    }
}
