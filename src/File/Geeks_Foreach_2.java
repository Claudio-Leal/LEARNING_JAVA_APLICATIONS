/*
 * Diferença do exemplo 1:
 * Aqi se trata de um array de strings. 
 */

package File;

import java.util.*; 
public class Geeks_Foreach_2 { 
  
    public static void main(String[] args) 
    { 
        // create an ArrayList which going to 
        // contains a list of Student names which is actually 
        // string values 
        ArrayList<String> students = new ArrayList<String>(); 
  
        // Add Strings to list 
        // each string represents student name 
        students.add("Ram"); 
        students.add("Mohan"); 
        students.add("Sohan"); 
        students.add("Rabi"); 
  
        // print result 
        System.out.println("list of Students:"); 
  
        // forEach method of ArrayList and 
        // print student names 
        // "n" recebeu o tipo string. Também foi declarada automaticamente.
        // foi feito um pouco diferente, ou seja, o método "print" está sendo chamado aqui.
        // resumindo:
        // para cada "n" students, o método print é chamado, e "n" é passado. 
        // lembrando que n é string que armazena os dados de cada um dos integrantes da lista. 
        students.forEach((n) -> print(n)); 
    } 
  
    // printing student name 
    public static void print(String n) 
    { 
        System.out.println("Student Name is " + n); 
    } 
} 