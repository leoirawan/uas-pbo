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
import util.Koneksi;

/**
 *
 * @Leo Irawan
 */
public class ControllerPinjam {

    Koneksi koneksi = new Koneksi();

    public void simpanPinjaman(ModelPinjam modPin) {
        koneksi.konDat();
        String querySimpanPinjaman = "insert into tbl_pinjam(namaTeman,barangDipinjam) values('" + modPin.getNama() + "','" + modPin.getBarang() + "')";
        try {
            koneksi.state.executeUpdate(querySimpanPinjaman);
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
            System.err.println("Trjadi Kesalahan pada Controller Teman : " + e);
        }
    }
    
    public void hapusDataPinjam(ModelPinjam mp){
        try {
            koneksi.konDat();
            String queryHapusDataPinjam = "delete from tbl_pinjam where id=('"+mp.getId()+"')";
            koneksi.state.executeUpdate(queryHapusDataPinjam);
            JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Gagal Menghapus!");
        }
    }
    
    public void ubahDataPinjam(ModelPinjam modPin){
        koneksi.konDat();
         try {
            int id = modPin.getId();
            String nama = modPin.getNama();
            String barang = modPin.getBarang();

            String queryUbahDataPinjam = "update tbl_pinjam "
                    + "set barangDipinjam=('"+ barang +"') where id=('" + id + "')";
            koneksi.state.executeUpdate(queryUbahDataPinjam);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terubah");
        }
    }
}
