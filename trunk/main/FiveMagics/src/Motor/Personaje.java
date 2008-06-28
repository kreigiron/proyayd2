package Motor;

import gui.Casilla; 
import java.util.*; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.79C8BF81-5515-6479-5EAD-E7576071C546]
// </editor-fold> 
public abstract class Personaje implements Movible {

    static int personajes = 0;
    private int id_personaje;
    
    private Casilla casilla;
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
    private HashMap<Integer,Arma> armas = new HashMap <Integer,Arma>();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2659D86C-787B-5D15-8865-709372BC9717]
    // </editor-fold> 
    private Equipo e;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13FE09B3-0DE8-A098-2016-425293BFD434]
    // </editor-fold> 
    public Personaje () {
        this.id_personaje = personajes;
    }
    
    public Personaje (Casilla c) {
        this.casilla = c;
        this.id_personaje = personajes;
        Personaje.personajes ++;        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.818807E2-84EA-534E-A223-888012AEC094]
    // </editor-fold> 
    public HashMap<Integer,Arma> getArma () {
        return armas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8F1C937-868E-5936-FA3C-6801892370A1]
    // </editor-fold> 
    public void setArma (HashMap<Integer,Arma> val) {
        this.armas = val;
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
    // #[regen=yes,id=DCE.B1896D69-8180-52C9-6E71-32299760630D]
    // </editor-fold> 
    public void atacar (Casilla c){
        if(Math.abs(c.getPosX() - this.getCasilla().getPosX()) <= this.getArma().get(new Integer(1)).getAlcance()
                &&
                Math.abs(c.getPosY() - this.getCasilla().getPosY()) <= this.getArma().get(new Integer(1)).getAlcance()){
            c.getM().defender(this, this.getArma().get(new Integer(1)));                        
        } 
        if(Math.abs(c.getPosX() - this.getCasilla().getPosX()) <= this.getArma().get(new Integer(2)).getAlcance()
                &&
                Math.abs(c.getPosY() - this.getCasilla().getPosY()) <= this.getArma().get(new Integer(2)).getAlcance()){
            c.getM().defender(this, this.getArma().get(new Integer(2)));                        
        } 
    };

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.97790C0A-F702-17CE-1FF2-D2132931CBAE]
    // </editor-fold> 
    public void defender (Personaje p, Arma m){
      if (p.getE().getE().getAbsorbe() ==  this.getE().getE() ){            
            this.setEnergia(this.getEnergia() + (p.getFuerza()*(m.golpear(this)/100) /2));
        }
        else if(p.getE().getE().getDebil() ==  this.getE().getE()){
            this.setEnergia(this.getEnergia() - p.getFuerza()*(m.golpear(this)/100) /4);
        }
        else if(p.getE().getE().getFuerte() ==  this.getE().getE()){
            this.setEnergia(this.getEnergia() - p.getFuerza()*(m.golpear(this)/100) * 2);
        }
        else 
            this.setEnergia(this.getEnergia() - p.getFuerza()*(m.golpear(this)/100));
            
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

    public Casilla getCasilla() {
        return casilla;
    }

    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
    
    @Override
    public boolean equals(Object o){
        if (o != null){
            return (o.hashCode() == this.hashCode());
        }
        return false;
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.energia;
        hash = 59 * hash + this.fuerza;
        hash = 59 * hash + this.defensa;
        hash = 59 * hash + (this.armas != null ? this.armas.hashCode() : 0);
        hash = 59 * hash + (this.e != null ? this.e.hashCode() : 0);
        return hash;
    }
    
    public void mover(Casilla c){
        this.getE().Desuscribir(this, c);
        this.setCasilla(c);
        this.getE().Suscribir(this, c);
    }

    public void agregarArmas(Arma a1, Arma a2){
        this.armas.put(new Integer(1),a1);
        this.armas.put(new Integer(2),a2);                
    }

}

