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
public class Tierra extends Elemento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ACF873E3-A3E2-FB9B-578F-254DFECAC4B1]
    // </editor-fold> 
    
   
    private static final int elemId=3;
    
   
    public Tierra(){
    }
    
    public Tierra(Arma m){
          super(m);
    }

    @Override
    public int fuerteAnte() {
        return Elemento.AGUA;
    }

    @Override
    public int debilAnte() {
        return Elemento.VIENTO;
    }

    @Override
    public int getElemId() {
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

