/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio03;

import javax.swing.table.DefaultTableModel;


public class VectorMedicamentos {
    private Medicamentos vector[];
    private int totalElementos;

    public VectorMedicamentos() {
        vector = new Medicamentos[50];
        totalElementos = 0;
        
    }
    public void agregar(Medicamentos medicamento){
        if(totalElementos<vector.length){
           vector[totalElementos] = medicamento;
           totalElementos++;
        }
    }
    public void mostrar(DefaultTableModel modelo){
        Object datos[][] = new Object[totalElementos][4];
        String titulos [] = {"CODIGO", "NOMBRE","LABORATORIO","PRECIO"};
        for(int i=0 ; i<totalElementos ; i++){
            datos[i][0] = vector[i].getCodigo();
            datos[i][1] = vector[i].getNombre();
            datos[i][2] = vector[i].getLaboratorio();
            datos[i][3] = vector[i].getPrecio();
        }
        modelo.setDataVector(datos, titulos);
    }
    private void ordenarSeleccionPrecio(Medicamentos vector[] ,int totalElementos){
        int minimo,i, j;
        Medicamentos aux;
        for(i=0 ; i<totalElementos-1 ; i++ ){
            minimo = i;
            for(j=i+1 ; j<totalElementos ; j++){
                if(vector[j].getPrecio()<vector[j-1].getPrecio())
                    minimo = j;  
            }
                    aux = vector[i];
                    vector[i] = vector[minimo];
                    vector[minimo] = aux;
        }
    }
    public void ordenarSeleccionPrecio(){
        ordenarSeleccionPrecio(vector,totalElementos);
    }
    
}
