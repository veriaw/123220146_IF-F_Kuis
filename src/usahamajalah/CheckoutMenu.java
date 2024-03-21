/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usahamajalah;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import katalog.*;

/**
 *
 * @author Lab Informatika
 */
public class CheckoutMenu extends JFrame implements ActionListener{
    JLabel section = new JLabel("Halaman Utama");
    JLabel kategoriLabel = new JLabel("Kategori");
    JLabel kategoriMajalah = new JLabel("");
    JLabel hargaLabel = new JLabel("Harga");
    JLabel hargaMajalah = new JLabel("");
    JLabel jumlahLabel = new JLabel("Jumlah");
    JTextField inputJumlah = new JTextField();
    JButton kembali = new JButton("Kembali");
    JButton beli = new JButton("Beli");
    JLabel totalLabel = new JLabel("Total Pembelian");
    JLabel hargaSatuan = new JLabel("Harga Satuan");
    JLabel jumlah = new JLabel("Jumlah");
    JLabel totalHarga = new JLabel("Total Harga");
    JLabel hasil1 = new JLabel("[Berupa Angka]");
    JLabel hasil2 = new JLabel("[Berupa Angka]");
    JLabel hasil3 = new JLabel("[Berupa Angka]");
    CheckoutMenu(String kategori, String harga){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(480, 720);
        setLayout(null);
        setTitle("Usaha Majalah Rifuki");
        
        add(section);
        section.setBounds(90, 30, 180, 20);
        section.setFont(section.getFont().deriveFont(13f));
        
        add(kategoriLabel);
        kategoriLabel.setBounds(90, 70, 60, 20);
        kategoriLabel.setFont(kategoriLabel.getFont().deriveFont(13f));
       
        add(kategoriMajalah);
        kategoriMajalah.setBounds(160, 70, 180, 20);
        kategoriMajalah.setFont(kategoriMajalah.getFont().deriveFont(13f));
        kategoriMajalah.setText(kategori);
        
        add(hargaLabel);
        hargaLabel.setBounds(90, 110, 60, 20);
        hargaLabel.setFont(hargaLabel.getFont().deriveFont(13f));
        
        add(hargaMajalah);
        hargaMajalah.setBounds(160, 110, 180, 20);
        hargaMajalah.setFont(hargaMajalah.getFont().deriveFont(13f));
        hargaMajalah.setText(harga);
        
        add(jumlahLabel);
        jumlahLabel.setBounds(90, 150, 60, 20);
        jumlahLabel.setFont(jumlahLabel.getFont().deriveFont(13f));
        
        add(inputJumlah);
        inputJumlah.setBounds(160, 150, 180, 30);
        
        add(beli);
        beli.setBounds(140, 190, 200, 30);
        beli.addActionListener(this);
        
        add(kembali);
        kembali.setBounds(140, 240, 200, 30);
        kembali.addActionListener(this);
        
        add(totalLabel);
        totalLabel.setBounds(90, 290, 150, 20);
        totalLabel.setFont(totalLabel.getFont().deriveFont(13f));
       
        add(hargaSatuan);
        hargaSatuan.setBounds(90, 330, 180, 20);
        hargaSatuan.setFont(hargaSatuan.getFont().deriveFont(13f));
     
        
        add(hasil1);
        hasil1.setBounds(250, 330, 180, 20);
        hasil1.setFont(hasil1.getFont().deriveFont(13f));
        hasil1.setText(harga);
        
        add(jumlah);
        jumlah.setBounds(90, 370, 60, 20);
        jumlah.setFont(jumlah.getFont().deriveFont(13f));
        
        add(hasil2);
        hasil2.setBounds(250, 370, 180, 20);
        hasil2.setFont(hasil2.getFont().deriveFont(13f));
        
        add(totalHarga);
        totalHarga.setBounds(90, 410, 180, 20);
        totalHarga.setFont(totalHarga.getFont().deriveFont(13f));
        
        add(hasil3);
        hasil3.setBounds(250, 410, 180, 20);
        hasil3.setFont(hasil3.getFont().deriveFont(13f));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==beli){
                int totalJumlah = Integer.parseInt(inputJumlah.getText());
                if(kategoriMajalah.equals("Majalah Anak")){
                    MajalahAnak majalah1 = new MajalahAnak(totalJumlah);
                    System.out.println(majalah1.hitungHarga());
                    String totalHasil = String.valueOf(majalah1.hitungHarga());
                    System.out.println(totalHasil);
                    hasil2.setText(inputJumlah.getText());
                    hasil3.setText(totalHasil);
                }else if(kategoriMajalah.equals("Majalah Remaja")){
                    MajalahRemaja majalah1 = new MajalahRemaja(totalJumlah);
                    String totalHasil = String.valueOf(majalah1.hitungHarga());
                    hasil2.setText(inputJumlah.getText());
                    hasil3.setText(totalHasil);
                }else if(kategoriMajalah.equals("Majalah Dewasa")){
                    MajalahDewasa majalah1 = new MajalahDewasa(totalJumlah);
                    String totalHasil = String.valueOf(majalah1.hitungHarga());
                    hasil2.setText(inputJumlah.getText());
                    hasil3.setText(totalHasil);
                } ;
            }else if(e.getSource()==kembali){

                this.dispose();
            }
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
