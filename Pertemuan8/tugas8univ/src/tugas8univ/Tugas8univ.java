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
public class Tugas8univ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        univ universitas = new univ();
        universitas.setkode();
        universitas.setnim();
        universitas.setnip();
        
        dosen dsn = new dosen();
        dsn.setnmDosen();
        
        mhs mahasiswa = new mhs();
        mahasiswa.setnmMhs();
        
        matkul mataKuliah = new matkul();
        mataKuliah.setnmMatkul();
        mataKuliah.setjadwal();
        mataKuliah.setsemester();
        
        matkulPokok MP = new matkulPokok();
        MP.setnilaiMP();
        
        matkulTambah MT = new matkulTambah();
        MT.nilaiMT();
        
        nilai hasil = new nilai();
        hasil.getNilaiAverage();
        hasil.showdata();
        
        
        
        
        
        
    }
    
}
