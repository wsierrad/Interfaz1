/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.escenario.vistas;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class Panel extends JPanel implements  ActionListener{
    int xc=110,yc=250;
    private Timer timer;
    
    public Panel(){
        this.timer = new Timer(30,this);
        this.timer.start();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        int xRec[]={xc,xc,xc+50,xc+50};
        int yRec[]={yc-20,yc-10,yc-10,yc-20};
        g.drawPolygon(xRec, yRec, xRec.length);
        g.drawOval(xc+10, yc-10, 10, 10);
        g.drawOval(xc+30, yc-10, 10, 10);
        int xPa[]={xc+10,xc+20,xc+30,xc+40};
        int yPa[]={yc-20,yc-30,yc-30,yc-20};
        g.drawPolygon(xPa, yPa, xPa.length);
        g.setColor(Color.RED);
        Rectangle carro = new Rectangle(xc,yc-30,50,30);
        g.drawRect(xc, yc-30, 50,30);
        
        g.setColor(Color.BLUE);
        g.drawRect(230,230,20,20);
        Rectangle obstaculo = new Rectangle (230,230,20,20);
        
        g.setColor(Color.RED);
        g.drawOval(230, 230, 20, 20);        
        
        if(carro.intersects(obstaculo)){
            this.timer.stop();
        }     
        
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.xc++;
        repaint();       
    }
}
