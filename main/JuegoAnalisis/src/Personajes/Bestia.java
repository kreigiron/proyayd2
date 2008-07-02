/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Personajes;

import Armas.*;
import Terrenos.*;

/**
 *
 * @author Administrador
 */
public class Bestia extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D14F3E18-3414-B99F-EBD6-405FA8B63AAC]
    // </editor-fold> 
    public Bestia () {
        setParameters();
    }
    
    @Override
    protected void setParameters(){
        this.setEnergia(500);
        this.setDefensa(1000);
        this.setFuerza(1000);      
        
    }
    public Bestia(Arma a){
        setParameters();
        this.setArma(a);
    }

    @Override
    public int getIdPersonaje() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public int getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void dibujar() {
        this.grafica = new Circulo(1);
    }

    public String toString(){
        String str = super.toString();
        str+= "Raza: " + "Bestia" + "\n";        
        return str;
    }

}


