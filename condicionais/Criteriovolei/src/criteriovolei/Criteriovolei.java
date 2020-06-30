
package criteriovolei;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Criteriovolei {

    public static void main(String[] args) {
        // TODO code application logic here
        double idade,altura;
        idade=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade:"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura:"));
        
        if((idade>17)&&(altura>=1.75)){
            JOptionPane.showMessageDialog(null, "De acordo com suas respostas você pode competir!!!");
        }else{
            JOptionPane.showMessageDialog(null, "De acordo com suas respostas você infelizmente pode competir ;-;");
        }
    }
    
}
