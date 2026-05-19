/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10b;

/**
 *
 * @author jutt
 */

import java.sql.Connection;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        // ...3 lines
    }

    /** Membuat objek mahasiswa ...4 lines */
    public Mahasiswa makeMhsObject() {
        // ...3 lines
        return null; 
    }

    /** Menambahkan data mahasiswa ...3 lines */
    public void add(Mahasiswa mhs) {
        // ...23 lines
    }

    /** Update data mahasiswa ...4 lines */
    public void update(Mahasiswa mhs) {
        // ...22 lines
    }

    /** Delete data mahasiswa sesuai id ...5 lines */
    public void delete(int id) {
        // ...22 lines
    }

    /** Ambil mahasiswa sesuai id ...6 lines */
    public Mahasiswa getById(int id) {
        // ...33 lines
        return null;
    }

    /** Ambil semua isi tabel mahasiswa ...5 lines */
    public List<Mahasiswa> getAll() {
        // ...39 lines
        return null;
    }
}