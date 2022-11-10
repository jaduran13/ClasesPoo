/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.Countries;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Elsner
 */
public class Dt_Countries {
    //atributos
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    //metodos
    @SuppressWarnings("CallToPrintStackTrace")
    public void cargarDatos()
    {
        try{
            con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT country_id, country_name, region_id  FROM countries", 
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
            rs = ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error en cargarDatos(): "+e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<Countries> listarCountries(){
        ArrayList<Countries> listCountries = new ArrayList<Countries>();
        try{
            this.cargarDatos();
            while(rs.next()){
                Countries c = new Countries();
                c.setCountry_id(rs.getString("country_id"));
                c.setCountry_name(rs.getString("country_name"));
                c.setRegion_id(rs.getInt("region_id"));
                listCountries.add(c);
            }
        }catch(SQLException e){
            System.out.println("Error en listarCountries(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
         return listCountries;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean guardarPais (Countries c)
    {
        //declaramos una bandera en falso
	boolean guardado = false;
	try {
            this.cargarDatos();
            rs.moveToInsertRow();
            rs.updateString("country_id", c.getCountry_id());
            rs.updateString("country_name", c.getCountry_name());
            rs.updateInt("region_id", c.getRegion_id());
            rs.insertRow();
            rs.moveToCurrentRow();
            //si el flujo llega hasta acá el registro se almacenó
            guardado = true; //hacemos verdadera la bandera
	}
	catch (SQLException e) {
            System.out.println("ERROR guardarPais(): "+e.getMessage());
            e.printStackTrace();
	}
	finally
	{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
	}
        //returnamos el valor de la bandera
	return guardado;
    }
    
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean existePais(String id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("country_id").equals(id)){
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existePais(): "+e.getMessage());
            e.printStackTrace();
	}
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
		
        return resp;
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public boolean editarPais(Countries c)
    {
	boolean resp=false;
        try
        {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("country_id").equals(c.getCountry_id())){
                    rs.updateString("country_name", c.getCountry_name());
                    rs.updateInt("region_id", c.getRegion_id());
                    rs.updateRow();
                    resp = true;
                    break;
                }
            }
        }
        catch(SQLException e){
            System.out.println("Error en editarPais(): "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            try {
                    if(rs!=null){
                    rs.close();
                    }
                    if(ps!=null){
                        ps.close();
                    }
                    if(con!=null){
                        Conexion.closeConexion(con);
                    }
            }catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
        }
        return resp;
    } 
       
    @SuppressWarnings("CallToPrintStackTrace")
    public boolean deletePais(String id){
	boolean resp=false;
        try {
            this.cargarDatos();
            rs.beforeFirst();
            while(rs.next()){
                if(rs.getString("country_id").equals(id)){
                    rs.deleteRow();
                    resp=true;
                }
            }	
	} 
        catch (SQLException e) {
            System.out.println("Error existePais(): "+e.getMessage());
            e.printStackTrace();
	}
        finally{
            try{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
                if(con!=null){
                    Conexion.closeConexion(con);
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
		
        return resp;
    }
}
