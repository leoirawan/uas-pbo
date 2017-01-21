/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Leo Irawan-15312412-TI 15 C

 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ModelPinjam;
import model.ModelTeman;
import util.Koneksi;

/**
 *
 * @Leo Irawan
 */
public class ControllerTeman {
    Koneksi koneksi = new Koneksi();
    
    public void simpanTeman(ModelTeman modTem){
        koneksi.konDat();
        String querySimpanTeman = "insert into tbl_teman(nama,nope,email) values('"+modTem.getNama()+"','"+modTem.getNope()+"','"+modTem.getEmail()+"')";
        try {
            koneksi.state.executeUpdate(querySimpanTeman);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan");
            System.err.println("Galat Controller Teman : "+e);
        }
    }
    
    public void hapusDataTeman(ModelTeman mx){
        try {
            koneksi.konDat();
            String queryHapusDataTeman = "delete from tbl_teman where id=('"+mx.getId()+"')";
            koneksi.state.executeUpdate(queryHapusDataTeman);
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        } catch (SQLException e) {
            System.err.println("Error Hapus Data Teman : "+e);
            JOptionPane.showMessageDialog(null, "Gagal Menghapus!");
        }
    }
    
    public void ubahDataTeman(ModelTeman mx){
        koneksi.konDat();
         try {
            int id = mx.getId();
            String nama = mx.getNama();
            String nope = mx.getNope();
            String email = mx.getEmail();

            String queryUbahDataTeman = "update tbl_teman "
                    + "set nama=('" + nama + "'),"
                    + "nope=('"+ nope +"'),"
                    + "email=('"+ email +"')"
                    + "where id=('" + id + "')";
            koneksi.state.executeUpdate(queryUbahDataTeman);
            JOptionPane.showMessageDialog(null, "Berhasil Memperbaharui data !");
        } catch (SQLException e) {
            System.err.println("Error Ubah Data Teman : " + e);
            JOptionPane.showMessageDialog(null, "Gagal Merubah Data !");
        }
    }
}
