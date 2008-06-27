package Motor;

import java.util.ArrayList;

import gui.Casilla; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.79C8BF81-5515-6479-5EAD-E7576071C546]
// </editor-fold> 
public class Personaje implements Movible {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.88D45964-EB9B-73C1-D1A3-1B94830D9BFB]
    // </editor-fold> 
    private int Energia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E9E494DA-0C2A-FFEC-9264-971315A6A4D0]
    // </editor-fold> 
    private int Fuerza;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.23037C13-25A3-144A-A7A8-DDB5A6B2AD95]
    // </editor-fold> 
    private int Defensa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C4BE983-7CDC-1E8C-75F4-181D4986AE99]
    // </editor-fold> 
    private ArrayList<Arma> arma;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A1247D16-9324-B59E-E423-269313E8366F]
    // </editor-fold> 
    private Equipo equipo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.13FE09B3-0DE8-A098-2016-425293BFD434]
    // </editor-fold> 
    public Personaje () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8182DB74-9F2E-EB24-35E2-B5B8B0E8D1CC]
    // </editor-fold> 
    public int getDefensa () {
        return Defensa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D635A5EE-7FC9-BC6B-EB01-5C59FE356300]
    // </editor-fold> 
    public void setDefensa (int val) {
        this.Defensa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.149176DA-89E4-1500-C4B0-7776CBB61D3D]
    // </editor-fold> 
    public int getEnergia () {
        return Energia;
    }

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Representa a un personaje
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7C5A842C-0A7A-4AD7-5FE9-36AB9568E2F8]
    // </editor-fold> 
    public void setEnergia (int val) {
        this.Energia = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2B39BC8B-9CCA-37BF-A8FB-BC2A42ECC902]
    // </editor-fold> 
    public int getFuerza () {
        return Fuerza;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.610D271A-F97B-F3A2-BEE9-AADB8FDC30C8]
    // </editor-fold> 
    public void setFuerza (int val) {
        this.Fuerza = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FF562865-48B7-BC05-0845-A07DDBBDCA81]
    // </editor-fold> 
    public ArrayList<Arma> getArma () {
        return arma;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A7DFAC5E-A446-796F-6172-C5FB510ED950]
    // </editor-fold> 
    public void setArma (ArrayList<Arma> val) {
        this.arma = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B4C729F6-7932-8269-E5A2-F8DF7A1D86A1]
    // </editor-fold> 
    public abstract void atacar ();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C306B2D3-6459-21CC-E6D2-3DA54B740C3A]
    // </editor-fold> 
    public Equipo getEquipo () {
        return equipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.334F9E2C-CB08-F450-6CAA-EBF122C36B08]
    // </editor-fold> 
    public void setEquipo (Equipo val) {
        this.equipo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2487F49B-E716-B1B5-843E-4427EFFF2EE3]
    // </editor-fold> 
    public void defender () 

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5EFB5DB8-C33B-8740-5521-8997A124A987]
    // </editor-fold> 
    public void mover (Casilla destino) {
    }

}

