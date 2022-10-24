/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion2410;

import dao.DUsuario;
import formularios.FrmLogin;

/**
 *
 * @author Administrador
 */
public class Sesion2410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DUsuario listaU = new DUsuario();
        listaU.agregar("avi", "123", "Avi", "Zepeda", 
                "avi.zepeda@gmail.com");
        listaU.agregar("abi", "123", "Abigail", "Rocha",
                "abigail.rocha@gmail.com");
        listaU.agregar("dayer", "147", "Dayer", "Torres", 
                "dayer.torres@gmail.com");
        listaU.agregar("maria", "546", "María E", "Martinez",
                "mari@uca.edu.ni");
        
        FrmLogin login =new FrmLogin();
        login.lista = listaU;
        login.setVisible(true);
    }
    
}
