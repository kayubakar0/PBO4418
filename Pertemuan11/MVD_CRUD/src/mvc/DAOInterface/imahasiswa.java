/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.*;

/**
 *
 * @author adrian
 */
public class imahasiswa {
    public void insert(mahasiswa b);
    public void update(mahasiswa b);
    public void delete(int id);
    public List<mahasiswa> getAll();
    public List<mahasiswa> getCariNama(String nama);
}
