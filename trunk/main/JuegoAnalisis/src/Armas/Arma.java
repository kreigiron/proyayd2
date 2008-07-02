/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Armas;

import Elementos.*;
import Personajes.Equipo;
import Terrenos.Casilla;
import javax.swing.JButton;

/**
 *
 * @author Administrador
 */
public class Arma implements Movible{
    
        private int alcance;

    private int factorAtaque;
    
    public static final int MAZO = 1;
    public static final int ESPADA = 2;
    public static final int ARCO = 3;
            
    
        /**Ataca al movible especificado*/
    @Override
    public void atacar (Movible enemigo){        
        enemigo.dañar(enemigo.getDefensa()/getFactorAtaque());        
    }

    /**Recibe puntos de daño*/
    public void dañar (int puntos){        
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**Actualiza su estado dentro del topico en el que esté*/
    public void update(){    
    }
    
    /**Obtiene el equipo al que pertenece el movible actual*/
    public Equipo getEquipo(){
        return null;
    }
    
    /**Asigna equipo al movible*/
    public void setEquipo(Equipo e){        
    }
    
    /**Obtiene el estado del movible actual*/
    public int getEstado(){
        return -1;
    }
    
    /**Devuelve representacion grafica si se tiene*/
    public void dibujar(){        
    }

    public int getDefensa() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getFactorAtaque() {
        return factorAtaque;
    }

    public void setFactorAtaque(int factorAtaque) {
        this.factorAtaque = factorAtaque;
    }

    public JButton getButton() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Arma getArma() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setArma(Arma arma) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString(){
        String str = super.toString();
        str+= "(Alcance: " + this.alcance+ ",";        
        str+= "Factor: " + this.factorAtaque+ ")";     
        return str;
    }
    
    @Override
    public void setCasilla(Casilla c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public Casilla getCasilla() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
