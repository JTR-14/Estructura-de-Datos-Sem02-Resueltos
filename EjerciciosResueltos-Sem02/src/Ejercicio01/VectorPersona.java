/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio01;

import javax.swing.table.DefaultTableModel;


public class VectorPersona {
    private int totalElementos;
    private Persona persona[];

    public VectorPersona() {
        totalElementos =0;
        persona = new Persona[50];
    }
    public void agregar(Persona valor){
        if(totalElementos<persona.length){
            persona[totalElementos] = valor;
            totalElementos++;
        }
    }
    public void mostrar(DefaultTableModel modelo){
      Object datos[][] = new Object[totalElementos][2];
      String titulos [] = {"NOMBRE", "TELEFONO"};
      for(int i=0;i<totalElementos;i++){
          datos[i][0] = persona[i].getNombre();
           datos[i][1] = persona[i].getTelefono();
      }
      modelo.setDataVector(datos, titulos);
    }
    public void ordenarNombre() {
    int i, j;
    Persona temporal;
    for (i = 0; i < totalElementos - 1; i++) {
        for (j = totalElementos - 1; j > i; j--) {
            if (persona[j].getNombre().compareTo(persona[j - 1].getNombre()) < 0) {

                temporal = persona[j];
                persona[j] = persona[j - 1];
                persona[j - 1] = temporal;
            }
        }
    }
}
}
