/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8univ;

import java.util.Scanner;

/**
 *
 * @author adria
 */
public class matkul extends univ{
    public String nmMatkul;
    public String jadwal;
    public int Semester;
    public Scanner intr = new Scanner(System.in);
    
    public matkul() {}
    void setnmMatkul(){
        System.out.print("masukkan Nama Mata Kuliah : ");
        this.nmMatkul = str.nextLine();
    }
    
    void setjadwal() {
        System.out.print("masukkan Hari Mata Kuliah : ");
        this.jadwal = str.nextLine();
    }
    
    void setsemester() {
        System.out.print("masukkan semester: ");
        this.Semester = intr.nextInt();
    }
}


