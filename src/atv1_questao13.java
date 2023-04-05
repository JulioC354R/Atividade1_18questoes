import java.util.Scanner;

public class atv1_questao13 {
    public static void main (String[] args){

        int altura;
        int pesoidealH;
        int pesoidealM;
        
        
        System.out.println("Insira sua altura em cm: ");
        
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextInt();
        entrada.close();
    
        pesoidealH = (int) ((altura * 72.2) - 58);
        pesoidealM = (int) ((62.1 * altura) - 44.7);
    
        System.out.println("Seu peso ideal é: ");
        System.out.println(pesoidealH / 100 + "KG para homens");
        System.out.println(pesoidealM / 100 + "KG para mulheres");
    
    
        }
    
    
}
