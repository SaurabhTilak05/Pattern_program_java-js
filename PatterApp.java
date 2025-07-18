/*
 * Q1. Write a java program to print this pattern.
A
A B A
A B C B A
A B C D C B A
A B C D E D C B A

 */

import java.util.*;
public class PatterApp
{
    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
 
        for(int i=0;i<5;i++){
  
            for(int j=0;j<=i;j++)
            {
               System.out.print((char)('A'+j)+" ");
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.print((char)('A'+j)+" ");
            }
             System.out.println("");
        }
           
        } 
}
