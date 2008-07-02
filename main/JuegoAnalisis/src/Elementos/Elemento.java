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
public abstract class Elemento extends Arma {

   
    
    public static final int FUEGO = 1;
    public static final int AGUA = 2;
     public static final int TIERRA = 3;
    public static final int VIENTO = 4;
        
    
    private Arma arma;

    public Elemento () {
    }  
    
    public Elemento (Arma m) {
        arma = m;
    }
    
    /**id Elemento contrario sobre el cual se hace mas daño*/
    public abstract int fuerteAnte();
    
    /**id Elemento contrario sobre el cual se recibe mas daño*/
    public abstract int debilAnte();
    
    /**Identificador del elemento*/
    public abstract int getElemId();
    
    @Override
    public void atacar (Movible enemigo){        
        // si el elemento es fuerte ante el elemento del equipo del enemigo, se hace el doble de daño
        if(this.fuerteAnte() == enemigo.getEquipo().getElemento().getElemId()){            
            enemigo.dañar((enemigo.getDefensa()/arma.getFactorAtaque())*2);        
        }
        // si el elemento es debil ante el elemento del equipo del enemigo, se hace la mitdad de daño
        else if(this.debilAnte() == enemigo.getEquipo().getElemento().getElemId()){
            enemigo.dañar((enemigo.getDefensa()/arma.getFactorAtaque())/2);        
        }
        // sino, solamente hace daño normal
        else
            enemigo.dañar((enemigo.getDefensa()/arma.getFactorAtaque()));        
    }
}

