/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan12latihan;

/**
 *
 * @author jutt
 */

import java.util.HashMap;
import java.util.Map;

public class MahasiswaLambda {
    public static void main(String[] args) {
        // Membuat objek Map dengan NIM (String) dan Nama (String)
        Map<String, String> mahasiswaMap = new HashMap<>();

        // Mengisi data ke dalam Map sesuai instruksi latihan
        mahasiswaMap.put("24060122140123", "Adi");
        mahasiswaMap.put("24060122140124", "Bambang");
        mahasiswaMap.put("24060122140125", "Cici");
        mahasiswaMap.put("24060122140126", "Didi");

        // Menampilkan key dan value menggunakan ekspresi lambda [cite: 64]
        mahasiswaMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}