
package Prelim;
import java.util.Scanner;

public class Lab_Exercise2 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         
         System.out.println(" Enter first number: ");
         int num1 = scanner.nextInt(); 
         System.out.println(" Enter second number: ");
         int num2 = scanner.nextInt();
         System.out.println(" Enter third number: ");
         int num3 = scanner.nextInt();
         
         int largest = num1;
         
         if (num2 > largest){
             largest = num2;
         }
         if (num3 > largest){
             largest = num3;
         }
         System.out.println("The largest number is:" + largest);
         
         scanner.close();
                 
    }
    
    
    
}
