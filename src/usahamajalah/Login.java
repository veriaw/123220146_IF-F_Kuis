/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usahamajalah;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class Login extends JFrame implements ActionListener{
    JLabel greet = new JLabel("Welcome To Rifuki Majalah");
    JLabel deskripsi = new JLabel("Menjual Majalah Untuk Setiap Kategori Umur");
    JLabel usernameLabel = new JLabel("Username :");
    JTextField inputUsername = new JTextField();
    JLabel passwordLabel = new JLabel("Password :");
    JTextField inputPassword = new JTextField();
    JButton login = new JButton("Login");
    Login(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(480, 720);
        setLayout(null);
        setTitle("Usaha Majalah Rifuki");
        
        add(greet);
        greet.setBounds(90, 30, 300, 20);
        greet.setHorizontalAlignment(JLabel.CENTER);
        greet.setFont(greet.getFont().deriveFont(20f));
        
        add(deskripsi);
        deskripsi.setBounds(100, 60, 280, 20);
        deskripsi.setHorizontalAlignment(JLabel.CENTER);
        deskripsi.setFont(deskripsi.getFont().deriveFont(12f));
        
        add(usernameLabel);
        usernameLabel.setBounds(90, 90, 180, 20);
        usernameLabel.setFont(usernameLabel.getFont().deriveFont(12f));
        
        add(inputUsername);
        inputUsername.setBounds(90, 110, 300, 25);
        
        add(passwordLabel);
        passwordLabel.setBounds(90, 150, 180, 20);
        passwordLabel.setFont(passwordLabel.getFont().deriveFont(12f));
        
        add(inputPassword);
        inputPassword.setBounds(90, 170, 300, 25);
        
        add(login);
        login.setBounds(140, 210, 200, 30);
        login.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = inputUsername.getText();
            String password = inputPassword.getText();
            if(!username.equals("123220146")||!password.equals("12345")||username.isEmpty()||password.isEmpty()){
                throw new Exception("Username atau Password salah!");
            };
            new MainMenu(username);
            this.dispose();
        }catch(Exception error){
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
    
}
