/* Nome do Aluno:  Júlio César de Brito Herculano
 * RA: 13523113793
 * Nome do Programa: atv1_questao18
 * Descrição: 18Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de
 Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 * Data: 04/04/2023
 */

import java.util.Scanner;

public class atv1_questao18 {
    
    public static void main(String[] args) throws Exception {
    
        int MB;
        int mbps;
        int minutos;
        int MBPM;

        System.out.println("Qual tamanho de um arquivo para download? (em MB)");
            Scanner entrada = new Scanner(System.in);
             MB = entrada.nextInt(); 

        System.out.println("Qual a velocidade de um link de Internet? (em Mbps)");
            mbps = entrada.nextInt();
            entrada.close();

    MBPM = (mbps * 60);
    minutos = MB / MBPM;
     
     System.out.println("Tempo estimado para download é: " + minutos + " minutos");
     
     
     }
 }
 
