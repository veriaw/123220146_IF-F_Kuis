/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog;

/**
 *
 * @author Lab Informatika
 */
public class MajalahDewasa implements HitungKasir {
    private int jumlah;

    public MajalahDewasa(int jumlah){
        this.jumlah=jumlah;
    }
    
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    @Override
    public int hitungHarga() {
        return 29600*jumlah;
    }
}
