/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelos.Usuario;

/**
 *
 * @author Administrador
 */
public class DUsuario {
    private ArrayList<Usuario> lista = 
            new ArrayList<>();

    public ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }

    public DUsuario() {
    }
    
    public void agregar(String user, String pw,
            String nom, String ape, String email){
        this.lista.add(new Usuario(user, pw, nom, ape,
            email, 4));
    }
    
    public boolean buscarUsuario(String user, 
            String pw){
        for (Usuario us: this.lista){
            if(us.existeUser(user, pw))
                return true;
        }
        return false;
    }
}
