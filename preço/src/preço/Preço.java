
package preço;

import java.util.Scanner;

public class Preço {

    public static void main(String[] args) {
    //Definiçao de Variaveis
    double preco, resul;
    String nome; 
    //entrada
    Scanner entrada= new Scanner(System.in);
    System.out.println("Digite o nome do produto: ");
    nome= entrada.next();
    
    System.out.println("Digite o preço do produto: ");
     preco= entrada.nextDouble();
     //processamento
     resul=(preco*1.65);
     //saida
     System.out.println("Você vai vender o produto:  "+nome+"por R$:"+resul);
    }
    
}
