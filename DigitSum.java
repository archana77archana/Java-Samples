import java.util.Scanner;

class DigitSum
{
   public static void main(String args[])
   {
       int i, a = 0, sum = 0;
       i = Integer.parseInt(args[0]);           //entering values 
       while(i != 0)
       {
           a = i % 10;
           i = i / 10;
           sum = sum + a;
       }
       System.out.println(sum);
   }
}
