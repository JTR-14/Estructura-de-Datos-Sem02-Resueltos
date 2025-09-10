/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

import javax.swing.table.DefaultTableModel;


public class VectorAlumno {
    private Alumno vector[];
    private int totalElementos;

    public VectorAlumno() {
        vector = new Alumno[50];
        totalElementos=0;
    }
    
    public void agregar(Alumno valor){
        if(totalElementos< vector.length){
            vector[totalElementos] =valor;
            totalElementos++;
        }    
    }
    public void mostrar(DefaultTableModel modelo){
        Object datos[][]= new Object[totalElementos][2];
        String titulos[] = {"Nombre","Nota"};
        for(int i=0; i<totalElementos;i++){
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getNota();
        }
        modelo.setDataVector(datos, titulos);
    }
    private void quickSortAlfabetico(Alumno a[], int primero, int ultimo) {
        int i, j, central;
        Alumno pivote, temp;
        central=(primero+ultimo)/2;
        pivote=a[central];
        i=primero;
        j=ultimo;
    do{
        while(a[i].getNombre().compareToIgnoreCase(pivote.getNombre())<0) i++;
        while(a[j].getNombre().compareToIgnoreCase(pivote.getNombre())>0) j--;
        if(i<=j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }while(i<=j);
    if(primero<j)
        quickSortAlfabetico(a,primero,j);
    if(i<ultimo)
        quickSortAlfabetico(a,i,ultimo);
    }

    public void quickSortAlfabetico() {
        quickSortAlfabetico(vector,0,totalElementos-1);
    }

    private void quickSortMerito(Alumno a[], int primero, int ultimo) {
        int i, j, central;
        Alumno pivote, temp;
        central=(primero+ultimo)/2;
        pivote=a[central];
        i=primero;
        j=ultimo;
        do{
            while(a[i].getNota()>pivote.getNota()) i++;
            while(a[j].getNota()<pivote.getNota()) j--;
            if(i<=j){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
        }
    }while(i<=j);
    if(primero<j)
        quickSortMerito(a,primero,j);
    if(i<ultimo)
        quickSortMerito(a,i,ultimo);
    
    }
    public void quickSortMerito(){
        quickSortMerito(vector,0,totalElementos-1);
    }
}
