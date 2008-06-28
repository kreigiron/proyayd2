package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0A12307F-6D39-CC17-7BF8-3FEC09EE3E34]
// </editor-fold> 
public class Agua extends Elemento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.92E7346C-BF24-B3DB-4B69-4B0574A97DDF]
    // </editor-fold> 
    public Agua () {
        this.setFuerte(new Tierra());
        this.setDebil(new Fuego());      
        this.setAbsorbe(new Agua());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A328697E-89A0-B375-DDCA-384ECB77CB65]
    // </editor-fold> 
 

}

