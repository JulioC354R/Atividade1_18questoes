/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao4
 * Descrição: 4Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao4 {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        double NotaTotal;
        
        
            System.out.println("Digite suas 4 notas de avaliação bimestrais:");
        
            Scanner teclado = new Scanner(System.in);
            nota1 = teclado.nextDouble();
            nota2 = teclado.nextDouble();
            nota3 = teclado.nextDouble();
            nota4 = teclado.nextDouble();
            teclado.close();
            
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        NotaTotal = (nota1 + nota2 + nota3 + nota4);
        
                System.out.println("Sua média foi: " + media);
                System.out.println( "A soma das notas é: " + NotaTotal);
        
        
        
         }
    
}
