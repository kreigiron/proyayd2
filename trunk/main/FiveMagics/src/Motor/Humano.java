package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.664CB10D-2AA5-AB22-411F-D83B5B0AFA1C]
// </editor-fold> 
public class Humano extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02ACC298-9ECA-4896-2EF4-3E9BDC190E51]
    // </editor-fold> 
    public Humano () {
        super();
        this.setEnergia(1000);
        this.setDefensa(500);
        this.setFuerza(500);
        Arma a1 = new Espada();
        Arma a2 = new Espada();
        this.agregarArmas(a1,a2);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.30978ED2-4E89-ED94-B3C2-37D80E5604DD]
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6A08352B-05A7-CF42-F03D-D3FE86F88F2A]
    // </editor-fold> 
    public void defender (Personaje p, Arma m) {
        super.defender(p, m);
    }
    


}

