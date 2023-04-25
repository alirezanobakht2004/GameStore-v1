package ir.ac.kntu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sign {

    public static void frame() {
        JFrame f = new JFrame("Button Example");
        JButton Admin = new JButton("Admin");
        JButton User = new JButton("User");
        Admin.setBounds(45, 95, 95, 30);
        Admin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Admin");
            }
        });
        f.add(Admin);
        User.setBounds(45, 50, 95, 30);
        User.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("User");
            }
        });
        f.add(User);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args){
        frame();
    }
    
}
