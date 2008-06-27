package FiveMagicsEngine;


/**
 *  <html>
 *    <head>
 *  
 *    </head>
 *    <body>
 *      <p style="margin-top: 0">
 *        Representa una casilla del juego
 *      </p>
 *    </body>
 *  </html>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.47115E8B-C951-A2EE-7A65-56A29217C754]
// </editor-fold> 
public class Casilla {

    /**
     *  <p style="margin-top: 0">
     *    Define una de las 100 casillas del escenario de juego.
     *      </p>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.37097162-4DC0-320F-07D5-6C625DD5BC2F]
    // </editor-fold> 
    private int posicionX;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3F1F7DA-B937-F1B6-454A-81DF507E7C53]
    // </editor-fold> 
    private int posicionY;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.496EE6EE-52BD-7AC6-9918-7487F785FBC6]
    // </editor-fold> 
    private Terreno terreno;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CC3944D2-E9C6-7236-8700-CD455CC69195]
    // </editor-fold> 
    private Entidad entidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4EE48157-4D31-3FF0-3BBB-360665965AA9]
    // </editor-fold> 
    public Casilla () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5D246959-3DCE-B196-3A0F-CC0314F909F1]
    // </editor-fold> 
    public Entidad getEntidad () {
        return entidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.816322CA-28EA-FD25-A55B-503D47CBDB68]
    // </editor-fold> 
    public void setEntidad (Entidad val) {
        this.entidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.76A511F7-4622-27A3-6435-1EB47307F959]
    // </editor-fold> 
    public int getPosicionX () {
        return posicionX;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A18D1E93-4EDB-6C83-01BF-AF7EDE1D6B6F]
    // </editor-fold> 
    public void setPosicionX (int val) {
        this.posicionX = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8E04591D-56AB-2A1D-E07B-EC76CC58734B]
    // </editor-fold> 
    public int getPosicionY () {
        return posicionY;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E22CCA9E-CBBF-871D-C05C-462F8503D0E7]
    // </editor-fold> 
    public void setPosicionY (int val) {
        this.posicionY = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.37325850-D2B3-2C42-60C5-A87E648A75FB]
    // </editor-fold> 
    public Terreno getTerreno () {
        return terreno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.15DFF47B-A209-9187-9A82-D8B04C9D47A1]
    // </editor-fold> 
    public void setTerreno (Terreno val) {
        this.terreno = val;
    }

}

