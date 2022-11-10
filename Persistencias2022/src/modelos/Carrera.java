package modelos;

/**
 * @author jadg1
 * @version 1.0
 * @created 09-nov.-2022 15:43:59
 */
public class Carrera {

    private int codigo;
    private String nombre;
    private double precio;
    private boolean estado;

    public Carrera() {

    }

    public Carrera(int codigo, String nombre, double precio, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  nombre + " | " + precio;
    }
    
    
  
}//end Carrera
