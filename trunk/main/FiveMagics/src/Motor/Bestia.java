package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.319353B9-26FD-7A22-6EEB-C9D2947B39A9]
// </editor-fold> 
public class Bestia extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D14F3E18-3414-B99F-EBD6-405FA8B63AAC]
    // </editor-fold> 
    public Bestia () {
        this.setEnergia(500);
        this.setDefensa(1000);
        this.setFuerza(1000);      
        Arma a1 = new Mazo();
        Arma a2 = new Mazo();
        this.agregarArmas(a1,a2);
    }

}

