package com.rifkkimaulana.program;

    import java.util.List;
/**
 *
 * @author Rifki Maulana
 */

public class Program_SelectAll {

    public static void main(String[] args) {
        
        fasilitas perintah = new fasilitas();
        List<barang> list = perintah.selectAll();
        for(barang barang : list){
            System.out.println(barang.getKode_barang());
            System.out.println(barang.getNama_barang());
            System.out.println(barang.getJumlah());
            System.out.println(barang.getHarga());
            System.out.println("----------------------------");
            
        }
    } 
}
