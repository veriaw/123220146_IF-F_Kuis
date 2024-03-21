/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usahamajalah;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Lab Informatika
 */
public class MainMenu extends JFrame implements ActionListener{
    JLabel greet = new JLabel();
    JLabel deskripsi = new JLabel("Silahkan pilih menu dibawah untuk membeli majalah");
    JButton anak = new JButton("Majalah Anak");
    JButton remaja = new JButton("Majalah Remaja");
    JButton dewasa = new JButton("Majalah Dewasa");
    MainMenu(String username){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(480, 720);
        setLayout(null);
        setTitle("Usaha Majalah Rifuki");
        
        add(greet);
        greet.setText("Selamat Datang, "+username);
        greet.setBounds(90, 30, 300, 25);
        greet.setHorizontalAlignment(JLabel.CENTER);
        greet.setFont(greet.getFont().deriveFont(20f));
        
        add(deskripsi);
        deskripsi.setBounds(50, 60, 380, 20);
        deskripsi.setHorizontalAlignment(JLabel.CENTER);
        deskripsi.setFont(deskripsi.getFont().deriveFont(12f));
        
        add(anak);
        anak.setBounds(140, 100, 200, 30);
        anak.addActionListener(this);
        
        add(remaja);
        remaja.setBounds(140, 140, 200, 30);
        remaja.addActionListener(this);
        
        add(dewasa);
        dewasa.setBounds(140, 180, 200, 30);
        dewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == anak){
            String kategori = anak.getText();
            String harga = "Rp. 12700/Pcs";
            new CheckoutMenu(kategori, harga);
        }else if(e.getSource() == remaja){
            String kategori = remaja.getText();
            String harga = "Rp. 15200/Pcs";
            new CheckoutMenu(kategori, harga);
        }else if(e.getSource() == dewasa){
            String kategori = dewasa.getText();
            String harga = "Rp. 26900/Pcs";
            new CheckoutMenu(kategori, harga);
        }
        this.dispose();
    }
    
}
