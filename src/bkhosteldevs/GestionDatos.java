/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bkhosteldevs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

/**
 *
 * @author rodri
 */
public class GestionDatos {

    public static final String RESERVAS_FILE = Paths.get("src", "docs", "reservas.dat").toString();

    /**
     * No hace lo esperado. no crea la reserva
     * @param reserva
     */
    static void crearReserva(Reserva reserva) {
        Reserva r = reserva;
        if (reserva != null) {
            try ( FileOutputStream fos = new FileOutputStream(RESERVAS_FILE, true);  ObjectOutputStream oos = new ObjectOutputStream(fos);) {
                //    oos.writeObject(r);
                oos.writeUTF(r.toString());

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * 
     * @return 
     */
    static Reserva verReservas() {
        System.err.println("ver reserva");
        Reserva reserva = null;
        try ( FileInputStream fis = new FileInputStream(RESERVAS_FILE);  ObjectInputStream ois = new ObjectInputStream(fis);) {
            Object ob = ois.readObject();
            if (ob instanceof Reserva) {
                reserva = (Reserva) ob;
                System.out.println(reserva.toString());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.err.println("Ha ocurrido una excepción: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Ha ocurrido una excepción: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.err.println("Ha ocurrido una excepción: " + ex.getMessage());
        }
        return reserva;
    }

}
