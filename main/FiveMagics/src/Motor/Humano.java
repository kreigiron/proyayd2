package Motor;

import gui.Casilla; 
import javax.swing.JButton;
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 

// #[regen=yes,id=DCE.664CB10D-2AA5-AB22-411F-D83B5B0AFA1C]
// </editor-fold> 
public class Humano extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02ACC298-9ECA-4896-2EF4-3E9BDC190E51]
    // </editor-fold> 
    
    @Override
    protected void setParameters(){
        this.setEnergia(1000);
        this.setDefensa(500);
        this.setFuerza(500);
    }
    
    public Humano () {
        super();
        setParameters();       
        dibujar();
    } 
    
    public Humano(Arma a){
        super();
        setParameters();
        this.setArma(a);
    }

    @Override
    public int getIdPersonaje() {
       return Personaje.HUMANO;
    }





    public int getEstado() {
        return estado;
    }

    public void dibujar() {
        this.grafica = new Circulo(2);
    }

    @Override
    public String toString(){
        String str = super.toString();
        str+= "Raza: " + "Humano" + "\n";        
        return str;
    }


}

