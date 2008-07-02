/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Personajes;

import Elementos.*;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Equipo {
    private Elemento elemento;

    private ArrayList<Personaje> personajes;

    private int color;

    public Equipo () {
    }

    
    public int getColor () {
        return color;
    }

    
    public void setColor (int val) {
        this.color = val;
    }

    public Elemento getElemento () {
        return elemento;
    }

    public void setElemento (Elemento val) {
        this.elemento = val;
    }

    public ArrayList<Personaje> getPersonajes () {
        return personajes;
    }

    public void setPersonajes (ArrayList<Personaje> val) {
        this.personajes = val;
    }

   
//    public void NotificarATodos () {
//    }
//
//    public void Suscribir (Personaje p, Casilla c) {
//        if(p!= null){
//            this.personajes.add(p);
//        }
//        
//    }
//
//    public void Desuscribir (Personaje p, Casilla c){ 
//       if(p!= null){
//            this.personajes.remove(p); 
//        }
//    }
}
