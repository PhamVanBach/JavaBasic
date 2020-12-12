/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai68;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class DemoBoxLayout extends JFrame{
    public DemoBoxLayout(){
        super("Hoc Boxlayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        DemoBoxLayout ui = new DemoBoxLayout();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC,25);
        JButton btn1 = new JButton("BoxLayout");  
        btn1.setForeground(Color.RED);
        btn1.setFont(font);pnBox.add(btn1);
        
        JButton btn2 = new JButton("BoxLayout");  
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);pnBox.add(btn2);
        
        JButton btn3 = new JButton("BoxLayout");  
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);pnBox.add(btn3);
        
        Container con = ui.getContentPane();
        con.add(pnBox);
    }
}
