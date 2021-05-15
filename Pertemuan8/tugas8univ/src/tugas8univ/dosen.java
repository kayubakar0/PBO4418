/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8univ;

/**
 *
 * @author adria
 */
public class dosen extends univ{
    public String nmDosen;
    
    public dosen() {}
    
    void setnmDosen(){
        System.out.print("masukkan nama Dosen : ");
        this.nmDosen = str.nextLine();
    }
}
