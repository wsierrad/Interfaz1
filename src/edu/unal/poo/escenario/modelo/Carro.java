/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.escenario.modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Chasis chasis;
    private Ruedas[] ruedas;

    public Carro() {
        this.ruedas=new Ruedas[2];
    }
    
    public void addRueda(int xr1, int yr1,int xr2,int yr2){
        this.ruedas[0]= new Ruedas(xr1,yr1);
        this.ruedas[1]= new Ruedas(xr2,yr2);
    }
    
    public void centroChasis (int x, int y){
        this.chasis.setX(x);
        this.chasis.setY(y);
    }
    
    public void addPuntoChasis (int x, int y){
        this.chasis.addPunto(x,y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Ruedas[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Ruedas[] ruedas) {
        this.ruedas = ruedas;
    }
    
    
            
}
