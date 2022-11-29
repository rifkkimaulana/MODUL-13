package com.rifkkimaulana.program;

/**
 *
 * @author Rifki Maulana
 */

public class Program_Update {

    public static void main(String[] args) {
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKode_barang("B002");
        atk.setNama_barang("Buku Gambar");
        atk.setJumlah(12);
        atk.setHarga(4000);
        perintah.update(atk);
    }
    
}
