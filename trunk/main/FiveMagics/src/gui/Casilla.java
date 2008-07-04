package gui;

import Motor.Movible;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
import java.awt.*;
import javax.swing.*;
// #[regen=yes,id=DCE.23A9F0DA-D4BD-D49A-B0CC-2BCEB341765A]
import javax.swing.JPanel;
import Motor.*;
// </editor-fold> 
public class Casilla extends JPanel {

    private Terreno terreno;
    private int posX;
    private int posY;
    private Movible m;

    public Casilla() {
        this.inicio();
    }

    public Movible getM() {
        return m;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.83D10EFE-7DA7-2F55-2ECB-30DC29BDE575]
    // </editor-fold> 
    public void setM(Movible val) {
        this.m = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.347BD857-6FC1-DD7D-901D-FEB46A13BC93]
    // </editor-fold> 
    public int getPosX() {
        return posX;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.916AACF7-2061-C5C7-CEE0-E8F8ADC5C0A9]
    // </editor-fold> 
    public void setPosX(int val) {
        this.posX = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A96166E-84DC-67B9-879F-BCEA30CD9959]
    // </editor-fold> 
    public int getPosY() {
        return posY;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52DB95AD-DC4B-215A-E7CA-99305A7F07F3]
    // </editor-fold> 
    public void setPosY(int val) {
        this.posY = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.33F830BA-2951-EBC0-F70B-64633FDFB4CC]
    // </editor-fold> 
    public Terreno getTerreno() {
        return terreno;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FAA070CB-37A5-367A-51A1-526D336346D9]
    // </editor-fold> 
    public void setTerreno(Terreno val) {
        this.terreno = val;

    }

    public void inicio() {
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablero1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
    ///personaje = new PersonajeGrafico();
    //personaje.setBounds(15,15, 10, 10);
    //personaje.setBackground(Color.BLUE);
    }
    //agregando metodos para pintar el personaje
    public void pintaPersonaje(Component personaje) {
        this.add(personaje);
        //this.setToolTipText(personaje.toString());
        this.repaint();
    }

    public void borraPersonaje(Casilla anterior) {
        anterior.removeAll();
        anterior.repaint();
    }

    private void tablero1MouseClicked(java.awt.event.MouseEvent evt) {

        Tablero t = (Tablero) this.getParent();
        t.tablero1MouseClicked(evt);
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
        Tablero t = (Tablero)this.getParent();
        System.out.println(evt.getKeyCode());
        switch(evt.getKeyCode())
        {
            case 37:
                t.atacarIzquierda(posX, posY);
                break;
            case 38:
                t.atacarArriba(this.posX, this.posY);
                break;
            case 39:
                t.atacarDerecha(posX, posY);
                break;
            case 40:
                t.atacarAbajo(this.posX, this.posY);
                break;     
        }
    }

    private void formMouseEntered(java.awt.event.MouseEvent evt) {
// TODO add your handling code here:
        requestFocus();
    }
    
   
    
}

