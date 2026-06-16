/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author jutt
 */

public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor
    public Mahasiswa() {
        // ...3 lines
    }

    public Mahasiswa(int id, String nama) {
        // ...4 lines
        this.id = id;
        this.nama = nama;
    }

    // getter and setter
    public int getId() {
        // ...3 lines
        return id;
    }

    public void setId(int id) {
        // ...3 lines
        this.id = id;
    }

    public String getNama() {
        // ...3 lines
        return nama;
    }

    public void setNama(String nama) {
        // ...3 lines
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}