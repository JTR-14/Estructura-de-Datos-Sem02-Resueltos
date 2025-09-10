/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

import javax.swing.table.DefaultTableModel;


public class VectorEmpleado {
    private Empleado vector[];
    private int totalElementos;

    public VectorEmpleado() {
        vector = new Empleado[65];
        totalElementos = 0;
    }
    public void agregar(Empleado empleado){
        if(totalElementos<vector.length){
           vector[totalElementos] = empleado;
           totalElementos++;
        }
    }
    public void mostrar(DefaultTableModel modelo){
        Object datos[][] = new Object[totalElementos][3];
        String titulos [] = {"NOMBRE", "EDAD","VENTAS"};
        for(int i=0 ; i<totalElementos ; i++){
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getEdad();
            datos[i][2] = vector[i].getVentas();
        }
        modelo.setDataVector(datos, titulos);
    }
    
}
