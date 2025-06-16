import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int mul=1;
while(a>1){
mul*=a;
a--;
}
System.out.print("Factorial is :"+ mul);
}
}