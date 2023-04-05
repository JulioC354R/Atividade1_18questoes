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
