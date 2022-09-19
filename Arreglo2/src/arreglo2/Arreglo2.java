/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo2;

/**
 *
 * @author Administrador
 */
public class Arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[3][3];
        matriz[0][0] = 4;
        matriz[0][1] = 5;
        matriz[0][2] = 2;
        matriz[1][0] = 7;
        matriz[1][1] = 3;
        matriz[1][2] = 9;
        matriz[2][0] = 10;
        matriz[2][1] = 20;
        matriz[2][2] = 22;
        
//        for(int i=0; i<matriz.length; i++){
//            for(int j=0; j<matriz[i].length; j++){
//                System.out.print(" " +matriz[i][j]);
//            }
//            System.out.println();
//        }
        for(int[] fila: matriz){
            for(int col : fila){
                System.out.print(" "+ col);
            }
            System.out.println("");
        }
        
        
    }
    
}
