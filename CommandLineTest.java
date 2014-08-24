public class CommandlineTest 
{     
  public static void main(String[] args)     
  {         int s = args.length;                  
            System.out.println("Number of arguments" + s);                 
            for(String a:args)         
            {             
              System.out.println(a);         
            }     
  } 
}
