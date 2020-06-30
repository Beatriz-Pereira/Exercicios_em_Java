
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                   double saque,limite,saldo,saldofinal,saldoatual;
    //entrada   
    saque=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
    saldoatual=80000;
    limite= 2000;
    saldofinal=(saldoatual-saque);
    
    if((saldofinal>=0)){
     JOptionPane.showMessageDialog(null, "Seu saldo atual é positivo R$:"+saldofinal);
    }
    if((saldofinal<0) && (saldofinal>(-limite))){
     JOptionPane.showMessageDialog(null, "Seu saldo atual é negativo R$:"+saldofinal);
    }
 
    if((saldofinal<0) && (saldofinal<(-limite))){
       JOptionPane.showMessageDialog(null, "Você não possue limite suficiente, seu limite é de R$:" +limite); 
               }
  
    

    }
    
}
