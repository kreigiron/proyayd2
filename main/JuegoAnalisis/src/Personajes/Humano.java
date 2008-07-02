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
public class Humano extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02ACC298-9ECA-4896-2EF4-3E9BDC190E51]
    // </editor-fold> 
    
    @Override
    protected void setParameters(){
        this.setEnergia(1000);
        this.setDefensa(500);
        this.setFuerza(500);
    }
    
    public Humano () {
        super();
        setParameters();       
        dibujar();
    } 
    
    public Humano(Arma a){
        super();
        setParameters();
        this.setArma(a);
    }

    @Override
    public int getIdPersonaje() {
       return Personaje.HUMANO;
    }



    public void update() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getEstado() {
        return estado;
    }

    public void dibujar() {
        this.grafica = new Circulo(2);
    }

    @Override
    public String toString(){
        String str = super.toString();
        str+= "Raza: " + "Humano" + "\n";        
        return str;
    }


}

