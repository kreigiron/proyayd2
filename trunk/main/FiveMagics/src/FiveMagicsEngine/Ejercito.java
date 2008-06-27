package FiveMagicsEngine;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.06C701AE-414C-D415-BD01-55FFE040B73E]
// </editor-fold> 
public class Ejercito {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.33CC6C87-3534-DC57-F105-21688E529FC8]
    // </editor-fold> 
    private int Nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.74A1D873-C126-7717-383D-ED517E98D263]
    // </editor-fold> 
    private Elemento healWith;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5F53C82C-A19E-B6E7-DFCA-6FBA5DCE2086]
    // </editor-fold> 
    private Elemento drawWith;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.15EE5043-F8A8-A6CB-2C37-B8F6135441CC]
    // </editor-fold> 
    private Elemento mortalWith;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.60279297-0D22-D67B-1DC2-BCF832A7EA02]
    // </editor-fold> 
    public Ejercito () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.660FCC09-4111-CE61-A76E-0C644A581CF3]
    // </editor-fold> 
    public int getNombre () {
        return Nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.847F861D-F127-1FE9-58E3-B9866B2BBA9E]
    // </editor-fold> 
    public void setNombre (int val) {
        this.Nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.085AC98B-8675-8865-5E61-90C91438C659]
    // </editor-fold> 
    public Elemento getDrawWith () {
        return drawWith;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C5E89027-88B6-496D-3C66-DD23F084519D]
    // </editor-fold> 
    public void setDrawWith (Elemento val) {
        this.drawWith = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A932C9D-309B-63FF-B618-DDA5B02DA0C7]
    // </editor-fold> 
    public Elemento getHealWith () {
        return healWith;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC1F1A3B-C13C-F093-4705-6427DFF6D1CD]
    // </editor-fold> 
    public void setHealWith (Elemento val) {
        this.healWith = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B27504B1-9212-A365-3CBB-2806AE34EB4E]
    // </editor-fold> 
    public Elemento getMortalWith () {
        return mortalWith;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8A36F595-F99A-96C6-9730-2CBC3E39C34C]
    // </editor-fold> 
    public void setMortalWith (Elemento val) {
        this.mortalWith = val;
    }

}

