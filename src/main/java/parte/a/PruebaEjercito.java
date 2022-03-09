/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte.a;

/**
 *
 * @author MSI
 */
public class PruebaEjercito {

    public static void main(String[] args) {
        Ejercito peloton = new Ejercito();

        Soldado a1 = new Soldado("111", "pepe", "jse", "ks", 22);
        Soldado a2 = new Soldado("111", "jose", "jse", "ks", 22);
        Soldado a3 = new Soldado("131", "lope", "jse", "ks", 22);
        Soldado a4 = new Soldado("141", "carlo", "jse", "ks", 22);
        Soldado a5 = new Soldado("151", "pepe", "jse", "ks", 22);

        peloton.alistar(a1);
        peloton.alistar(a2);
        peloton.alistar(a3);
        peloton.alistar(a4);
        peloton.alistar(a5);

        peloton.imprimir();
        
        System.out.println("El soldado a3 esta alistado: " + peloton.estaAlistado(a3));

        System.out.println("El ejercito no tiene unidades: " + peloton.estadoEjercito());

        peloton.dematricularSoldado(a4);
        System.out.println("----------Imprimiendo despues de dematricular----------");
        peloton.imprimir();

    }
}
