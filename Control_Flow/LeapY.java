import java.util.*;

class Main{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int year=sc.nextInt();

if((year>=1582 || (year%4)==0 || (year%400)==0)&&((year%100)!=0)) System.out.print("Leap Year");
else System.out.print("Not a Leap Year");

} 
}
