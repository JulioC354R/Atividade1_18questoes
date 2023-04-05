/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao17
 * Descrição: 17Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área
 *  a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida 
 * em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao17 {

    public static void main(String[] args) throws Exception {
 
    System.out.println("Qual o tamanho em metros quadrados da área a ser pintada?");
        Scanner teclado = new Scanner(System.in);
        double area = teclado.nextInt();
        teclado.close();

        double litro = area / 6;
        double folga = litro * (110 / 100);
        double lata = Math.ceil(folga / 18);
        double galoes = Math.ceil(lata / 5);
        double apenaslata = Math.ceil(folga / 18);
        double apenasgaloes = Math.ceil(folga / 3.6);
        double precolata = lata *80;
        double precogaloes = galoes * 25;
        double precoapenaslata = apenaslata *80;
        double precoapenasgaloes = apenasgaloes * 25;
        double precototal = precogaloes + precolata;



    System.out.println("Comprando apenas latas:  " + apenaslata +   "latas  custando um total de: R$ " + precoapenaslata);
    System.out.println("Comprando apenas galões: " + apenasgaloes + "galões custando um total de: R$ " + precoapenasgaloes);
    System.out.println("Comprando galões e latas: " + galoes + "galões e " + lata + " latas custando um total de: R$ " + precototal);



    }
}