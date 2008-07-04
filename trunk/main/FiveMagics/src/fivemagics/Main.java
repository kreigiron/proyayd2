/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fivemagics;
import Motor.*;
import gui.*;
/**
 *
 * @author kreig
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Creamos fabrica*/
        SuperFabrica f = SuperFabrica.getFabrica();
        /**Creamos casilla*/
        Casilla c1 = new Casilla();
        c1.setPosX(1);
        c1.setPosY(2);
        Casilla c2 = new Casilla();
        c2.setPosX(1);
        c2.setPosY(1);
        
        /**Creamos equipos*/
       Equipo e1 = new Equipo(new Fuego());
       Equipo e2 = new Equipo (new Agua());
       
       /**Creamos personajes*/
        Movible m1 = f.crearMovible(1, 1, 1, c1);
        Movible m2 = f.crearMovible(2,2, 2, c2);
        
        /**Agregamos personajes a equipos*/
       e1.agregar(m1);
       e2.agregar(m2);
        
       /**Estado inicial*/
        System.out.println("Personaje 1 Inicial:" + m1.toString());
        System.out.println("Personaje 2:Inicial" + m2.toString());
        
        /**Ataque*/
        m1.atacar(m2);
        m2.atacar(m1);
        
        /**Estado posterior*/
        System.out.println("Personaje 1:" + m1.toString());
        System.out.println("Personaje 2:" + m2.toString());
        
    }

}
