/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Color;
import Motor.*;
import javax.swing.JButton;

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
    JButton personajeSystema;
    Movible mvs;
    //JPanel per = new JPanel();
    
    public Ataque(Tablero tb, Casilla[][] matriz, Movible mv)
    {
        tab = tb;
        personajeSystema = (JButton)mv;
        m= matriz;
        personajeSystema.setBounds(15, 15, 15, 15);
        //per.setBounds(20, 20, 20, 20);
        personajeSystema.setBackground(Color.RED);
        personajeSystema.setToolTipText(mv.toString());
        mvs = mv;
    }
    
    public void setPersonajeSystema(Movible _personajeSystema)
    {
        personajeSystema = (JButton)_personajeSystema;
    }
    
    public Movible getPersonajeSystema()
    {
        return (Movible)personajeSystema;
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
              actual.pintaPersonaje(personajeSystema);
              m[x][y].getTerreno().getE().atacar(mvs);
              personajeSystema.setToolTipText(mvs.toString());
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


