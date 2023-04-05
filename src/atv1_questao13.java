/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao13
 * Descrição: 13Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
 * Data: 04/04/2023
 */


import java.util.Scanner;

public class atv1_questao13 {
    public static void main (String[] args){

        int altura;
        int pesoidealH;
        int pesoidealM;
        
        
        System.out.println("Insira sua altura em cm: ");
        
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextInt();
        entrada.close();
    
        pesoidealH = (int) ((altura * 72.2) - 58);
        pesoidealM = (int) ((62.1 * altura) - 44.7);
    
        System.out.println("Seu peso ideal é: ");
        System.out.println(pesoidealH / 100 + "KG para homens");
        System.out.println(pesoidealM / 100 + "KG para mulheres");
    
    
        }
    
    
}
