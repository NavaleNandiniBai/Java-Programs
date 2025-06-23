import java.util.*;
public class DivisibleBy3And5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println(n+" is Divisible by 3 and 5");
        }
        else{
            System.out.println(n+"  is n5ot Divisible by 3 and 5");
        }
    }
}