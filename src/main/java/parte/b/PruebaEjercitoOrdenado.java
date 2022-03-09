/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.b;

import parte.a.Ejercito;
import parte.a.Soldado;

/**
 *
 * @author MSI
 */
public class PruebaEjercitoOrdenado {
      public static void main(String[] args) {
        EjercitoOrdenado peloton = new EjercitoOrdenado();
        
       
        
        Soldado a1 = new Soldado("4", "a", "jse", "ks", 22);
        Soldado a2 = new Soldado("2", "b", "jse", "ks", 22);
        Soldado a3 = new Soldado("6", "c", "jse", "ks", 22);
        Soldado a4 = new Soldado("3", "d", "jse", "ks", 22);
        Soldado a5 = new Soldado("1", "e", "jse", "ks", 22);
        
        peloton.alistar(a1);
        peloton.alistar(a2);
        peloton.alistar(a3);
        peloton.alistar(a4);
        peloton.alistar(a5);

        peloton.imprimir();
        
        peloton.estaAlistado(a3);
        
        peloton.estadoEjercito();
        
        peloton.dematricularSoldado(a4);
        
        
    }
}
