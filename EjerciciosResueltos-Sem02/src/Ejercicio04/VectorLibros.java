/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio04;

import javax.swing.table.DefaultTableModel;


public class VectorLibros {
  private Libros vector[];
  private int totalElementos;

    public VectorLibros() {
        vector = new Libros[60];
        totalElementos = 0;
    }
    public void agregar(Libros libro){
        if(totalElementos<vector.length){
           vector[totalElementos] = libro;
           totalElementos++;
        }
    }
    public void mostrar(DefaultTableModel modelo){
        Object datos[][] = new Object[totalElementos][5];
        String titulos [] = {"CODIGO", "TITULO","AUTOR","EDITORIAL","N PAGINAS"};
        for(int i=0 ; i<totalElementos ; i++){
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getTitulo();
            datos[i][2] = vector[i].getAutor();
            datos[i][3] = vector[i].getEditorial();
            datos[i][4] = vector[i].getnPaginas();
        }
        modelo.setDataVector(datos, titulos);
    }
  
}
