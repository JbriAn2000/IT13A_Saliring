
package midterm;
import java.util.Scanner;

public class BasicCalculator {
     
    public static double add(double a , double b){
        return a + b;
    }
    public static double sub(double a , double b){
        return a - b;
    }
    public static double mul(double a , double b){
        return a * b;
    }
    public static double div(double a , double b){
        if(b == 0){
            System.out.println();
            return 0;
        }
        return a / b;
    }
    public static double per(double a , double percent){
        return(a * percent)/100;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        double x = in.nextDouble();
        System.out.print("Enter second number:");
        double y = in.nextDouble();
        
        System.out.println("Addition:" + add(x , y));
        System.out.println("Subtraction:" + sub(x , y));
        System.out.println("Multiplication:" + mul(x , y));
        System.out.println("Division:" + div(x , y));
        
        System.out.print("Enter percentage:");
        double z = in.nextDouble();
        System.out.println(" Percentage of " + x + " is " + per(x , z) + " % ");
        in.close();
    }
    
}
