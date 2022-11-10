package modelos;

/**
 * @author jadg1
 * @version 1.0
 * @created 09-nov.-2022 15:44:00
 */
public class Ciudad {

    private int id;
    private String nombre;

    public Ciudad() {

    }

    public Ciudad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    

}//end Ciudad
