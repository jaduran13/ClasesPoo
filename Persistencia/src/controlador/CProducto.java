/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.sql.*;
import modelos.Producto;
/**
 *
 * @author Administrador
 */
public class CProducto {
    final String CONSULTA="Select * from Producto";
    final Conexion CONEX = new Conexion();
    Connection conn;
    
    public CProducto(){
        conn = CONEX.obtenerConexion();
    }
    
    public void mostrarRegistro(){
        try{
            PreparedStatement sp = 
                    conn.prepareStatement(CONSULTA);
            ResultSet rs = sp.executeQuery();
            while(rs.next()){
                Producto prod = 
                        new Producto( 
                                rs.getInt("idProd"),
                                rs.getString("nombreProd"),
                                rs.getDouble("precioProd"),
                                rs.getInt("existenciaProd"),
                                rs.getInt("existMinProd"),
                                rs.getBoolean("estado"), 
                                0      
                        );
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
