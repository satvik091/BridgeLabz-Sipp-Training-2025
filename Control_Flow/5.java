import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a<=0) System.out.print("The number "+a+" is not a natural number.");

else{
int sum=(a*(a+1))/2;
System.out.print("The sum of "+a+" natural numbers is "+sum);
}
}
}