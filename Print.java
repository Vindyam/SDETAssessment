import java.util.*;
class Print
{
    public static void main(String args[])
    {
        int n = 100;
 
        // loop for 100 times
        for (int i=1; i<=n; i++)                                
        {
            //number divisible by 15(divisible by
            // both 3 & 5), print 'Planit Testing' in
            // place of the number
            if (i%15==0)                                                
                System.out.print("PlanitTesting"+" ");
            // number divisible by 5, print 'Testing'
            // in place of the number
            else if (i%5==0)    
                System.out.print("Testing"+" ");
 
            // number divisible by 3, print 'Planit'
            // in place of the number
            else if (i%3==0)    
                System.out.print("Planit"+" ");
                 
            else // print the numbers
                System.out.print(i+" ");                        
        }
    }
}