import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Day1
{
    public static void main (String args[]) throws java.io.IOException
    {
        
   
        String list = new Scanner(new File("list")).useDelimiter("\\Z").next();
        


        
        
        System.out.println(captcha(list));

    }
        
        
    public static int captcha (String list){

        int sum = 0;
        int a = list.length();
        int b  = (list.length() - 1);
      
        if (Integer.parseInt(list.substring(0, 1)) == Integer.parseInt((list.substring(b, a))))
        {            
             sum += Integer.parseInt(list.substring(0, 1));
        
        }
        for (int i = 1; i < list.length(); i++)
            if (Integer.parseInt(list.substring(i-1, i)) == Integer.parseInt(list.substring(i, i+1)))
                    sum += Integer.parseInt(list.substring(i, i+1));
                else{
                    sum += 0;
                }

        return sum;
    }


}

