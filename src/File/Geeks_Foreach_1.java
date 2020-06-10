/*Syntax:

public void forEach(Consumer<? super E> action)
Parameter: This method takes a parameter action which represents the action to be performed for each element.

Returns: This method does not returns anything.

Exception: This method throws NullPointerException if the specified action is null.

Below programs illustrate forEach() method of ArrayList:

Program 1: Program to demonstrate forEach() method on ArrayList which contains a list of Numbers.
*/

package File;

import java.util.*; 
public class Geeks_Foreach_1 { 
  
    public static void main(String[] args) 
    { 
        // create an ArrayList which going to 
        // contains a list of Numbers 
        ArrayList<Integer> Numbers = new ArrayList<Integer>(); 
  
        // Add Number to list 
        Numbers.add(23); 
        Numbers.add(32); 
        Numbers.add(45); 
        Numbers.add(63); 
  
        // forEach method of ArrayList and 
        // print numbers 
        // resumindo:
        // para cada n, sout imprime n. 
        // só estou estranhando a falta de necessidade de declarar n.
        // acho que o próprio forEach cumpre esta função. 
        Numbers.forEach((n) -> System.out.println(n)); 
    } 
}
