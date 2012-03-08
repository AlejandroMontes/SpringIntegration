/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import org.zkoss.zul.ListModelArray;

/**
 *
 * @author Alejandro.Montes
 */
public class Producto {
    
    private String nombre;
    private String proveedor;
    private double costo;
    
    
    public Producto() {
    }

    public Producto(String nombre, String proveedor, double costo) {
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
}
