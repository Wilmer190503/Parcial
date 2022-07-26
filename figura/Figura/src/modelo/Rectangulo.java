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
public class Rectangulo extends Figura
{
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) 
    {
       
        this.base = base;
        this.altura = altura;
    }
    
    
    
    public void calcularAreaPerimetro()
    {
        area = base * altura;
        perimetro = (2*base)+(2*altura);
        resultado  = area + " " + perimetro;
    }
}
