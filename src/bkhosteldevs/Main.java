/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkhosteldevs;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import javax.swing.JFrame;

/**
 *
 * @author rodri
 */
public class Main {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionDatos gd=new GestionDatos();
        Reserva reservaEjemplo= new Reserva("Reserva1", "690-210-304", "CONGRESO", 10, "CARTA", new Date(1890, 10, 20, 10, 10));
        System.out.println(reservaEjemplo.toString());
       // gd.crearReserva(reservaEjemplo);
        
        
       
       
        MenuPrincipal menu = new MenuPrincipal();
        menu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        menu.setSize(400, 500);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }

}
