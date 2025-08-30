/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.debersemana11;
import java.util.Arrays;

/**
 *
 * @author Cristofer
 */
public class Programa2_Ordenacion2D {
     public static void main(String[] args) {
    int [][] listaNumeros = {{10,17,15},{26,24,30}, {36,38,37}};
    
   // imprime matriz sin ordenar
   
   System.out.println("Matriz sin ordenar");
   for (int f = 0; f < 3; f++) {
    for (int c =0; c<3; c++){
        System.out.print(listaNumeros[f][c] + " ");
    
}
    System.out.println();
}
   int filaOrdenar= 1;   // ordena la primera fila cambiar si quiere la segunda (1) o tercera (3)
   int contador =0;
    for (int [] fila:listaNumeros) {
        if (contador == filaOrdenar){
             Arrays.sort(fila);
             break;
        }
        contador++;
        }
        
    
   // imprimir ordenado
   System.out.println();
   System.out.println("Matriz ordenada segun la fila escogida (por defecto la segunda fila)");
   
     for (int f = 0; f < 3; f++) {
    for (int c =0; c<3; c++){
        System.out.print(listaNumeros[f][c] + " ");
    
}
    System.out.println();
}
   
   
}
}
    

