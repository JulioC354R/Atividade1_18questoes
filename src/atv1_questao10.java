import java.util.Scanner;

public class atv1_questao10 {
    public static void main(String[] args) throws Exception {
        int Fahrenheit;
        int celsius;

         System.out.println("Insira a temperatura em Celsius:");

         Scanner teclado = new Scanner(System.in);
        celsius = teclado.nextInt();
        teclado.close();
    
        Fahrenheit= ((celsius/5) * 9) + 32;


        System.out.println(celsius + "C" + " é igual à " + Fahrenheit + "F");

    }
}
