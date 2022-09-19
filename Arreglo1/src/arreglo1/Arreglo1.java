/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo1;

/**
 *
 * @author Administrador
 */
public class Arreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto[] misProducto = new Producto[10];
        Producto cafe = new Producto(1, "Cafe", 90);
        Producto pan = new Producto(2, "Pan de queso", 35);
        Producto desayuno = new Producto(3, "Desayuno tipico", 80);
        
        misProducto[0]= cafe;
        misProducto[1]= pan;
        misProducto[2]= desayuno;
        
        double monto = 0;
        for(Producto prod : misProducto){
            System.out.println(prod);
            if(prod != null)monto += prod.getPrecio();
        }
        System.out.println("Monto a Pagar "+ monto);
        
        
//        int [] numero = {1, 2, 3, 4,5};
//        for (int i =0; i < numero.length; i++){
//            System.out.println(numero[i]);
//        }
//        for(int i :numero){
//            System.out.println(i);
//        }
    }
    
}
