/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Administrador
 */
public class SentenciaFor {
    public DefaultComboBoxModel imprimirNum(){
        DefaultComboBoxModel combo = 
                new DefaultComboBoxModel();
        for(int i= 0; i <=9; i++){
            combo.addElement(i);
        }
        return combo;
    }
}
