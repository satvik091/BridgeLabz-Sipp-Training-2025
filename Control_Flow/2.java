import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double t=0;
while(true){
double sum=sc.nextDouble();
if(sum<=0){
break;
}
t+=sum;
}
System.out.print("Sum is : "+t);
}
}