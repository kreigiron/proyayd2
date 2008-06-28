package Motor;

Method public java.util.ArrayList org.netbeans.modules.uml.integration.ide.events.ClassInfo.getImportedTypes() threw an exception when invoked on ClassInfo (Motor.Personaje) Modify
 Name       : Personaje
 Package    : Motor
 Modifiers  : public abstract

 --- Methods ---
(Modify) public Personaje(): 
(Modify) public getEnergia(): int
(Modify) public setEnergia(val: int): void
(Modify) public getFuerza(): int
(Modify) public setFuerza(val: int): void
(Modify) public getDefensa(): int
(Modify) public setDefensa(val: int): void
(Modify) public getArma(): ArrayList<Arma>
(Modify) public setArma(val: java.util.ArrayList): void
(Modify) public mover(casilla: int): void
(Modify) public atacar(c: gui.Casilla): void
(Modify) public defender(): void
(Modify) public getE(): Equipo
(Modify) public setE(val: Motor.Equipo): void
(Modify) public notificar(): void

 --- Fields ---
private int energia
private int fuerza
private int defensa
private Arma[] arma
private Equipo e

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.79C8BF81-5515-6479-5EAD-E7576071C546]
// </editor-fold> 
public abstract class Personaje implements Movible {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C179991B-4CAA-3748-40D3-8FBDB39C3860]
    // </editor-fold> 
    private int energia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D321ECDF-96A9-945D-C6DB-1E989C736CC3]
    // </editor-fold> 
    private int fuerza;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.584A82B3-E46F-61A2-C158-50F8F4B6EC46]
    // </editor-fold> 
    private int defensa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C784E8B4-A791-6DEE-5BC8-7C787795874F]
    // </editor-fold> 
    private ArrayList<Arma> arma;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2659D86C-787B-5D15-8865-709372BC9717]
    // </editor-fold> 
    private Equipo e;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13FE09B3-0DE8-A098-2016-425293BFD434]
    // </editor-fold> 
    public Personaje () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.818807E2-84EA-534E-A223-888012AEC094]
    // </editor-fold> 
    public ArrayList<Arma> getArma () {
        return arma;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8F1C937-868E-5936-FA3C-6801892370A1]
    // </editor-fold> 
    public void setArma (ArrayList<Arma> val) {
        this.arma = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0AB46AB1-0B44-E1A2-C893-DEB6D4C48ED9]
    // </editor-fold> 
    public int getDefensa () {
        return defensa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6016B755-3848-4CA2-9C67-667E4D840813]
    // </editor-fold> 
    public void setDefensa (int val) {
        this.defensa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B3B837C9-88AD-32CF-13C1-F479EEDCD9B0]
    // </editor-fold> 
    public int getEnergia () {
        return energia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C91ADB39-C42A-DC60-2695-DD064D47B897]
    // </editor-fold> 
    public void setEnergia (int val) {
        this.energia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5728531A-ABAD-6E48-7DF0-0A99557A6A8B]
    // </editor-fold> 
    public int getFuerza () {
        return fuerza;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06C8CEEA-07CC-5D36-B4F1-D2D18099B1A0]
    // </editor-fold> 
    public void setFuerza (int val) {
        this.fuerza = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8D097986-0804-6326-7E21-57A68C42C92E]
    // </editor-fold> 
    public void mover (Method public java.lang.String org.netbeans.modules.uml.integration.ide.events.MethodParameterInfo.getCodeGenType() threw an exception when invoked on org.netbeans.modules.uml.integration.ide.events.MethodParameterInfo@36a2b2 casilla) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B1896D69-8180-52C9-6E71-32299760630D]
    // </editor-fold> 
    public void atacar (Casilla c) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97790C0A-F702-17CE-1FF2-D2132931CBAE]
    // </editor-fold> 
    public void defender () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C86E7A61-4958-6481-415F-826ED4AC3E19]
    // </editor-fold> 
    public Equipo getE () {
        return e;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.289CCB6F-1CBA-EBE6-8231-01CE45062EE5]
    // </editor-fold> 
    public void setE (Equipo val) {
        this.e = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.FD819CC1-4606-8E29-3BA1-009371D21511]
    // </editor-fold> 
    public void notificar () {
    }

}

