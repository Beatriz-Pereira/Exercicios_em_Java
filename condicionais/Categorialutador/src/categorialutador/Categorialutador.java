
package categorialutador;

import javax.swing.JOptionPane;

/**
 *
 * @author Josias
 */
public class Categorialutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peso;
         peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso:"));
         
                if ((peso>=46.27)&&(peso<47.63)) {
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Palha Ligeiro:");
                  }
            if ((peso>=47.63)&&(peso<48.99)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Palha");
            }
            if ((peso>=48.99)&&(peso<50.35)){
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Mosca Ligeiro");
    }
            if((peso>=50.35)&&(peso<51.72)){
         JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Mosca");
    }
             
            if((peso>=51.72)&&(peso<53.52)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Super Mosca");
    }
            if  ((peso>=53.52)&&(peso<55.34)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Galo");
            }
            if ((peso>=55.34)&&(peso<57.15)) {
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Super Galo");
                  }
            if ((peso>=57.15)&&(peso<58.97)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Pena");
            }
            if ((peso>=58.97)&&(peso<61.23)){
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Super Pena");
    }
            if((peso>=61.23)&&(peso<63.50)){
         JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Leve");
    }
             
            if((peso>=63.50)&&(peso<66.68)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Super Leve");
    }
            if  ((peso>=66.68)&&(peso<69.85)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Meio-Médio");
            }
            if ((peso>=69.85)&&(peso<73.03)) {
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Super Meio-Médio");
                  }
            if ((peso>=73.03)&&(peso<76.2)){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Médio ");
            }
            if ((peso>=76.2)&&(peso<79.38)){
                JOptionPane.showMessageDialog(null, "Você se enquadra na categoriaSuper Médio");
    }
            if((peso>=79.38)&&(peso<90.72)){
         JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Meio-Pesado");
    }
             
            if(peso==90.72){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Cruzador:");
    }
            if  (peso> 90.73){
                 JOptionPane.showMessageDialog(null, "Você se enquadra na categoria Pesado");
            }
               
    }
               
    }   
   
    }
    
}
