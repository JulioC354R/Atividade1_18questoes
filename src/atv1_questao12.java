/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao12
 * Descrição: 12Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
 * usando a seguinte fórmula: (72.7*altura) - 58
 * Data: 04/04/2023
 */


import java.util.Scanner;

public class atv1_questao12 {
    public static void main(String[] args) {

        float altura;
        float pesoIdeal;

    System.out.println("Insira sua altura:");
    
    Scanner entrada = new Scanner(System.in);
    altura = entrada.nextFloat();
    entrada.close();
    
            pesoIdeal = (float) ((72.7 * altura) - 58);

    System.out.println("Seu peso ideal é: " + pesoIdeal / 100 + "KG");


    }

}
