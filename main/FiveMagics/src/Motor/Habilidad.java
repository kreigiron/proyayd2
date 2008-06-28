package Motor;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CAE0DC72-2F3C-8233-7443-AAE075D86640]
// </editor-fold> 
public abstract class Habilidad extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FF563FEC-1F70-7675-D698-C0008364C2CD]
    // </editor-fold> 
    protected Personaje p;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C36D31F6-62A7-6E41-7793-77926E6A8907]
    // </editor-fold> 
    public Habilidad () {
    }

    public Habilidad (Personaje pp) {
        this.p = pp;
    }
        
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B09490D-99A4-055D-E95B-A49DAA1DB39D]
    // </editor-fold> 
    public Personaje getP () {
        return p;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A30AED98-2A8B-416B-F8F7-C07EB29E3CE1]
    // </editor-fold> 
    public void setP (Personaje val) {
        this.p = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BCC350FA-AA62-0835-076F-4F9969E8530E]
    // </editor-fold> 
    public abstract void atacar (Casilla c) ;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.78667E26-CDFA-07B6-A345-D2F81122A9DC]
    // </editor-fold> 
    public abstract void defender (Personaje p, Arma m) ;

}

