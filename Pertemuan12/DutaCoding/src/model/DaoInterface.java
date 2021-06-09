/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import entity.tbl_pendaftaran;
import java.util.List;
/**
 *
 * @author adrian
 */
public class DaoInterface {
    public void insertdata (tbl_pendaftaran data)throws Exception;
    public void deleteMahasiswa (int nim)throws Exception;
    public void updateMahasiswa (int nim, Mahasiswa mahasiswa)throws Exception;
    public List<Mahasiswa> readAll()throws Exception;
}
