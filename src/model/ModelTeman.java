/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Leo Irawan-15312412-TI 15 C

 */
package model;

/**
 *
 * @Leo Irawan
 */
public class ModelTeman {
    private int id;
    private String nama, nope, email;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNope(String nope) {
        this.nope = nope;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNope() {
        return nope;
    }

    public String getEmail() {
        return email;
    }
    
    
}
