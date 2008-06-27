package FiveMagicsEngine;


/**
 *  <p style="margin-top: 0">
 *    Define un elemento que decora a la entidad
 *      </p>
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CA87AAF1-6D87-111F-9E08-274E95BE7583]
// </editor-fold> 
public class Elemento extends Entidad {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.966A5A30-2145-A9BA-AFF6-2D15B3D4C90A]
    // </editor-fold> 
    private Elemento debil;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2DE011D0-6785-BE8C-2922-A0B7FB611C56]
    // </editor-fold> 
    private Elemento fuerte;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3FD84FD6-8F98-C34A-0FC0-CDB647E1C3A2]
    // </editor-fold> 
    private Elemento normal;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AD90EC72-C635-F145-8DF8-F5901BD2048F]
    // </editor-fold> 
    private Entidad entidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.223814C8-A038-7DF9-3A39-04BD1975F70B]
    // </editor-fold> 
    public Elemento getDebil () {
        return debil;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.16034BA8-7B2B-1B40-3278-81B0DE89DE51]
    // </editor-fold> 
    public void setDebil (Elemento val) {
        this.debil = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B3AE30FE-8DA4-8B8D-BCD7-0ECD1B3874C3]
    // </editor-fold> 
    public Entidad getEntidad () {
        return entidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F595519B-881A-B360-8AEE-5E56C8CD31D7]
    // </editor-fold> 
    public void setEntidad (Entidad val) {
        this.entidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C46E9407-BCC7-2048-EAA6-2A6E7F783AB3]
    // </editor-fold> 
    public Elemento getFuerte () {
        return fuerte;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7CCF913A-B33C-7CD4-765A-84E846FBB07D]
    // </editor-fold> 
    public void setFuerte (Elemento val) {
        this.fuerte = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C6A6A93C-483A-1040-706A-5131846CCCF1]
    // </editor-fold> 
    public Elemento getNormal () {
        return normal;
    }

}

