package Motor;

import gui.Casilla; 

/**@deprecated*/
public class Mago extends Habilidad {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4BDA2B88-6F7A-EA29-0C7B-91C6C4AE3665]
    // </editor-fold> 
    public Mago () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0D68540E-F8CD-B8F4-ABAB-F12FFCDFBF3F]
    // </editor-fold> 
    public void atacar (Casilla c) {
      // 'p.atacar(c);
//        c.getM().defender(this, this.getArma().get(new Integer(1)));
        
    }
      

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0A279B9-D6BF-9797-7DF0-131CC92C6806]
    // </editor-fold> 
    public void defender (Personaje p, Arma m){ 
        
    }

    @Override
    public int getIdPersonaje() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected void setParameters() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getEstado() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void dibujar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

