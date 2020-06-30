/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                     //variaveis
       double a,b,c;
    //entrada   
a=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triangulo:"));
b=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triangulo:"));
c=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triangulo:"));
    
    if (((a<(b+c)) && (a>(Math.abs(b-c)))) && ((b<(a+c)) && (b>(Math.abs(a-c)))) && ((c<(b+a)) && (c>(Math.abs(b-a))))){
        if((a==c) && (b==c) && (a==c)){ 
       
        JOptionPane.showMessageDialog(null, "È um triângulo Equilatero");
        }
        if(((a==b)&&(b!=c)) || ((c==b)&&(c!=a)) || ((a==c)&&(c!=b))){ 
       
        JOptionPane.showMessageDialog(null, "È um triângulo Isoceles");
        }       
        
        if((a!=c) &&(b!=c)&& (a!=c)){ 
       
        JOptionPane.showMessageDialog(null, "È um triângulo Escaleno");
        }       
    }else{
        JOptionPane.showMessageDialog(null, "Não é um triângulo"); 
    }
    
    }

}
