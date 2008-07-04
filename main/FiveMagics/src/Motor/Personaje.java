package Motor;

import gui.Casilla; 
import java.util.*; 
import javax.swing.*;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.79C8BF81-5515-6479-5EAD-E7576071C546]
// </editor-fold> 
public abstract class Personaje extends javax.swing.JButton implements Movible {

    public static final int HUMANO = 1;
    public static final int BESTIA = 2;
    public static final int ELFO = 3;
    
    Icon grafica;
    
    private Casilla casilla;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C179991B-4CAA-3748-40D3-8FBDB39C3860]
    // </editor-fold> 
    private int energia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D321ECDF-96A9-945D-C6DB-1E989C736CC3]
    // </editor-fold> 
    private int fuerza;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.584A82B3-E46F-61A2-C158-50F8F4B6EC46]
    // </editor-fold> 
    private int defensa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C784E8B4-A791-6DEE-5BC8-7C787795874F]
    // </editor-fold> 
    private Arma arma;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2659D86C-787B-5D15-8865-709372BC9717]
    // </editor-fold> 
    private Equipo equipo;

    /// indica si esta vivo >0 o muerto <=0
    protected int estado = 1;
    
      /**Ataca al movible especificado*/
    public void atacar (Movible enemigo){
        getArma().atacar(enemigo);
    }

    public abstract int getIdPersonaje();
        
    @Override
    public Casilla getCasilla() {
        return casilla;
    }

    public int getEnergia() {
        return energia;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    @Override
    public Arma getArma() {
        return arma;
    }
    
    @Override
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public void dañar(int puntos) {
        // si no se aguanta el daño, se cambia el estado del personaje a muerto
        if( this.energia <= puntos)
            this.estado = 0;
        else // sino solo se baja la energia
            this.energia = this.energia - puntos;
        update(); //actualizamos la grafica
    }

    public void update(){        
        if (this.estado == 1){
            this.setIcon(null);
            this.setText("x");
            return;
        }
        this.setIcon(grafica);
        this.setText(null);       
    }
    
    protected abstract void setParameters();
    
    @Override
    public String toString(){
        String str = new String();
       // str+= "Equipo: " + this.equipo.toString() + "\n";
        str+= "Energia: " + this.energia + "\n";
        str+= "Defensa: " + this.defensa  + "\n";
        str+= "Ataque: " + this.fuerza + "\n";   
        str+= "Arma: " + this.arma.toString() + "\n";   
        return str;
    }
  
    @Override
    public JButton getButton() {
        return this;
    }

    @Override
    public void setCasilla(Casilla casilla) {
        this.casilla = casilla;
    }
       

}

