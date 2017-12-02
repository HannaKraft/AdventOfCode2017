import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Day1Part2
{
    public static void main (String args[]) throws java.io.IOException
    {
        
   
        String list = new Scanner(new File("list")).useDelimiter("\\Z").next();
        


        
        
        System.out.println(captcha(list));

    }
     public static String reverseIt(String source) {
    int i, len = source.length();
    StringBuilder dest = new StringBuilder(len);

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }

    return dest.toString();
}
        
        
    public static int captcha (String list){

        int sum = 0;

       
        int a = (list.length())/2;

        for(int i = 0; i < a; i++)
        {

            if(Integer.parseInt(list.substring(i, i+1)) == Integer.parseInt(list.substring(a+i, a+i+1))) 
            {
                sum += (Integer.parseInt(list.substring(i, i+1)))*2;
            }
        }

       return sum;
    }
   


}