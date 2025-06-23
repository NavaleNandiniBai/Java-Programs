import java.util.*;
public class FindingPositiveOrNegative {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>=0){
            System.out.println(num+" is Positive Number");
        }
        else{
            System.out.println(num+" is Negative Number");
        }
    }
    
}
