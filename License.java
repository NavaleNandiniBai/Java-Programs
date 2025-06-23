import java.util.*;
public class License {
    public static void main (String args[])20{
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for License");

        }
         else {
            System.out.println("Not eligible for License");
         }
         sc.close();
    }
    
    
}
