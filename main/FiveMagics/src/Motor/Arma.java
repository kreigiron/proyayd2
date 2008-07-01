package Motor;

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
}

