package myp.practica1;

import java.util.*;

/**
 * Clase de un Cliente de un Servicio.
 */

public class Cliente implementes Observador {

    private int saldo;
    private String nombre;
    private List<Suscripcion> servicios = new ArrayList<Servicio>();
    private List<String> recomendaciones = new ArrayList<String>();

    /**
     * Define el estado inicial del cliente.
       Nombre del Cliente
       Saldo del Cliente.
     */
    public Cliente(int saldo, String nombre) {
        this.saldo = saldo;
	this.nombre = nombre;
    }

    /**
     * Regresa el saldo del cliente
     */
    public int getSaldo(){
      return saldo;
    }

    /**
     * Define el saldo del cliente
     */
    public void setSaldo(int saldo){
      this.saldo = saldo;
    }

    /**
     * Regresa el nombre del cliente
     */
    public String getNombre(){
      return nombre;
    }

    /**
     * Define el nombre del cliente
     */
    public void setNombre(String nombre){
      this.nombre= nombre;
    }

    /**
     * Regresa una lista de los servicios del cliente
     */
    public List<Suscripcion> getServicios() {
        return servicios;
    
    }

    public List<String> getRecomendaciones() {
        return recomendaciones;
    }

    /**
     * Actualiza sus recomendaciones del dia.
     */
    @Override public void update() {
        recomendaciones.clear();
        for(servicio : servicios)
	    servicio.recomiendaA(this);
    }
    
}
