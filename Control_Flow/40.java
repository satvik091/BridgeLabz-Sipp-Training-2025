import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int c=0;
while(a>0){
c+=1;
a/=10;
}
System.out.print("No. of digits of "+a+" is "+c);
}
}