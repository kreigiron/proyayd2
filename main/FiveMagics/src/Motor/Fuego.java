package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.67F06992-FFC1-28BA-943B-A914C92F2992]
// </editor-fold> 
public class Fuego extends Elemento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E5AD77C3-3C8F-DC41-892F-A619C3C96B05]
    // </editor-fold> 
    public Fuego () {
        this.setFuerte(new Agua());
        this.setDebil(new Tierra());      
        this.setAbsorbe(new Fuego());
    }

     // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA25A371-E8EA-138F-C3BA-FD5178625954]
    // </editor-fold> 
    

}

