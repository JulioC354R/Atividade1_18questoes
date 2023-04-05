/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao3
 * Descrição: 3Faça um Programa que peça dois números e imprima a soma.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao3{
    
    public static void main(String[] args) {

    System.out.println("Digite o primeiro número:");        
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();

     System.out.println("Digite o segundo número:");
        int numero2 = teclado.nextInt();    
        teclado.close();
        
        int soma = numero1 + numero2;

        System.out.println("A soma dos números é: " + soma);

    }
}
        
        
        
