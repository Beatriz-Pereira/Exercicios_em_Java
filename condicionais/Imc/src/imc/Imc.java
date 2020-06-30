/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peso,altura,imc;
        
        peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
        
        imc= (peso/(altura*altura));
        
            if (imc <= 18.5) {
                JOptionPane.showMessageDialog(null, "Você esta Abaixo do peso");
                  }
            if ((imc > 18.5) && (imc<= 24)){
                 JOptionPane.showMessageDialog(null, "Você esta com o Peso Normal");
            }
            if ((imc > 25) && (imc<= 29.9)){
                JOptionPane.showMessageDialog(null, "Você esta com Sobrepeso");
    }
            if((imc > 30) && (imc<= 34.9)){
         JOptionPane.showMessageDialog(null, "Você esta com Obsidade Grau 1");
    }
             
            if((imc > 35) && (imc<= 39.9)){
                 JOptionPane.showMessageDialog(null, "Você esta com Obsidade Grau 2");
    }
            if  (imc > 40){
                 JOptionPane.showMessageDialog(null, "Você esta com Obsidade Grau 3");
            }
               
    }
    
}
