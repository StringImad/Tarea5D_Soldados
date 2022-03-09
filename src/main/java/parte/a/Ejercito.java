/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author MSI
 */
public class Ejercito {

    private Set<Soldado> listaSoldados;

    public Ejercito() {
        this.listaSoldados = new HashSet<>();
    }

    //metodo publico que devuelve el numero de soldados que hay en la lista
    public int saberNumeroDeSoldados() {
        return listaSoldados.size();
    }

    //metodo publico para Alistar a un solado.
    public void alistar(Soldado a) {
        listaSoldados.add(a);
    }
//Metodo publico que devuelve true si no hay soldados en la lista

    public boolean estadoEjercito() {
        return listaSoldados.isEmpty();
    }
//Metodo publico que devuelve true si el soldado que recibe por parametro esta en la lista 

    public boolean estaAlistado(Soldado o) {
        return listaSoldados.contains(o);
    }
///Metodo que pasa de set a arrayList y lo devuelve

    public ArrayList rellenarArrayConSet() {
        ArrayList<Soldado> arraySoldados = new ArrayList<>();

        for (Soldado listaSoldado : listaSoldados) {
            arraySoldados.add(listaSoldado);

        }
        //El objeto iterator sirve para recorrer todos los elementos de una estructura de datos
        //Es equivalente a usar el for each
        Iterator<Soldado> itera1 = listaSoldados.iterator();
        while (itera1.hasNext()) {
            Soldado au = itera1.next();
        }

        return arraySoldados;

    }
//Metodo que voora el soldado recibido

    public boolean dematricularSoldado(Soldado o) {
        return listaSoldados.remove(o);
    }

    public void imprimir() {
        for (Soldado listaSoldado : listaSoldados) {
            System.out.println(listaSoldado);
        }
    }
}
