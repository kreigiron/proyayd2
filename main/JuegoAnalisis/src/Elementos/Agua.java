/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Elementos;

import Armas.*;

/**
 *
 * @author Administrador
 */
public class Agua extends Elemento {

    public Agua () {
        
    }
    
    public Agua(Arma m){
        super(m);
    }

    @Override
    public int fuerteAnte() {
        return Elemento.FUEGO;
    }

    @Override
    public int getElemId() {
        return Elemento.AGUA;
    }

    @Override
    public int debilAnte() {
        return Elemento.TIERRA;        
    }
    
    @Override
    public String toString(){
        String str;
        if(this.getArma() != null){
            str = this.getArma().toString();
        }
        else
            str= super.toString();
        str+= " Elemento: Agua ";        
        return str;
    }

}

