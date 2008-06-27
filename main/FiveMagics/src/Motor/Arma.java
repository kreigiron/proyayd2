package Motor;


/**
 *  <html>
 *    <head>
 *      
 *    </head>
 *    <body>
 *      <p style="margin-top: 0">
 *        Representa todo aquello que exista dentro del tablero y que pueda atacar 
 *        o ser atacado.
 *      </p>
 *    </body>
 *  </html>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E33659C5-9DC9-4BC1-E0A5-340A38133848]
// </editor-fold> 
public abstract class Arma {

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        especifica el alcance del ataque
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.386A5D68-1BB2-9215-8257-140230141329]
    // </editor-fold> 
    private int alcance;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Especifica la direccion
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1E29160C-B657-87FC-FC32-0CF0D3B9FE66]
    // </editor-fold> 
    private int direccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E54E97D1-CA11-EE39-30A1-11DE4A5DBA20]
    // </editor-fold> 
    public Arma () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.41DE2292-9C76-8127-AD0C-2C477D8B7ED0]
    // </editor-fold> 
    public int getAlcance () {
        return alcance;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D6862903-5AE1-B5FA-A232-04E5B2E87EA9]
    // </editor-fold> 
    public void setAlcance (int val) {
        this.alcance = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.172D9666-25C0-FD99-152B-3374A91F7CD9]
    // </editor-fold> 
    public int getDireccion () {
        return direccion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BDC8A59A-DEA9-4A61-74EF-41780CF5196D]
    // </editor-fold> 
    public void setDireccion (int val) {
        this.direccion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B35B8BE1-F9F8-E536-F791-0549A72F1B20]
    // </editor-fold> 
    public void atacar () {
    }

}

