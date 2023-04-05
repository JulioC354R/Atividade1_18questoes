public class atv1_questao17 {
    public static void main(String[] args) throws Exception {
        // Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em
         //metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de
          //1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 
          //litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
           
          //comprar apenas latas de 18 litros;
        //comprar apenas galões de 3,6 litros;
        //misturar latas e galões, de forma que o desperdício de tinta seja menor. 
        //Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, 
        //considere latas cheias.
                int area;
                double litros;
                double latasP;
                double galoes;
                double latas2;
                double galoes2;
                double valorFP;   
                double valorGaloes;
                double valorGaloesEL; 
                Scanner input;
                // O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
                System.out.println("insira o tamanho em metros quadrados da área a ser pintada.");
        
                input = new Scanner(System.in);
                area = input.nextInt();
                // calcular a quantidade de latas de tinta a serem compradas e o preco total
                litros = area/6;
        
        
                latasP = Math.ceil( litros / 18 );
                valorFP = latasP * 80;
        
                galoes = Math.ceil( litros / 3.6 );
                valorGaloes = galoes * 25;
                
                latas2 = Math.ceil( litros / 18 );
                valorFP = latasP * 80;
        
                galoes2 = Math.ceil( litros / 3.6 );
                valorGaloes = galoes * 25;
        
                galoes2 -= (latas2 * 5);
        
                valorGaloesEL = valorGaloes + valorFP;
        
                System.out.println("Quantidade de latas  necessárias: " + latasP + "     Valor Necessário: R$ " + valorFP);
                System.out.println("Quantidade de galões necessários: " + galoes + "     Valor Necessário: R$ " + valorGaloes);
                
                
                System.out.println("Usando latas e galões = "  + latas2 + " latas e " + galoes2 + " galões");
                System.out.println("Valor necessário: R$ " + valorGaloesEL);
        
            
            }
        }
        
        

