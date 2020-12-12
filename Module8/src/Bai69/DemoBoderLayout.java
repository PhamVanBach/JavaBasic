/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai69;

import java.awt.BorderLayout;
import java.awt.Color;
import javafx.scene.layout.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class DemoBoderLayout extends JFrame{
    public DemoBoderLayout(){
        super("Demo BoderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        DemoBoderLayout ui = new DemoBoderLayout();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());
        
        JPanel pnNorth = new JPanel();
        pnNorth.setBackground(Color.red);
        pnBorder.add(pnNorth, BorderLayout.NORTH);
        
        JPanel pnSouth = new JPanel();
        pnSouth.setBackground(Color.red);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);
        
        JPanel pnWest = new JPanel();
        pnWest.setBackground(Color.BLUE);
        pnBorder.add(pnWest, BorderLayout.WEST);
        
        JPanel pnEast = new JPanel();
        pnEast.setBackground(Color.BLACK);
        pnBorder.add(pnEast, BorderLayout.EAST);
        
        JPanel pnCenter = new JPanel();
        pnCenter.setBackground(Color.yellow);
        pnBorder.add(pnCenter, BorderLayout.CENTER);
        
        ui.getContentPane().add(pnBorder);
    }
}
