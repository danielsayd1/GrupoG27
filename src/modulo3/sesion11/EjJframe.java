/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3.sesion11;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Danie
 */
public class EjJframe {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Titulo ventana");
        ventana.setSize(400, 300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        //  ventana.setLayout(layout);

        JButton uno = new JButton("Saludar");
        uno.setSize(100, 50);
        ventana.add(uno);

    }
}
