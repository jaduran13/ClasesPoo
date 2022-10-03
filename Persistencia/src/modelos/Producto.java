/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Administrador
 */
public class Producto {
    private int idProd;
    private String nombreProd;
    private double precioProd;
    private int existenciaProd;
    private int existMinProd;
    private boolean estadoProd;
    /**
     * Estado puede tener 3 valores
     * 0 - original
     * 1 - nuevo
     * 2 - modificado
     * 3 - eliminado
     */
    private int estadoReg; 

    public Producto() {
    }

    public Producto(int idProd, String nombreProd, double precioProd, int existenciaProd, int existMinProd, boolean estadoProd, int estadoReg) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.existenciaProd = existenciaProd;
        this.existMinProd = existMinProd;
        this.estadoProd = estadoProd;
        this.estadoReg = estadoReg;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public int getExistenciaProd() {
        return existenciaProd;
    }

    public void setExistenciaProd(int existenciaProd) {
        this.existenciaProd = existenciaProd;
    }

    public int getExistMinProd() {
        return existMinProd;
    }

    public void setExistMinProd(int existMinProd) {
        this.existMinProd = existMinProd;
    }

    public boolean isEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(boolean estadoProd) {
        this.estadoProd = estadoProd;
    }

    public int getEstadoReg() {
        return estadoReg;
    }

    public void setEstadoReg(int estadoReg) {
        this.estadoReg = estadoReg;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", precioProd=" + precioProd + ", existenciaProd=" + existenciaProd + ", existMinProd=" + existMinProd + ", estadoProd=" + estadoProd + ", estadoReg=" + estadoReg + '}';
    }
    
    
    
            
}
