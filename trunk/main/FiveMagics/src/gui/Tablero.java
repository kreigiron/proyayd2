package gui;

import Motor.*;
import java.awt.Color;
import java.awt.Color;
import java.util.ArrayList;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
// #[regen=yes,id=DCE.8621BE25-041D-3601-79CB-E7FC72F09EFF]
// </editor-fold> 
public class Tablero extends JPanel {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BC99EACF-7D0B-85FC-9804-EA81305A63F7]
    // </editor-fold> 
    private ArrayList<ArrayList<Casilla>> casillas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3BE4634C-33BB-3FEC-7A6D-409C7C387E8F]
    // </editor-fold> 
    public Tablero() {
        this.pintar();
        this.inicio();
        e1.setElemento(SuperFabrica.getFabrica().creaElemento());   //Se crean los elementos para cada equipo
        e2.setElemento(SuperFabrica.getFabrica().creaElemento());
        //buscar
        //mv.setArma(new FabricaArmas().crearArma(this.asignaArmaAutomatico()));
        hilo = new Ataque(this, matriz, mv);
        hilo.start();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.13A8E7FB-D113-CA43-62D1-5AAA6125CB7B]
    // </editor-fold> 
    public ArrayList<ArrayList<Casilla>> getCasillas() {
        return casillas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D2518B40-E38C-8C94-0B74-E74D7E76B612]
    // </editor-fold> 
    public void setCasillas(ArrayList<ArrayList<Casilla>> val) {
        this.casillas = val;
    }    
    
    
    
    //agregado
    int fil = 10;
    int col = 10;
    Thread hilo;
    Casilla[][] matriz = new Casilla[fil][col];
    Movible mv;//el que esta en automatico
    Movible jugador;//el jugador
    
    Equipo e1 = new Equipo();
    Equipo e2 = new Equipo();
    
    public Casilla activa;
    public Casilla anterior;
    //public Personaje personaje;

    
    public Casilla getAnterior() {
        return anterior;
    }

    public void setAnterior(Casilla _anterior) {
        anterior = _anterior;
    }

    public Casilla getActiva() {
        return activa;
    }

    public void setActiva(Casilla _activa) {
        activa = _activa;
    }

    public void agregarPersonaje(){
        mv = SuperFabrica.getFabrica().crearMovible(asignaRazaAutomatico(), asignaArmaAutomatico(), asignaElementoArmaAutomatico(), new Casilla()); 
        e1.getPersonajes().add(mv);
        mv.setEquipo(e1);
    }
    
    public void inicio() {
        //activa.setPersonaje(personaje);
        this.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablero1MouseClicked(evt);
            }
            ;
            //public void mouseEntered(java.awt.event.MouseEvent evt) {
            //    formMouseEntered(evt);
            //}
        });
        this.agregarPersonaje();
        
    }

    public void atacarArriba(int cxc, int cyc) {
       Ataque a = (Ataque)hilo;
       int cx = a.getX();
       int cy = a.getY();
       Movible mvh = a.getPersonajeSystema();
       
       if(cxc == cx && cyc > cy){
           mv.atacar(mvh);
           System.out.println("atacando arriba exito");
       }else
           System.out.println("atacando arriba fallado");
    }
    
    public void atacarAbajo(int cxc, int cyc) {
       Ataque a = (Ataque)hilo;
       int cx = a.getX();
       int cy = a.getY();
       Movible mvh = a.getPersonajeSystema();
       if(cxc == cx && cyc < cy){
           mv.atacar(mvh);
           System.out.println("atacando abajo exito");
       }else{
           System.out.println("atacando abajo fallado");
       }
    }

    public void atacarIzquierda(int cxc, int cyc) {
       Ataque a = (Ataque)hilo;
       int cx = a.getX();
       int cy = a.getY();
       Movible mvh = a.getPersonajeSystema();
       if(cyc == cy && cxc > cx){
           mv.atacar(mvh);
           System.out.println("atacando izquierda exito");
       }else{
           System.out.println("atacando izquierda fallado");
       }
    }
    
    public void atacarDerecha(int cxc, int cyc) {
       Ataque a = (Ataque)hilo;
       int cx = a.getX();
       int cy = a.getY();
       Movible mvh = a.getPersonajeSystema();
       if(cyc == cy && cxc < cx){
           mv.atacar(mvh);
           System.out.println("atacando derecha exito");
       }else{
           System.out.println("atacando derecha fallado");
       }
    }
    
    public void tablero1MouseClicked(java.awt.event.MouseEvent evt) {
        this.anterior = this.activa;
        this.activa = (Casilla) evt.getComponent();
        //System.out.println("Activa "+this.activa.getToolTipText());
        //System.out.println("Anterior "+this.anterior.getToolTipText());
        //jugador = SuperFabrica.getFabrica().crearMovible(1, 0, 0, new Casilla());
        jugador = SuperFabrica.getFabrica().crearMovible(asignaRazaAutomatico(),asignaArmaAutomatico(), asignaElementoArmaAutomatico(), new Casilla());
        //Color color= jugador.getEquipo().getColor();
        JButton p = (JButton)jugador;
        p.setBounds(15, 15, 15, 15);
        
        p.setBackground(Color.BLUE);
        p.setToolTipText(p.toString());
        activa.borraPersonaje(anterior);
        activa.pintaPersonaje(p);
    }

    private void KeyTyped(java.awt.event.KeyEvent evt) {
// TODO add your handling code here:
        System.out.println(evt.getComponent().toString() + " Typed");
    }

    private void formMouseEntered(java.awt.event.MouseEvent evt) {
// TODO add your handling code here:
        requestFocus();
    }

    public void pintar() {

        // TODO add your handling code here:

        int x = 0;
        int y = 0;

        for (x = 0; x < col; x++) {
            for (y = 0; y < fil; y++) {
                matriz[x][y] = new Casilla();
                matriz[x][y].setLayout(null);
                matriz[x][y].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                
                matriz[x][y].setPosX(x);
                matriz[x][y].setPosY(y);
                matriz[x][y].setTerreno(new Terreno());
                String info = matriz[x][y].getTerreno().getE().toString();
                Color color= matriz[x][y].getTerreno().getE().getColor();
                matriz[x][y].setBackground(color);
                matriz[x][y].setToolTipText(info);
            }
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);

        ParallelGroup pivoteH = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING);
        SequentialGroup tempH = layout.createSequentialGroup();

        for (y = 0; y < fil; y++) {
            for (x = 0; x < col; x++) {
                tempH.addComponent(matriz[x][y], javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE);
            }
            pivoteH.addGroup(tempH);
            tempH = layout.createSequentialGroup();
        }



        SequentialGroup pivoteV = layout.createSequentialGroup();
        ParallelGroup tempV = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE);

        for (y = 0; y < fil; y++) {
            for (x = 0; x < col; x++) {
                tempV.addComponent(matriz[x][y], javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE);
            }
            pivoteV.addGroup(tempV);//.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED);
            tempV = layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE);
        }


        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addGroup(layout.createSequentialGroup().addGroup(pivoteH)));

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER).addGroup(pivoteV));

        this.activa = matriz[0][0];
        this.anterior = matriz[0][0];
    }
    
    
    /*Funcion que retorna un numero aleatorio de Raza
     * esta puede ser Humano, Elfo o Bestia
     */
    public int asignaRazaAutomatico(){
        int x = (int)(Math.random()*3);
        return x;    
    }
    
    /*Funcion que retorna un numero aleatorio de Raza
     * esta puede ser Mazo o Espada
     */
    public int asignaArmaAutomatico(){
        int x = (int)(Math.random()*2);
        return x;    
    }
    
    public int asignaElementoArmaAutomatico(){
        int x = (int) (Math.random() * 2);
        return x;
    }
}