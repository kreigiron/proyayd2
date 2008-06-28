package gui;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8621BE25-041D-3601-79CB-E7FC72F09EFF]
// </editor-fold> 
public class Tablero {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BC99EACF-7D0B-85FC-9804-EA81305A63F7]
    // </editor-fold> 
    private ArrayList<ArrayList<Casilla>> casillas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3BE4634C-33BB-3FEC-7A6D-409C7C387E8F]
    // </editor-fold> 
    public Tablero () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.13A8E7FB-D113-CA43-62D1-5AAA6125CB7B]
    // </editor-fold> 
    public ArrayList<ArrayList<Casilla>> getCasillas () {
        return casillas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D2518B40-E38C-8C94-0B74-E74D7E76B612]
    // </editor-fold> 
    public void setCasillas (ArrayList<ArrayList<Casilla>> val) {
        this.casillas = val;
    }

}

