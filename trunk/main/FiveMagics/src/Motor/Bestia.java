package Motor;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.319353B9-26FD-7A22-6EEB-C9D2947B39A9]
// </editor-fold> 
public class Bestia extends Personaje {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D14F3E18-3414-B99F-EBD6-405FA8B63AAC]
    // </editor-fold> 
    public Bestia () {
        setParameters();
    }
    
    @Override
    protected void setParameters(){
        this.setEnergia(500);
        this.setDefensa(1000);
        this.setFuerza(1000);      
        
    }
    public Bestia(Arma a){
        setParameters();
        this.setArma(a);
    }

    @Override
    public int getIdPersonaje() {
        return Personaje.BESTIA;        
    }

    
    public int getEstado() {
        return estado;
    }

    public void dibujar() {
        this.grafica = new Circulo(1);
    }

    public String toString(){
        String str = super.toString();
        str+= "Raza: " + "Bestia" + "\n";        
        return str;
    }

}

