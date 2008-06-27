package gui;

import Motor.Movible; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.23A9F0DA-D4BD-D49A-B0CC-2BCEB341765A]
// </editor-fold> 
public class Casilla {

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Terreno en el que se encuentra actualmente la casilla
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D5FE6A6B-A487-A7E2-1EAD-057ABB444FDB]
    // </editor-fold> 
    private Terrento terreno;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Posicion en el eje X
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C8DFAA9-98E9-ECBA-2A3A-B22AB259CF10]
    // </editor-fold> 
    private int posX;

    /**
     *  <html>
     *    <head>
     *      
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Posicion en el eje Y
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E45C35C1-CC59-3D31-2333-7020E2B31947]
    // </editor-fold> 
    private int posY;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.27096FAF-E55F-341D-0A1B-49193FBCDBF1]
    // </editor-fold> 
    private Movible m;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4184E083-1757-8E25-B7B1-4CBFF8D1B1E5]
    // </editor-fold> 
    public Casilla () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.344294CB-5240-AC0D-1E5C-3E772E44F5DC]
    // </editor-fold> 
    public Movible getM () {
        return m;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.83D10EFE-7DA7-2F55-2ECB-30DC29BDE575]
    // </editor-fold> 
    public void setM (Movible val) {
        this.m = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.347BD857-6FC1-DD7D-901D-FEB46A13BC93]
    // </editor-fold> 
    public int getPosX () {
        return posX;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.916AACF7-2061-C5C7-CEE0-E8F8ADC5C0A9]
    // </editor-fold> 
    public void setPosX (int val) {
        this.posX = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A96166E-84DC-67B9-879F-BCEA30CD9959]
    // </editor-fold> 
    public int getPosY () {
        return posY;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52DB95AD-DC4B-215A-E7CA-99305A7F07F3]
    // </editor-fold> 
    public void setPosY (int val) {
        this.posY = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.33F830BA-2951-EBC0-F70B-64633FDFB4CC]
    // </editor-fold> 
    public Terrento getTerreno () {
        return terreno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FAA070CB-37A5-367A-51A1-526D336346D9]
    // </editor-fold> 
    public void setTerreno (Terrento val) {
        this.terreno = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D44584E3-D10F-403F-C59C-F5B5CC506280]
    // </editor-fold> 
    public void moverA (Casilla dest) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3A1C2801-A374-2CC6-7A9F-8F195936B340]
    // </editor-fold> 
    public void atacarA (Casilla dest) {
    }

}

