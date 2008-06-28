package Motor;

import java.util.ArrayList; 

import gui.*;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.37006410-E23A-3B1F-AE13-AEEA5E8917FD]
// </editor-fold> 
public class Equipo {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5DA452CE-B1BA-2B57-C531-2499752BF2BD]
    // </editor-fold> 
    private Elemento e;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B365BBFF-EC57-993A-8BFA-57EC5C99255A]
    // </editor-fold> 
    private ArrayList<Personaje> personajes;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Equipo al que pertenece el personaje
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.170AC624-C0EC-40FA-E2A4-73F1B9FBABA5]
    // </editor-fold> 
    private int color;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F0543D9-48D4-60DA-FEBE-59B4619CCA63]
    // </editor-fold> 
    public Equipo () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.71BD09BC-71FA-F3AB-A50C-D415AF84DB15]
    // </editor-fold> 
    public int getColor () {
        return color;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E4CB7A89-3F31-255E-33C4-E584FA6C2AA6]
    // </editor-fold> 
    public void setColor (int val) {
        this.color = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C07EF30-2678-C8A8-CDB0-9B39E235B814]
    // </editor-fold> 
    public Elemento getE () {
        return e;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EE820515-BA44-09B4-7DB6-D0E10AA082D0]
    // </editor-fold> 
    public void setE (Elemento val) {
        this.e = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.067954AB-BDDD-CFD9-4FA0-C55882EC7191]
    // </editor-fold> 
    public ArrayList<Personaje> getPersonajes () {
        return personajes;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3050E965-6C0E-55B1-AE7D-3AFA33D5F66B]
    // </editor-fold> 
    public void setPersonajes (ArrayList<Personaje> val) {
        this.personajes = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5BDC054D-654B-F2B6-0BDB-5454BD4F1A8E]
    // </editor-fold> 
    public void NotificarATodos () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.57D656FE-4DAB-2354-782D-4B2919CFD7BE]
    // </editor-fold> 
    public void Suscribir (Personaje p, Casilla c) {
        if(p!= null){
            p.setCasilla(c);
            this.personajes.add(p);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8334E67F-99E9-6C64-A4E2-4BEF456FA3B1]
    // </editor-fold> 
    public void Desuscribir (Personaje p, Casilla c){ 
       if(p!= null){
            p.setCasilla(c);
            this.personajes.remove(p); 
        }
    }

}

