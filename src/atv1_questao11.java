/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao11
 * Descrição: 11Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao11 {
    public static void main(String[] args) {

    int number1;
    int number2;
    double numberreal;
    double resultA;
    double resultB;
    double resultC;
    System.out.println("Insira dois números inteiros e um número real:");

    Scanner entrada = new Scanner(System.in);
    number1 = entrada.nextInt();
    number2 = entrada.nextInt();
    numberreal = entrada.nextDouble();
    entrada.close();
    
    resultA = (number1 * 2) * (number2 / 2);
    resultB = (number1 * 3) + numberreal;
    resultC = numberreal * numberreal * numberreal;

    System.out.println("Resultado A: " + resultA);
    System.out.println("Resultado B: " + resultB);
    System.out.println("Resultado C: " + resultC);
    


    }
}
