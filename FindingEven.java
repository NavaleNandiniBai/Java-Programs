import java.util.*;
public class FindingEven {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println(n+"is an Even number");
        }
        else{
            System.out.println(n+" is not an Even number");
        }
        
    }

}
