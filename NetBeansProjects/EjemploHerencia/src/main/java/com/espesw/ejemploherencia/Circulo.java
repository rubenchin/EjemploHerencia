/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espesw.ejemploherencia;

/**
 *
 * @author edgarlopez
 */
public class Circulo extends FiguraGeometrica {
private double radio;

public Circulo(double radio){
    this.radio=radio;
}
    @Override
    public double CalcularArea() {
        area=3.14*radio*radio;
        return area;
    }
    
}
