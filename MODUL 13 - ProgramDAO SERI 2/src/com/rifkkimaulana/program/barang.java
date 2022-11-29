
package com.rifkkimaulana.program;
import com.stripbandunk.jwidget.annotation.TableColumn;

/**
 *
 * @author Rifki Maulana
 */
public class barang {
    

    
    private String kode_barang;
    private String nama_barang;
    private int jumlah;
    private long harga;

    
        @TableColumn(number=1, name ="KODE BARANG")
    private String kode_barang;
    @TableColumn(number=2, name ="NAMA BARANG")
    private String nama_barang;
    @TableColumn(number=3, name ="JUMLAH")
    private int jumlah;
    @TableColumn(number=1, name ="HARGA")
    private long harga;
    
    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
    
}
