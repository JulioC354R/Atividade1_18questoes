import java.util.Scanner;

public class atv1_questao11 {
    public static void main(String[] args) {

    int number1;
    int number2;
    double numberreal;
    double resultA;
    double resultB;
    double resultC;
    System.out.println("Insira dois números inteiros e um número real:");

    Scanner entrada = new Scanner(System.in);
    number1 = entrada.nextInt();
    number2 = entrada.nextInt();
    numberreal = entrada.nextDouble();
    entrada.close();
    
    resultA = (number1 * 2) * (number2 / 2);
    resultB = (number1 * 3) + numberreal;
    resultC = numberreal * numberreal * numberreal;

    System.out.println("Resultado A: " + resultA);
    System.out.println("Resultado B: " + resultB);
    System.out.println("Resultado C: " + resultC);
    


    }
}
