/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Armas;

import Personajes.*;
import Terrenos.*;

/**
 *
 * @author Administrador
 */

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ADB19E0A-C336-08FA-5675-79D10E141A11]
// </editor-fold> 
public interface Movible {

    /**Cambia de casilla*/
//    public void mover (Casilla casilla);

    /**Ataca al movible especificado*/
    public void atacar (Movible enemigo);

    /**Recibe puntos de daño*/
    public void dañar (int puntos);

    /**Actualiza su estado dentro del topico en el que esté*/
    public void update();
    
    /**Obtiene el equipo al que pertenece el movible actual*/
    public Equipo getEquipo();
    
    /**Asigna equipo al movible*/
    public void setEquipo(Equipo e);
    
    /**Obtiene el estado del movible actual*/
    public int getEstado();
    
    /**arma la representacion grafica si se tiene*/
    public void dibujar();
    
    public int getDefensa();    
    
    /**Devuelve el jpanel que contiene el dibujo del personaje */
    public javax.swing.JButton getButton();
    
    /**Devuelve el arma de este movible*/
    public Arma getArma();

    /**Asigna arma de este movible*/
    public void setArma(Arma arma);
    
    /**Asigna nueva casilla al movible*/
    public void setCasilla(Casilla c);
    
    /**Devuelve la casilla actual*/
    public Casilla getCasilla();
}

