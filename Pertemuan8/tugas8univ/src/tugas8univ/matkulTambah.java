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
public class matkulTambah extends matkulPokok{
    public int nilaiMT;
    
    matkulTambah() {}
    
    void nilaiMT(){
        System.out.print("masukkan Mata kuliah tambahan: ");
        this.nilaiMT = intr.nextInt();
    }
}
