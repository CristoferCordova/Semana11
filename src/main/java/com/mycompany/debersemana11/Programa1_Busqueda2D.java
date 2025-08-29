/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.debersemana11;

/**
 *
 * @author Cristofer
 */
public class Programa1_Busqueda2D {
public static void main(String[] args) {
       
    int [][] numeros = {{1,3,2},
                           {6,7,8},
                           {10,11,12},
    };
       int valorBuscado = 15;
       boolean encontrado = false;
       int row = -1;
       int column = -1;
       
       for (int f = 0; f<3; f++){
            for (int c = 0; c<3; c++){
                
                if (numeros[f][c] == valorBuscado) {
                    row = f;
                    column = c;
                    encontrado = true;
                    
                }    
               }
              }
       
       if (encontrado) {
           System.out.println("Se encontro el valor "+ valorBuscado + " en la siguiente ubicacion de la matriz ["+row+"]["+column+"]");  
                       }
       
       else {
             System.out.println(valorBuscado + " no se encontro en la matriz "+ "["+row+"]["+column+"]");
            }
      }
}
