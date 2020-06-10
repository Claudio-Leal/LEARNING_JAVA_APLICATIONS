package File;

import java.util.Scanner;

public class Exemplo_ForEach {
    
    public static void main(String[] args){
            
    		// criação do array "numero" com 5 posições. 
    		// declaração da variável "soma". 
    		int[] numero = new int[5];
            int soma = 0;
            
            // instância chamada "entrada" da classe Scanner criada. Passado System.in nos parâmetros.
            // Declaração padrão. 
            Scanner entrada = new Scanner(System.in);
            
            
            // FOR COMUM:
            // Variável cont iniciada com o valor 0.
            // Euquanto cont < que o tamanho de numero (numero.lengh).
            // Incrementa a variável cont.
            // NO CORPO DO FOR:
            // sout, que imprime o valor de cont+1. Então as impressões começarão a partir de 1, e...
            // não de 0. 
            // a variável número, a cada iteração de cont (1 a 5), recebe os valores inseridos pelo usuário...
            // através entrada.nextInt().            
            for(int cont = 0 ; cont < numero.length ; cont++){
                System.out.print("Entre com o número "+(cont+1)+": ");
                numero[cont] = entrada.nextInt();
            }
            
            // exibindo e somando
            // FOREACH (estranho é que a sintaxe é do foreach, mas o exemplo buscado na internet...
            // possui apenas for). 
            // Variável cont (do tipo inteiro)...
            // recebe as iterações de numero, ou seja, todos os valores inseridos pelo usuário. 
            // NO CORPO DO FOREACH:
            // variável soma, declarada no início do código, recebe o total acumulado na variável cont. 
            for(int cont : numero){
                soma += cont;
            }
            
            // impressão do resultado de soma. 
            System.out.println("A soma dos números que você digitou é " + soma + "!");
            
            entrada.close();
        }
}



