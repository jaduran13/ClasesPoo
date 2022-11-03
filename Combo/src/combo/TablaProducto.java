/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package combo;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author jadg1
 */
public class TablaProducto {
    private ArrayList<Producto> lista = new ArrayList<>();

    public TablaProducto() {
    }

    public ArrayList<Producto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Producto> lista) {
        this.lista = lista;
    }
    
    public boolean agregarProd(int cod, String nom, double pre){
        try{
            lista.add(new Producto(cod, nom, pre));
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }
    
    public DefaultComboBoxModel llenarCombo(){
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        for(Producto prod : lista){
            combo.addElement(prod);
        }
        return combo;
    }
}
