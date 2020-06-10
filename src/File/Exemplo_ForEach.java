package File;

import java.util.Scanner;

public class Exemplo_ForEach {
    
    public static void main(String[] args){
            
    		// cria��o do array "numero" com 5 posi��es. 
    		// declara��o da vari�vel "soma". 
    		int[] numero = new int[5];
            int soma = 0;
            
            // inst�ncia chamada "entrada" da classe Scanner criada. Passado System.in nos par�metros.
            // Declara��o padr�o. 
            Scanner entrada = new Scanner(System.in);
            
            
            // FOR COMUM:
            // Vari�vel cont iniciada com o valor 0.
            // Euquanto cont < que o tamanho de numero (numero.lengh).
            // Incrementa a vari�vel cont.
            // NO CORPO DO FOR:
            // sout, que imprime o valor de cont+1. Ent�o as impress�es come�ar�o a partir de 1, e...
            // n�o de 0. 
            // a vari�vel n�mero, a cada itera��o de cont (1 a 5), recebe os valores inseridos pelo usu�rio...
            // atrav�s entrada.nextInt().            
            for(int cont = 0 ; cont < numero.length ; cont++){
                System.out.print("Entre com o n�mero "+(cont+1)+": ");
                numero[cont] = entrada.nextInt();
            }
            
            // exibindo e somando
            // FOREACH (estranho � que a sintaxe � do foreach, mas o exemplo buscado na internet...
            // possui apenas for). 
            // Vari�vel cont (do tipo inteiro)...
            // recebe as itera��es de numero, ou seja, todos os valores inseridos pelo usu�rio. 
            // NO CORPO DO FOREACH:
            // vari�vel soma, declarada no in�cio do c�digo, recebe o total acumulado na vari�vel cont. 
            for(int cont : numero){
                soma += cont;
            }
            
            // impress�o do resultado de soma. 
            System.out.println("A soma dos n�meros que voc� digitou � " + soma + "!");
            
            entrada.close();
        }
}



