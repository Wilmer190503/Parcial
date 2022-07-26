/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Circulo extends Figura
{
    protected double radio;

    public Circulo(double radio) 
    {
        
        this.radio = radio;
    }
    
    
    
    public void calcularAreaPerimetro(double radio)
    {
        area = Math.PI * Math.pow(2, radio);
        perimetro = 2*Math.PI * (radio);
        resultado = area + " " + perimetro;
    }
}
