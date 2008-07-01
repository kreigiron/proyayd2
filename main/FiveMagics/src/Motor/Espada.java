package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1A85D69E-070E-4E4D-E869-8AD423FAA909]
// </editor-fold> 
public class Espada extends Arma {

    public Espada () {
        this.setFactorAtaque(3);
    }
    @Override
    public String toString(){
        String str = new String();
        str+= "Tipo: Espada ";        
        return str;
    }

}
 
