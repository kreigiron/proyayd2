package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.67F06992-FFC1-28BA-943B-A914C92F2992]
// </editor-fold> 
public class Fuego extends Elemento {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E5AD77C3-3C8F-DC41-892F-A619C3C96B05]
    // </editor-fold>
    
    private static final int elemId=2;
    
    
    public Fuego () {        
    }
    
    public Fuego(Arma m){
        super(m);
    }
    
    @Override
    public void atacar(Movible m){
            
    }

    @Override
    public int fuerteAnte() {
      return Elemento.VIENTO;
    }

    
    
    @Override
    public int getElemId() {
        return Elemento.FUEGO;
    }

    @Override
    public int debilAnte() {
        return Elemento.AGUA;
    }
    
}

