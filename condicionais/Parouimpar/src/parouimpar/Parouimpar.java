
package parouimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Parouimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numero;
    numero=Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
    
    if (numero % 2==0){
        JOptionPane.showMessageDialog(null, "Esse valor é um numero par");
    }else{
        JOptionPane.showMessageDialog(null, "Esse valor é um numero impar");    
            }
    }
}


