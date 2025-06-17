import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Number: ");
int a=sc.nextInt();

if(a%5==0){
System.out.println("Is the number "+a+" divisible by 5?"+true);
}
else System.out.println("Is the number "+a+" divisible by 5?"+false);
}
}