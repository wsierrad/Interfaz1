/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.escenario.modelo;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Chasis {
    private int x;
    private int y;
    private ArrayList<Punto> puntos;
    
    public Chasis (){
        this.puntos=new ArrayList<>();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void addPunto(int x, int y){
        puntos.add(new Punto(x,y));
    }
    
}
