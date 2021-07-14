/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOmahasiswa;
import DAOinterface.DAOinterface;
import model.mahasiswa;
import model.tabelmodelmahasiswa;
import view.input;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author adrian
 */
public class controllermahasiswa {
    input frame;
    DAOinterface implMahasiswa;
    List<mahasiswa> lb;

    public controllermahasiswa(input frame) {
        this.frame = frame;
        implMahasiswa = new DAOmahasiswa();
        lb = implMahasiswa.getALL();
    }

    //mengosongkan field
    public void reset() {
        frame.getTxtkdmatkul().setText("");
        frame.getTxtmatkul().setText("");
        frame.getTxtuts().setText("");
        frame.getTxtuas().setText("");
    }

    //menampilkan data ke dalam tabel
    public void isiTable() {
        lb = implMahasiswa.getALL();
        tabelmodelmahasiswa tmb = new tabelmodelmahasiswa(lb);
        frame.getTabelData().setModel(tmb);
    }

    //merupakan fungsi untuk menampilkan data yang dipilih dari tabel
//    public void isiField(int row) {
//        frame.getTxtnim().setText(lb.get(row).getNim());
//        frame.getTxtmatkul().setText(lb.get(row).getMatkul());
//        frame.getTxtuts().setText(lb.get(row).getUts().toString());
//        frame.getTxtuas().setText(lb.get(row).getUas().toString());
//    }

    //merupakan fungsi untuk insert data berdasarkan inputan user dari textfield di frame
    public void insert() {
       
      if (!frame.getTxtkdmatkul().getText().trim().isEmpty()& !frame.getTxtmatkul().getText().trim().isEmpty()) {
         
        mahasiswa b = new mahasiswa();
        b.setKdmatkul(frame.getTxtkdmatkul().getText());
        b.setMatkul(frame.getTxtmatkul().getText());
        b.setUts(Integer.parseInt(frame.getTxtuts().getText()));
        b.setUas(Integer.parseInt(frame.getTxtuas().getText()));

        implMahasiswa.insert(b);
        JOptionPane.showMessageDialog(null, "Simpan Data sukses");
       
        } else {
            JOptionPane.showMessageDialog(frame, "Data Tidak Boleh Kosong");
        }
    }

    //berfungsi untuk update data berdasarkan inputan user dari textfield di frame
}
