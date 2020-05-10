import java.util.*;
public class AsciiUpperCase {
     
        public static void main(String[] args)
        {
        for(int i = 65; i <91; i++)
        {System.out.println((char)i + " = " + i );} 

        char character = 'A';    
        int ascii = (int) character;
        System.out.print(ascii);

        double randomNumber = new Random(50);
               
        System.out.print(randomNumber);
      }
      
}