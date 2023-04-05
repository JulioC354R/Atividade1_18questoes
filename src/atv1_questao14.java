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
