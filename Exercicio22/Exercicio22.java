
package exercicio22;

import java.util.Scanner;

public class Exercicio22 {

  
    public static void main(String[] args) {
        
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto=0.0f;
        float totalVenda=0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for (; i < 3; i++){
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda do produto: ");
            precoVenda = leitor.nextFloat();
            
            totalCusto = totalCusto+precoCusto;
            totalVenda = totalVenda+precoVenda;
        
            if (precoCusto == precoVenda){
                System.out.println("Houve um empate entre o preço de custo e o preço de venda");
            
            }else{
                if(precoCusto>precoVenda){
                    System.out.println("Houve prejuizo");
                }else{
                    System.out.println("Houve lucro");
                }
               
            }
            
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto
                    + ", preço de venda = " + precoVenda);
        }
       
        System.out.println("A media do preço de custo é de: " + (totalCusto/i));
        System.out.println("A media do preço do venda é de: " + (totalVenda/i));
        
    }
    
}
