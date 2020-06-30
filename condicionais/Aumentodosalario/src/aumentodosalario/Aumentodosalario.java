
package aumentodosalario;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Aumentodosalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        double salario,resp;
        salario=Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario:"));
        
        if (salario<=1500){
            resp=(salario*1.20);
        }else if ((salario>1500)&&(salario<=3000)){
            resp=(salario*1.20);
        }else {
            resp=(salario*1.10);
        }
            JOptionPane.showMessageDialog(null, "O seu salario sera de R$:"+resp);
    }
}

    

