package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1A85D69E-070E-4E4D-E869-8AD423FAA909]
// </editor-fold> 
public class Espada extends Arma {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0145D6BA-4060-D267-261A-D0F61C627501]
    // </editor-fold> 
    public Espada () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3ECC8B8E-E3C5-6EA1-AA33-829C8B21ED0F]
    // </editor-fold> 
    public int golpear (Personaje p) {
        return  this.getFactorAtaque()*p.getDefensa()/100;
    }

}
 
