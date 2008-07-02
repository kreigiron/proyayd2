/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Armas;

/**
 *
 * @author Administrador
 */
public class Espada extends Arma{
    public Espada () {
        this.setFactorAtaque(this.ESPADA);
    }
    @Override
    public String toString(){
        String str = super.toString();
        str+= " Tipo: Espada ";        
        return str;
    }

}
