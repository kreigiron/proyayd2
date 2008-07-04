/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;

/**
 *
 * @author kreig
 *Clase que fabrica elementos*/
    public class FabricaElementos{
        FabricaElementos(){
            
        }
        
        public Elemento crearElemento( int tipoElemento, Arma a){
             Elemento p;
            switch (tipoElemento){
                case Elemento.AGUA:
                    p = new Agua();
                        break;
                case Elemento.FUEGO:
                    p =  new Fuego();
                        break;                
                case Elemento.TIERRA:
                    p =  new Tierra();
                        break;                
//                case Elemento.VIENTO:
//                    p =  new Viento();
//                        break;                
                default:
                    p = new Agua();
            }
            p.setArma(a);
            return p;
        }        
        
        public Elemento crearElemento( int tipoElemento){
             Elemento p;
            switch (tipoElemento){
                case Elemento.AGUA:
                    p = new Agua();
                        break;
                case Elemento.FUEGO:
                    p =  new Fuego();
                        break;                
                case Elemento.TIERRA:
                    p =  new Tierra();
                        break;                
//                case Elemento.VIENTO:
//                    p =  new Viento();
//                        break;                
                default:
                    p = new Agua();
            }
            return p;
        }        
    }    