/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao8
 * Descrição: 8Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao8 {
    public static void main(String[] args) {

        //Declaração de variaveis
        
        double dinheiroPHora;
        double horas;
        double salario;
    
         System.out.println("Quantas horas você trabalhou nesse mês?");
        
        Scanner teclado = new Scanner(System.in);
        horas = teclado.nextDouble();
        teclado.close();
    
         System.out.println("Quanto você ganha por hora?");
        dinheiroPHora = teclado.nextDouble();
    
        salario = horas * dinheiroPHora;
    
        //Passo 3: Exibir Resultado
    
        System.out.println("Valor a receber nesse mês = R$" + salario);
        
      }
}
