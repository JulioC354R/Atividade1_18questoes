/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao15
 * Descrição: 15Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
 *  8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido.
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao15 {
    
    public static void main(String[] args) {
    
        float horas;
        float reaisPh;
        float salarioB;
        float salarioL;
        float IR;
        float INSS;
        float sindic;
    
    
            System.out.println("Insira a seguir: quanto você recebe por hora.");
        Scanner entrada = new Scanner(System.in);
        reaisPh = entrada.nextFloat();

        System.out.println("Insira a seguir: quantas horas trabalhou no mês.");
       
        horas = entrada.nextFloat();
        entrada.close();

    
        //calculos
            salarioB = reaisPh * horas;
            IR = salarioB / 100 * 11;
            INSS = salarioB/100*8;
            sindic = salarioB/100*5;
            salarioL = salarioB - IR - INSS - sindic;
        
        System.out.println("+ Salário Bruto    = R$" + salarioB);
        System.out.println("- Imposto de Renda = R$" + IR);
        System.out.println("- INSS             = R$" + INSS);
        System.out.println("- Sindicato        = R$" + sindic);
        System.out.println("= Salário Líquido = R$" + salarioL);
    
    
        
        
        }
}
