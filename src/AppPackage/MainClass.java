/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppPackage;

import javax.swing.JFrame;

/**
 *
 * @author Janice
 */
public class MainClass {
    public static void main(String[] args) {
        CreateChart CC = new CreateChart("Pie Chart Test","Total Sales of Product A 2016");
        CC.pack();
        CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CC.setVisible(true);
        
    }
    
}
