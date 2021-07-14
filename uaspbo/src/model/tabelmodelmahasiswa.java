/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author adrian
 */
public class tabelmodelmahasiswa extends AbstractTableModel{
    List<mahasiswa> lb;

    public tabelmodelmahasiswa(List<mahasiswa> lb) {
        this.lb = lb;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }


    @Override
    public int getRowCount() {
        return lb.size();
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "kdmatkul";
            case 1 -> "matkul";
            case 2 -> "uts";
            case 3 -> "uas";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int row, int column) {
        return switch (column) {
            case 0 -> lb.get(row).getKdmatkul();
            case 1 -> lb.get(row).getMatkul();
            case 2 -> lb.get(row).getUts();
            case 3 -> lb.get(row).getUas();
            default -> null;
        };
    }
}
