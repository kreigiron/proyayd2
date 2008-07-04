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
    
    
    
}
