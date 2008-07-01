/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Motor;
import gui.*;
/**
 * Fabrica de todos los objetos posibles que implementen movible
 * @author kreig
 */
public class SuperFabrica {

    private static SuperFabrica fabrica;
    FabricaPersonajes fp = new FabricaPersonajes();
    FabricaArmas fa = new FabricaArmas();
    FabricaElementos fe = new FabricaElementos();
    SuperFabrica(){
    
    }
    
    public Movible crearMovible(int raza, int arma, int elementoArma, Casilla inicial){
        Movible m;
        Arma a = fa.crearArma(arma);
        Elemento e = fe.crearElemento (elementoArma, a);        
        Personaje p = fp.crearPersonaje(raza, a, inicial);        
        p.setArma(e);
        m = p;
        return m;
    }
    /**Singleton para la fabrica*/
    public static SuperFabrica getFabrica(){
        if(fabrica == null){
            fabrica = new SuperFabrica();            
        }
        return fabrica;
    }
    
    /**Clase que fabrica armas*/
    class FabricaArmas{
        FabricaArmas(){
            
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
    
    /**Clase que fabrica personajes*/
    class FabricaPersonajes{
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
    
    /**Clase que fabrica elementos*/
    class FabricaElementos{
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
    }    
}
