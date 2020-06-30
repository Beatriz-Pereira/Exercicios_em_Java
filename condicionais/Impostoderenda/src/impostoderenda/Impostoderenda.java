/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostoderenda;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Impostoderenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salario, resp2, resp = 0;
        
        salario=Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario:"));

        if(salario<=1903.98){
        resp=(0);
        }else if((salario>=1903.99) && (salario<=2826.65)){
        resp=( salario*0.075);
        }else if((salario>=2826.65) && (salario<=3751.05)){
        resp=(salario*0.150);
        }else if ((salario>=3751.05)&&(salario<=4664.68)) {
        resp=(salario*0.225);
        }else if(salario>4664.68){
        resp=(salario*0.275);
        }
        resp2=(resp+salario);
    JOptionPane.showMessageDialog(null, "O aumento do seu salario sera de R$:"+ resp);
    JOptionPane.showMessageDialog(null, "O seu salario total sera de R$:"+resp2);
    }
    
}
