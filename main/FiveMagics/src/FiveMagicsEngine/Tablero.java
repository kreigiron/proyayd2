package FiveMagicsEngine;


/**
 *  <html>
 *    <head>
 *  
 *    </head>
 *    <body>
 *      <p style="margin-top: 0">
 *        Representa el tablero principal
 *      </p>
 *    </body>
 *  </html>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.658A972F-06C4-6091-B6D3-40A97420A423]
// </editor-fold> 
public class Tablero implements Dibujable, Insertor {

    /**
     *  <p style="margin-top: 0">
     *    Tablero principal
     *      </p>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E65D88B2-C70E-73E2-0349-032896F0562F]
    // </editor-fold> 
    private Hashmap Casillas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C630036F-424F-4923-D0C8-3C49D6AC852A]
    // </editor-fold> 
    private Hashmap entidades;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F3D960F9-EA97-F1BD-9FD8-733EB103D168]
    // </editor-fold> 
    public Tablero () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EAA0281-591B-9C66-75FF-6B3EB2F96C90]
    // </editor-fold> 
    public Hashmap getCasillas () {
        return Casillas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8862D685-7AAE-841D-ACF9-CF3EFBDED9BB]
    // </editor-fold> 
    public void setCasillas (Hashmap val) {
        this.Casillas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9738C65E-FE48-79FD-AE3D-9F793FECFD04]
    // </editor-fold> 
    public Hashmap getEntidades () {
        return entidades;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CB05FD07-9AF1-3FBF-4FD6-466183E1F96C]
    // </editor-fold> 
    public void setEntidades (Hashmap val) {
        this.entidades = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.26BAACEE-4767-E13C-13B1-7109F7E36537]
    // </editor-fold> 
    public void dibujar () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D22F1EAD-8FC6-F004-7E33-B3B212094FC5]
    // </editor-fold> 
    public void agregarOyente (Entidad e) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DBAA29DF-6C99-6CFD-AFAA-302F88AABF41]
    // </editor-fold> 
    public void quitarOyente (Entidad e) {
    }

}

