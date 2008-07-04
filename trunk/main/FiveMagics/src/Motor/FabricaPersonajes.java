/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;
import   gui.*;
/**
 *
 * @author kreig
   Clase que fabrica personajes*/
   public  class FabricaPersonajes{
        FabricaPersonajes(){            
        }
        /**Fabrica un nuevo personaje*/
        public Personaje crearPersonaje(int raza, Arma a, Casilla inicial){
            Personaje p;
            switch (raza){
                case Personaje.BESTIA:
                    p = new Bestia();
                        break;
//                case Personaje.ELFO:
//                    p =  new Elfo();
//                        break;
                case Personaje.HUMANO:
                    p = new Humano();
                    break;
                default:
                    p = new Humano();
            }
            p.setArma(a);
            p.setCasilla(inicial);
            return p;
        }
    }
    