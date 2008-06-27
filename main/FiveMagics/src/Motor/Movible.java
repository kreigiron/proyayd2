package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ADB19E0A-C336-08FA-5675-79D10E141A11]
// </editor-fold> 
public interface Movible {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15AC503A-EBCA-2C27-32D3-3DCDC6FA7F79]
    // </editor-fold> 
    public void mover (Casilla destino);

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6E6E987F-48C5-C50E-8C92-812FF3DF4FD8]
    // </editor-fold> 
    public void atacar ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8F43ED5C-8CE4-5CEC-39C0-B34E88A3A2BA]
    // </editor-fold> 
    public void defender ();

}

