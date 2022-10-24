/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Administrador
 */
public class Usuario {
    private String nombreUser;
    private String pwUser;
    private String nombre;
    private String apellidos;
    private String email;
    private int estado;

    public Usuario() {
    }

    public Usuario(String nombreUser, String pwUser, String nombre, String apellidos, String email, int estado) {
        this.nombreUser = nombreUser;
        this.pwUser = pwUser;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getPwUser() {
        return pwUser;
    }

    public void setPwUser(String pwUser) {
        this.pwUser = pwUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean existeUser(String user, 
            String pw){
        return this.nombreUser.equals(user) &&
                this.pwUser.equals(pw);
    }
    
}
