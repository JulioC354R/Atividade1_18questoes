/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao9
 * Descrição: 9Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em 
 * graus Celsius.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao9 {
    public static void main(String[] args) throws Exception {
        int Fahrenheit;
        int celsius;

         System.out.println("Insira a temperatura em Fahrenheit:");

         Scanner teclado = new Scanner(System.in);
        Fahrenheit = teclado.nextInt();
        teclado.close();
    
        celsius = 5 * ((Fahrenheit-32) / 9);


        System.out.println(Fahrenheit + "F" + " é igual à " +  celsius + "C");

    }
}
