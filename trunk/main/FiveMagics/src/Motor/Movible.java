package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ADB19E0A-C336-08FA-5675-79D10E141A11]
// </editor-fold> 
public interface Movible {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15AC503A-EBCA-2C27-32D3-3DCDC6FA7F79]
    // </editor-fold> 
    public void mover (Casilla casilla);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EE12AF3-ED03-1FB2-C47A-AD5B3E5355C9]
    // </editor-fold> 
    public void atacar (Casilla c);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2A342FB7-C041-F2C0-7BEE-F1395810904A]
    // </editor-fold> 
    public void defender ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B75E10A7-481B-FBB5-5B08-9C798DCC2516]
    // </editor-fold> 
    public void notificar ();

}

