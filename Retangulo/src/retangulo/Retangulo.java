
package retangulo;

import java.util.Scanner;


public class Retangulo {

  
    public static void main(String[] args) {
        //definição de variaveis
        double base,altura,area,perimetro;
        //entrada
        Scanner entrada=new Scanner (System.in);
        System.out.println("Digite a Base:");
        base=entrada.nextDouble();  
        
         System.out.println("Digite a Altura:");
         altura=entrada.nextDouble();  
        
        //processamento
         area = base*altura;
         perimetro= ((base*2)+(altura*2));
         


         //saida
         
        System.out.println("a area do retângulo é: "+area);
        System.out.println("O perimetro do retângulo é:"+perimetro);
                
  
