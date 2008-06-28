package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CE4927AE-A993-E496-B41A-6C8E6880AF6F]
// </editor-fold> 
public class Tierra extends Elemento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ACF873E3-A3E2-FB9B-578F-254DFECAC4B1]
    // </editor-fold> 
    public Tierra () {
        this.setFuerte(new Fuego());
        this.setDebil(new Agua());      
        this.setAbsorbe(new Tierra());
    }

 
}

