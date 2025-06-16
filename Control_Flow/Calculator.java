import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("1st Number: ");
double a=sc.nextDouble();
System.out.println("2nd Number");
double b=sc.nextDouble();

String s=sc.next();
switch(s){

case "+":
System.out.println("Addition is" + (a+b));
break;
case "-":
System.out.println("Subtraction is" + (a-b));
break;
case "*":
System.out.println("Multiplication is" + (a*b));
break;
case "/":
System.out.println("Division is" + (a/b));
break;
default:
System.out.println("Invalid Option");
}
}
}