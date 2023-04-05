import java.util.Scanner;

public class atv1_questao16 {
    public static void main(String[] args) throws Exception {

        int area;
        double litros;
        double quantidadeLatas;
        double valorFinal;    
        Scanner input;
        // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
        System.out.println("insira o tamanho em metros quadrados da área a ser pintada.");

        input = new Scanner(System.in);
        area = input.nextInt();
        input.close();
        // calcular a quantidade de latas de tinta a serem compradas e o preco total
        litros = area / 3;
        quantidadeLatas = Math.ceil( litros / 18 );
        valorFinal = quantidadeLatas * 80;
        // mostrar a quantidade de latas de tinta a serem compradas e o preco total
        System.out.println("Quantidade de latas necessárias: " + quantidadeLatas);
        System.out.println("Valor Necessário: R$ " + valorFinal);

    
    }
}
