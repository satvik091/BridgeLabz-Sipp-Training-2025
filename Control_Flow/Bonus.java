import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Salary: ");
int a=sc.nextInt();
System.out.println("Enter Your Salary Experience: ");
int b=sc.nextInt();

if(b>=5){
int bonus=(5*a)/100;
System.out.println("Bonus Amount is : "+bonus);
}
else System.out.println("No Bonus Due to less Experience..");
}
}