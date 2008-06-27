package Motor;


/**
 *  <html>
 *    <head>
 *  
 *    </head>
 *    <body>
 *      <p style="margin-top: 0">
 *        Agrega habilidades a los personajes
 *      </p>
 *    </body>
 *  </html>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CAE0DC72-2F3C-8233-7443-AAE075D86640]
// </editor-fold> 
public class Habilidad extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3293D75B-A4D8-7631-0E78-633F03094578]
    // </editor-fold> 
    private Personaje p;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D10691B1-92A7-E266-F1D5-A72B6B44DC04]
    // </editor-fold> 
    public Habilidad () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2C52B562-F8FE-1D22-1216-9A392918B081]
    // </editor-fold> 
    public Personaje getP () {
        return p;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.63BBFB5C-0FCA-23DF-FE78-DB9B6057E986]
    // </editor-fold> 
    public void setP (Personaje val) {
        this.p = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15912DB0-897F-61AA-C148-7BE9FC4E3AB8]
    // </editor-fold> 
    public abstract void atacar ();

}

