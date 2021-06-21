/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOinterface;
import java.util.List;
import mvc.model.admin;
/**
 *
 * @author adria
 */
public class Iadmin {
    public void insert(admin u);
    public void update(admin u);
    public void delete(String identitas);
    public List<admin> getAll();
    public List<admin> getCariNama(String nama);
}
