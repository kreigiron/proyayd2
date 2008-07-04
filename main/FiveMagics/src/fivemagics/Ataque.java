/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import javax.swing.JPanel;
import Motor.*;

/**
 *
 * @author Apocalipsis
 */
public class Ataque extends Thread {
    
    //public Personaje personaje;
    public Casilla[][] m;
    Tablero tab;
    static int x = 0;
    static int y = 0;
    Casilla actual;
    Casilla anterior;
    Movible personajeSystema;
    JPanel per = new JPanel();
    
    public Ataque(Tablero tb, Casilla[][] matriz, Movible mv)
    {
        tab = tb;
        m= matriz;
        per.setBounds(15, 15, 15, 15);
        per.setBackground(Color.RED);
        per.setToolTipText("Matando \n a cualquier hijo de la tostada");
        personajeSystema = mv;
  
    }
    
    public void setPersonajeSystema(Movible _personajeSystema)
    {
        personajeSystema = _personajeSystema;
    }
    
    public Movible getPersonajeSystema()
    {
        return personajeSystema;
    }
    
    public void run()
    {
        try {
            while(true)
            {
              anterior = m[x][y];
              anterior.borraPersonaje(anterior);
              x = (int)(Math.random()*10);
              y = (int)(Math.random()*10);
              actual = m[x][y];
              actual.pintaPersonaje(per);
              System.out.println(x +"-" +y);
              sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            //Logger.getLogger(ataque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int getX()
    {
        return x;
    }
    
    public static int getY()
    {
        return y;
    }
            
            
    
    

}


