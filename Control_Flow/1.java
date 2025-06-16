import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int i=0;
int c=0;
if(a>0){
while(i<=a){
c+=i;
i++;
}
System.out.print(c);

int f=(a*(a+1))/2;
System.out.print("Sum of N using loop: "+c+" using formula: "+f);
}
}
}