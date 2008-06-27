package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E6A2BA8F-016E-4977-61E6-0C9BC6AB7BC4]
// </editor-fold> 
public abstract class Elemento extends Arma {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8DB0087D-9529-DEA6-89FA-33D5312AF07A]
    // </editor-fold> 
    private Arma e;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Elemento al que el elemento actual es fuerte, y por lo tanto hace mas 
     *        da&#241;o
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2D1E8117-6210-D049-3ACA-0BAB027FF049]
    // </editor-fold> 
    private Elemento fuerte;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Elemento al que el elemento actual es debil, por lo tanto produce menos 
     *        da&#241;o
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6EA9771A-FDF5-8C13-E95C-37D6B3BC9A94]
    // </editor-fold> 
    private Elemento debil;

    /**
     *  <html>
     *    <head>
     *  
     *    </head>
     *    <body>
     *      <p style="margin-top: 0">
     *        Elemento al que el cual el elemento actual absorbe, por lo tanto 
     *        recupera energia
     *      </p>
     *    </body>
     *  </html>
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.57B5C9D4-9027-0555-07D0-4CAB108C1371]
    // </editor-fold> 
    private Elemento absorbe;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E5CF200D-1BFB-42D4-4556-403FE14D4678]
    // </editor-fold> 
    public Elemento () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1F84CC91-5C64-F539-7BBE-ACC8BD3232FB]
    // </editor-fold> 
    public Elemento getAbsorbe () {
        return absorbe;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.60472568-EC72-B159-AAB5-BADABD589A2E]
    // </editor-fold> 
    public void setAbsorbe (Elemento val) {
        this.absorbe = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4387F15C-EE45-3D25-8EAD-259D3BF1535A]
    // </editor-fold> 
    public Elemento getDebil () {
        return debil;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.60FC6082-C217-EA4F-ED14-06334CD47D1F]
    // </editor-fold> 
    public void setDebil (Elemento val) {
        this.debil = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7335BB45-9895-AB15-A4F5-3C475B3FD1FB]
    // </editor-fold> 
    public Arma getE () {
        return e;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.19BB5308-AF7B-224F-CF80-721651D8F9F4]
    // </editor-fold> 
    public void setE (Arma val) {
        this.e = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.68D04A7D-34B2-B9D7-76DD-AB511A4E1346]
    // </editor-fold> 
    public Elemento getFuerte () {
        return fuerte;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4C40473A-FE63-132E-70FA-CCDD0B9DCB73]
    // </editor-fold> 
    public void setFuerte (Elemento val) {
        this.fuerte = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CAC5C1D5-7DAD-38FE-0DDD-63B3373D1280]
    // </editor-fold> 
    public int getAlcance () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9A2D67EB-3C86-F4D2-C000-579F3BCA9148]
    // </editor-fold> 
    public void setAlcance (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8103123B-8708-69D0-3654-7E1D06DC5DF2]
    // </editor-fold> 
    public int getDireccion () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.696C055F-07A6-19EF-1779-519227E76F77]
    // </editor-fold> 
    public void setDireccion (int val) {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.74912CD9-2E68-A434-ED61-4B920F84190B]
    // </editor-fold> 
    public abstract void atacar ();{
    }

}

