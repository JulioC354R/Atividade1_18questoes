/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao7
 * Descrição: 7Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao7 {
    public static void main(String[] args) throws Exception {

        int altura;
        int largura;
        int area;

        System.out.println("Quais as medidas do quadrado? (altura e largura)");

        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextInt();
        largura = entrada.nextInt();
        entrada.close();

        area = largura * altura;

        System.out.println("A área do Quadrado é: " + area);
        System.out.println("O dobro da área é: " + area * 2);

    }
}
