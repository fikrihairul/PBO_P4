package com.mycompany.pbo4;
/*@author Fikri*/
public class Barang {
    public String kode_barang;
    public String nama_barang;
    private int stok;
    
    public int getStok(){
        return this.stok;
    }
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }
    public void tambahStok(){
        this.stok += 20;
    }
}