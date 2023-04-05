import java.util.Scanner;

public class atv1_questao2 {


  public static void main(String[] args) {

    //Declaração de variaveis
    
    int numero;

    //pergunta:
    System.out.println("Informe um Número");



    //Passo 1: Fazer a entrada dos dados
    
    Scanner teclado = new Scanner(System.in);
    numero = teclado.nextInt();
    teclado.close();

    //Passo 3: Exibir Resultado

    System.out.println("O numero informado foi: [" + numero + "]");
    
    
  }
  
}
    

