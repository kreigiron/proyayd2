package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6182C211-5614-7920-CBDC-A848A411F650]
// </editor-fold> 
/**@deprecated*/
public class Bruto extends Habilidad {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.79B56921-BBBE-2677-9992-1A3E864717E1]
    // </editor-fold> 
    public Bruto () {
    }

    public void mover(Casilla c){
        
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7BB833E8-F6A1-04E8-5C79-1454A17B55D3]
    // </editor-fold> 
    public void atacar (Casilla c) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D237C6C1-8502-799C-20C9-8E7F2CB34597]
    // </editor-fold> 
    public void defender () {
    }

    @Override
    public void defender(Personaje p, Arma m) {
        throw new UnsupportedOperationException("Not supported yet.");
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

