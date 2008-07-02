/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Armas;

/**
 *
 * @author Administrador
 */
public class Arco extends Arma{
    
    public Arco(){
        this.setFactorAtaque(this.MAZO);
    }
    
    @Override
    public String toString(){
        String str = super.toString();
        str+= " Tipo: Espada ";        
        return str;
    }
}
