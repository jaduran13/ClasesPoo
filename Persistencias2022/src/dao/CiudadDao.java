/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Ciudad;
/**
 *
 * @author jadg1
 */
public class CiudadDao {
    Connection conn = null;
    PreparedStatement ps =null;
    ResultSet rs = null;
    private ArrayList<Ciudad> listaReg = new ArrayList<>();

    public CiudadDao() {
        llenarListado();
    }
    
    
    
    /**
     * Registra los datos de una ciudad en un 
     * arraylist
     * @param ciudad 
     */
    public void agregarCiudad(Ciudad ciudad){
        listaReg.add(ciudad);
    }
    
    
    
    /**
     * Obtiene los registros de la tabla 
     * Ciudad
     */
    public void obtRegistros(){
        try{
            conn = Conexion.getConnection();
            String tSQL = "Select * from Ciudad";
            ps = conn.prepareStatement(tSQL, 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE,
                    ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Agrega a la lista los registros obtenido
     * de la BD
     */
    public void llenarListado(){
        this.obtRegistros();
        this.limpiarListado();
        try {
            while(rs.next()){
                Ciudad ciudad = new Ciudad(
                        rs.getInt("CiudadID"),
                        rs.getString("Nombre")
                );
                this.agregarCiudad(ciudad);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Agrega un nuevo registro a mi Base de datos
     * @param c
     * @return 
     */
    public boolean agregarRegistro(Ciudad c){
        boolean isSave = false;
        this.obtRegistros();
        try {
            rs.moveToInsertRow();
            rs.updateString("Nombre", c.getNombre());
            rs.insertRow();
            rs.moveToCurrentRow();
            isSave=true;
        } catch (SQLException ex) {
            Logger.getLogger(CiudadDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isSave;
    }
    
    public ArrayList<Ciudad> getListaReg() {
        return listaReg;
    }

    public void setListaReg(ArrayList<Ciudad> listaReg) {
        this.listaReg = listaReg;
    }
    
    private void limpiarListado(){
        this.listaReg.clear();
    }
}
