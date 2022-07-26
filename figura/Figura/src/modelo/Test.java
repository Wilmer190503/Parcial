/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Test 
{
    public static void main(String[] args)
    {
       
        
        int figura = Integer.parseInt(JOptionPane.showInputDialog("Digite la figura para hallar area y perimetro \n 1 = rectangulo\n 2 = circulo"));
        
        if(figura == 1)
        {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
            Rectangulo miRectangulo = new Rectangulo(base,altura);
            miRectangulo.calcularAreaPerimetro();
            JOptionPane.showMessageDialog(null,("el area y el perimetro del rectangulo es: " +"  "+ miRectangulo.mostrarResultados()));
        }
       
        if(figura == 2)
        {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
            Circulo miCirculo = new Circulo(radio);
            miCirculo.calcularAreaPerimetro(radio);
            JOptionPane.showMessageDialog(null,("el area y el perimetro del circulo es: " +"  "+ miCirculo.mostrarResultados()));
        }
        
        System.exit(0);
        
    }
}
