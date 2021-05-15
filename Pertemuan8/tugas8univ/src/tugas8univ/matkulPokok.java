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
public class matkulPokok extends matkul{
    public int nilaiMP;
    
    matkulPokok() {}
    
    void setnilaiMP() {
        System.out.print("masukkan Nilai Kuliah Pokok : ");
        this.nilaiMP = intr.nextInt();
    }
}
