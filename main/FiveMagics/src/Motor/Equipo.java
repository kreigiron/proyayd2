package Motor;

import java.util.ArrayList; 

import gui.*;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.37006410-E23A-3B1F-AE13-AEEA5E8917FD]
// </editor-fold> 
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

    public String toString(){
        return "equipo" + color;
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

