package com.rifkkimaulana.program;

/**
 *
 * @author Rifki Maulana
 */

public class Program_Insert {

    public static void main(String[] args) {
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKode_barang("B002");
        atk.setNama_barang("Buku Gambar");
        atk.setJumlah(12);
        atk.setHarga(3000);
        perintah.insert(atk);
    }
    
}
