/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao6
 * Descrição: 6Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 * Data: 04/04/2023
 */


import java.util.Scanner;

public class atv1_questao6 {
    public static void main(String[] args) throws Exception {

        double raio;
        double area;
    System.out.println("Qual o raio do circulo?");
    
        Scanner entrada = new Scanner(System.in);
        raio = entrada.nextDouble();
        entrada.close();

        area = Math.PI * (raio * raio);

        System.out.println("A área do Circulo é: " + area);


    }
}
