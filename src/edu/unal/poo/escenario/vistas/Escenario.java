/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.escenario.vistas;

import javax.swing.*;
import java.awt.Graphics;
import edu.unal.poo.escenario.modelo.Carro;
import edu.unal.poo.escenario.modelo.Obstaculo;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Escenario extends JFrame{
    private String nombre;
    private Carro carro;
    private ArrayList<Obstaculo> obstaculos;
       
    public Escenario(String nombre){
        this.nombre=nombre;
        this.obstaculos = new ArrayList<>();
        add(new Panel());
    }
    public static void main(String[] args) {
        Escenario frame= new Escenario("Escenario carro");
        frame.setTitle("Escenario Carro");
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
