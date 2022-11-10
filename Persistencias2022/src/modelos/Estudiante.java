package modelos;

import java.util.Date;

/**
 * @author jadg1
 * @version 1.0
 * @created 09-nov.-2022 15:43:59
 */
public class Estudiante {

    private int codigo;
    private String nombres;
    private String apellidos;
    private Date fechaNac;
    private String email;
    private String direccion;
    private boolean estado;
    private Ciudad m_Ciudad;
    private Carrera m_Carrera;

    public Estudiante() {

    }

    public Estudiante(int codigo, String nombres, String apellidos, Date fechaNac, String email, String direccion, boolean estado, Ciudad m_Ciudad, Carrera m_Carrera) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
        this.m_Ciudad = m_Ciudad;
        this.m_Carrera = m_Carrera;
    }

    public Carrera getM_Carrera() {
        return m_Carrera;
    }

    public void setM_Carrera(Carrera m_Carrera) {
        this.m_Carrera = m_Carrera;
    }

    public Ciudad getM_Ciudad() {
        return m_Ciudad;
    }

    public void setM_Ciudad(Ciudad m_Ciudad) {
        this.m_Ciudad = m_Ciudad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
}//end Estudiante
