import java.util.*;
public class TypesOfTraingle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c){
            System.out.println("Equilateral Traingle");
        }
        else if((a==b && c!=b) || (a==c && b!=a)){
            System.out.println("Isosceles Traingle");
        }
        else {
            System.out.println("Scalar Traingle");
        }
    }
    
}
