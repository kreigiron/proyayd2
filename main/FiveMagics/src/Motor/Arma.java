package Motor;

import gui.Casilla;
import javax.swing.JButton;


/**
 *  <html>
 *    <head>
 *      
 *    </head>
 *    <body>
 *      <p style="margin-top: 0">
 *        Representa todo aquello que exista dentro del tablero y que pueda atacar 
 *        o ser atacado.
 *      </p>
 *    </body>
 *  </html>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E33659C5-9DC9-4BC1-E0A5-340A38133848]
// </editor-fold> 
public class Arma implements Movible{

    private int alcance;

    private int factorAtaque;
    
    public static final int MAZO = 1;
    public static final int ESPADA = 2;
            
    
        /**Ataca al movible especificado*/
    @Override
    public void atacar (Movible enemigo){        
        //Si el arma es mas fuerte que la defensa que tiene el arma del enemigo
        if (this.factorAtaque > enemigo.getArma().factorAtaque)
            enemigo.dañar(this.alcance);
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
    
    public void setAlcance(int alcance){
        this.alcance = alcance;
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

    public void revitalizar(int puntos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

