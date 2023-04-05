import java.util.Scanner;

public class atv1_questao12 {
    public static void main(String[] args) {

        float altura;
        float pesoIdeal;

    System.out.println("Insira sua altura:");
    
    Scanner entrada = new Scanner(System.in);
    altura = entrada.nextFloat();
    entrada.close();
    
            pesoIdeal = (float) ((72.7 * altura) - 58);

    System.out.println("Seu peso ideal é: " + pesoIdeal / 100 + "KG");


    }

}
