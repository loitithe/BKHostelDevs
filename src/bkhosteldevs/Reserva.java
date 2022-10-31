/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkhosteldevs;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class Reserva implements Serializable {

    private String nombre, telefono, tipoEvento, tipoCocina;
    private Date fecha;
    private int numDias, plazas;
    private boolean boolHabitaciones;

    public Reserva() {
    }

    public Reserva(String nombre, String telefono, String tipoEvento, int plazas, String tipoCocina, Date fecha) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipoEvento = tipoEvento;
        this.plazas = plazas;
        this.tipoCocina = tipoCocina;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
        if (tipoEvento.equals(FReserva.eTipoEvento.CONGRESO.name())) {
            this.numDias = numDias;
            this.boolHabitaciones = boolHabitaciones;
        }
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public boolean isBoolHabitaciones() {
        return boolHabitaciones;
    }

    public void setBoolHabitaciones(boolean boolHabitaciones) {
        this.boolHabitaciones = boolHabitaciones;
    }

    @Override
    public String toString() {
        return "Reservas{" + "nombre=" + nombre + ", telefono=" + telefono + ", tipoEvento=" + tipoEvento + ", tipoCocina=" + tipoCocina + ", fecha=" + fecha + ", numero dias=" + numDias + ", plazas =" + plazas + ",Habitaciones =" + boolHabitaciones + '}';

    }

}
