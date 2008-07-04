/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

/**
 *
 * @author kreig
Clase que fabrica armas*/
    public class FabricaArmas{
        
       public FabricaArmas(){
            
        }
        
        public Arma crearArma(int tipoArma){
             Arma p;
            switch (tipoArma){
                case Arma.MAZO:
                    p = new Mazo();
                        break;
                case Arma.ESPADA:
                    p =  new Espada();
                        break;                
                default:
                    p = new Espada();
            }
            return p;
        }
    }
    
 