
package midterm;

public class fibonacci {
    public static void main(String[] args){
//        int x = 10;
//        System.out.print(" fibonacci of " + x + ": ");
//        
//        for(int y = 0; y < x; y++){
//            System.out.print(fibonacci(y) + " , ");
//            
//        }
//            
//        }
//               public static int fibonacci(int x){
//                   if(x <= 1){
//                       return x;
//                 } else {
//                   return fibonacci(x-1) + fibonacci(x-2);
//                           
//                           
//                           }
//     
                      int x = 10;
                       System.out.append("fibonacci sequence" + x + " : ");
                       for(int i = 0; i < x; i++){
                           System.out.print(fibonacci(i) + " , ");
                       }
    }
                       public static int fibonacci(int x){
                           if(x <= 1){
                               return x;
                           } else {
                               return fibonacci(x-1) + fibonacci(x-2);
                           }
                           
                       }
                }  
    

