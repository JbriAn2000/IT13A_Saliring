
package practice;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try {
            File myFile = new File("D:\\Practice.txt");
            if(myFile.createNewFile()){
                System.out.println("File created:" + myFile.getName());
            }else{
                System.out.println("File already exist");
            }
            int key =7;
            String m = "I LOVE YOU";
            String m1 = "Gwapo ko";
            String m2 = "Boutan si ma'am";
            String m3 = encryptMessage(m , key);
            String m4 = encryptMessage(m1 , key);
             String m5 = encryptMessage2(m2 , key);
             FileWriter writer = new FileWriter(myFile);
             writer.write("Original Message! " + "\n" + m + "\n" + m1 + "\n" + m2);
             
             writer.close();
             System.out.println("Successfully wrote to the file");
                System.out.println("EncryptedMessage: " + "\n" + m3 + "\n" + m4 + "\n" + m5);
        }catch (IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
            
        }
   }
    public static String encryptMessage(String message, int key){
        char[] chars = message.toCharArray();
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char)(chars[i] + key);
        }
        return new String(chars);      
    }
    public static String encryptMessage2(String message, int key){
        char[] chars = message.toCharArray();
        for(int i = 0; i < chars.length; i++){
            chars[i] = (char)(chars[i] + key);
      }
        return new String(chars);
    }
}

    


