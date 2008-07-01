package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.D82B643F-62CD-BE94-62B3-7A4F7D1BB12C]
// </editor-fold> 
public class Mazo extends Arma {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C7578833-3B08-91DA-B7EE-469227F32622]
    // </editor-fold> 
    public Mazo () {
        this.setFactorAtaque(2);
    }    

    @Override
    public String toString(){
        String str = new String();
        str+= " Tipo: Mazo ";        
        return str;
    }
}

