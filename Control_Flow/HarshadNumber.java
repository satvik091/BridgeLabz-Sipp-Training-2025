import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=a;
int s=0;
while(a>0){
s=s+(a%10);
a/=10;
}
if(b%s==0) System.out.println("Harshad Number");
else System.out.println("Not an Harshad Number");
}
}