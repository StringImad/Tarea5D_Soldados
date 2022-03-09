/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;
import parte.a.Soldado;

/**
 *
 * @author MSI
 */
public class EjercitoOrdenado {

    private SortedSet<Soldado> listaSoldadosOrdenados;

    public EjercitoOrdenado() {
        this.listaSoldadosOrdenados = new TreeSet<>();
    }
//metodo publico que devuelve el numero de soldados que hay en la lista

    public int saberNumeroDeSoldados() {
        return listaSoldadosOrdenados.size();
    }

    //metodo publico para Alistar a un solado.
    public void alistar(Soldado a) {
        listaSoldadosOrdenados.add(a);
    }
//Metodo publico que devuelve true si no hay soldados en la lista

    public boolean estadoEjercito() {
        return listaSoldadosOrdenados.isEmpty();
    }
//Metodo publico que devuelve true si el soldado que recibe por parametro esta en la lista 

    public boolean estaAlistado(Soldado o) {
        return listaSoldadosOrdenados.contains(o);
    }
///Metodo que pasa de set a arrayList y lo devuelve

    public ArrayList rellenarArrayConSet() {
        ArrayList<Soldado> arraySoldados = new ArrayList<>();

        for (Soldado listaSoldado : listaSoldadosOrdenados) {
            arraySoldados.add(listaSoldado);

        }
        return arraySoldados;

    }
//Metodo que voora el soldado recibido

    public boolean dematricularSoldado(Soldado o) {
        return listaSoldadosOrdenados.remove(o);
    }

    public void imprimir() {
        for (Soldado listaSoldado : listaSoldadosOrdenados) {
            System.out.println(listaSoldado);
        }
    }
}
