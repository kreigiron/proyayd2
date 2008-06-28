package Motor;

Method public java.util.ArrayList org.netbeans.modules.uml.integration.ide.events.ClassInfo.getImportedTypes() threw an exception when invoked on ClassInfo (Motor.Habilidad) Modify
 Name       : Habilidad
 Package    : Motor
 Modifiers  : public abstract
 Superclass : <none> -> Motor.Personaje
 --- Methods ---
(Modify) public Habilidad(): 
(Modify) public getP(): Personaje
(Modify) public setP(val: Motor.Personaje): void
(Modify) public mover(casilla: int): void
(Modify) public atacar(c: gui.Casilla): void
(Modify) public defender(): void

 --- Fields ---
protected Personaje p

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
    // #[regen=yes,id=DCE.96B37C55-8041-8749-0562-E227455A9FDE]
    // </editor-fold> 
    public void mover (Method public java.lang.String org.netbeans.modules.uml.integration.ide.events.MethodParameterInfo.getCodeGenType() threw an exception when invoked on org.netbeans.modules.uml.integration.ide.events.MethodParameterInfo@6c69a1 casilla) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BCC350FA-AA62-0835-076F-4F9969E8530E]
    // </editor-fold> 
    public void atacar (Casilla c) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.78667E26-CDFA-07B6-A345-D2F81122A9DC]
    // </editor-fold> 
    public void defender () {
    }

}

