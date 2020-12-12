/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai70;

/**
 *
 * @author Administrator
 */

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JCheckBoxTest { 
    private JFrame mainFrame;
    private JTextField headerTxtF;
    private JPanel controlPanel;
     
        
    public JCheckBoxTest() {
        prepareGUI();
    }
    
    public static void main(String[]args) {   
        JCheckBoxTest swingControlDemo = new JCheckBoxTest();
        swingControlDemo.showCheckBoxDemo();
    }
    
     private void prepareGUI() {
        mainFrame = new JFrame("Vi du JCheckBox trong Java Swing");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }
    private void showCheckBoxDemo() {
      
        final JCheckBox chkBold = new JCheckBox("Bold");
        final JCheckBox chkItalic = new JCheckBox("Italic");
        final JTextField txtF = new JTextField(16);
               
        chkBold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    if(chkBold.isSelected()){
                       if(chkItalic.isSelected()){
                            Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                            txtF.setFont(font);
                       }else{
                           Font font = new Font("Arial", Font.BOLD, 14);
                            txtF.setFont(font);
                       }        
                    }
                    else{
                        if(chkItalic.isSelected()){
                            Font font = new Font("Arial", Font.ITALIC | Font.ITALIC, 14);
                            txtF.setFont(font);
                       }else{
                            Font font = new Font("Arial", Font.PLAIN, 14);
                            txtF.setFont(font);
                       }     
                    }
            }

        });
        chkItalic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    if(chkBold.isSelected()){
                       if(chkItalic.isSelected()){
                            Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 14);
                            txtF.setFont(font);
                       }else{
                           Font font = new Font("Arial", Font.BOLD, 14);
                            txtF.setFont(font);
                       }        
                    }
                    else{
                        if(chkItalic.isSelected()){
                            Font font = new Font("Arial", Font.ITALIC | Font.ITALIC, 14);
                            txtF.setFont(font);
                       }else{
                            Font font = new Font("Arial", Font.PLAIN, 14);
                            txtF.setFont(font);
                       }     
                    }
            }

        });
        controlPanel.add(txtF);
        controlPanel.add(chkBold);
        controlPanel.add(chkItalic);       
        mainFrame.setVisible(true);
    }
}
