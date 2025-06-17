import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st Number: ");
int a=sc.nextInt();
System.out.println("Enter 2nd Number: ");
int b=sc.nextInt();
System.out.println("Enter 3rd Number: ");
int c=sc.nextInt();


if(a<b && a<c){
System.out.println("Is the first number the smallest? "+true);
}
else System.out.println(" Is the first number the smallest? "+ false);
}
}