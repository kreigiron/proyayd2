package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.0A12307F-6D39-CC17-7BF8-3FEC09EE3E34]
// </editor-fold> 
public class Agua extends Elemento {

    public Agua () {
        
    }
    
    public Agua(Arma m){
        super(m);
    }

    @Override
    public int fuerteAnte() {
        return Elemento.FUEGO;
    }

    @Override
    public int getElemId() {
        return Elemento.AGUA;
    }

    @Override
    public int debilAnte() {
        return Elemento.TIERRA;        
    }
    
    
    
 

}

