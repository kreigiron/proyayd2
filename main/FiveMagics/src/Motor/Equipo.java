package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F2D7DB3D-1033-E6D3-2FB5-D3E3B45058B0]
// </editor-fold> 
public class Equipo {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F72F9EC1-A594-8CF1-7592-108031914319]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C0E29447-D1BF-524E-AB1D-7D439219AE75]
    // </editor-fold> 
    private int color;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Representa el equipo al que pertenecen los personajes
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.52211434-9845-3E07-77A9-36FDAA58F576]
    // </editor-fold> 
    private Elemento elemento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B34CC4C6-6E98-AD78-1F20-9DC792DBC1D4]
    // </editor-fold> 
    public Equipo () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.17F54B0B-6BE8-D873-BA3D-E474159D6368]
    // </editor-fold> 
    public int getColor () {
        return color;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6BABAB47-0F5F-2856-7DC1-C41F68D825D1]
    // </editor-fold> 
    public void setColor (int val) {
        this.color = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1BFDB894-E20D-DB47-415C-59EDDC178D3C]
    // </editor-fold> 
    public Elemento getElemento () {
        return elemento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.3E795CBF-A14A-F525-BC0C-585B5B1C88BE]
    // </editor-fold> 
    public void setElemento (Elemento val) {
        this.elemento = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BB4B0155-F53E-1339-B17C-B9E1D4313B99]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F9D22EDD-7E64-72AF-32AC-1B4D46881214]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

}

