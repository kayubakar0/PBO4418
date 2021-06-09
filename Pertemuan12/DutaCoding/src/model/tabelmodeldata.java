/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.tbl_pendaftaran;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author adria
 */
public class tabelmodeldata extends AbstractTableModel{
    private final List<tbl_pendaftaran> list;
    
    public tabelmodeldata(List<tbl_pendaftaran> list){
        this.list = list;
    }
    
    tbl_pendaftaran get(int row){
        return list.get(row);
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getRowCount(){
        return list.size();
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getColumnCount(){
        return 6;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "nik";
            case 1 -> "nama";
            case 2 -> "gender";
            case 3 -> "alamat";
            case 4 -> "usia";
            case 5 -> "alasan";
            default -> null;
        };
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> list. get(row).getNik();
            case 1 -> list. get(row).getnama();
            case 2 -> list. get(row).getGender();
            case 3 -> list. get(row).getAlamat();
            case 4 -> list. get(row).getUsia();
            case 5 -> list. get(row).getAlasan();
            default -> null;
        };
    }
}
