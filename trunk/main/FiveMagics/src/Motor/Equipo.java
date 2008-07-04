package Motor;

import java.util.ArrayList; 

import gui.*;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.37006410-E23A-3B1F-AE13-AEEA5E8917FD]
// </editor-fold> 
public class Equipo {

    private Elemento elemento;

    private ArrayList<Movible> personajes = new ArrayList<Movible>();

    private int color = 0;

    public Equipo () {
    }

    public Equipo (Elemento e) {
        elemento = e;
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

    public ArrayList<Movible> getPersonajes () {
        return personajes;
    }

    public void setPersonajes (ArrayList<Movible> val) {
        this.personajes = val;
    }

    public String toString(){
        return "equipo" + color;
    }
    
   
//    public void NotificarATodos () {
//    }
//
    /**Agrega un personaje a un equipo*/
    public void agregar (Movible p) {
        if(p!= null){
            p.setEquipo(this);
               this.personajes.add(p);
        }
                 
    }
 /** Quita un personaje del equipo*/
    public void quitar (Movible p){ 
       if(p!= null){
            this.personajes.remove(p); 
            p.setEquipo(null);
        }
    }
}

