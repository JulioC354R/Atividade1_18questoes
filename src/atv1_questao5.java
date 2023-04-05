/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao5
 * Descrição: 5Faça um Programa que converta metros para centímetros.
 * Data: 04/04/2023
 */


import java.util.Scanner;

public class atv1_questao5 {

    public static void main(String[] args){

        int metros;
        int centimetros;
          System.out.println("Informe o metro");
    
        Scanner teclado = new Scanner(System.in);
          metros = teclado.nextInt();
          teclado.close();
    
          centimetros = metros * 100;
    
          System.out.println("Igual à " + centimetros+ "cm");
          
    }
}
