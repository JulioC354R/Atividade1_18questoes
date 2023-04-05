import java.util.Scanner;

public class atv1_questao6 {
    public static void main(String[] args) throws Exception {

        double raio;
        double area;
    System.out.println("Qual o raio do circulo?");
    
        Scanner entrada = new Scanner(System.in);
        raio = entrada.nextDouble();
        entrada.close();

        area = Math.PI * (raio * raio);

        System.out.println("A área do Circulo é: " + area);


    }
}
