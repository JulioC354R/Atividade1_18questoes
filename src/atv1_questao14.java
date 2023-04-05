/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao5
 * Descrição: 14João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de
 *  seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado 
 * de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa
 *  que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além
 *  do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens
 *  adequadas.
 * Data: 04/04/2023
 */


import java.util.Scanner;

public class atv1_questao14 {
    public static void main(String[] args) {
    
        double kilos;
        double excesso;
        double multa;
    
            System.out.println("Insira o peso em kg:");
        Scanner teclado = new Scanner(System.in);
        kilos = teclado.nextDouble();
        teclado.close();
    
        excesso = kilos - 50;
        multa = excesso * 4;
    
        if (excesso <= 0) {
            System.out.println("Não há multa a pagar! ");
        }
    
        else if (excesso > 0) {
    
            System.out.println("O valor a pagar é: R$" + multa);
        }
    
    
    
    
    
        }
}
