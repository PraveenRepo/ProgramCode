
package suvianproject;

public class stringpalindrome {

  
  public static void main(String[] args)throws Exception
  {
    
    String var1 = "madam" ;
    
    int a = 1 ;
    int b = 2;
    
    int fib = 0 ;
    int count = 10;
    
    
    
    for(int i =3 ; i < count ;  i++)
    {
      fib = a + b;
      
      a = b;
      b = fib ;
      
          
System.out.println(fib);
        
            
    }
    
    
    
  }
  
  
}