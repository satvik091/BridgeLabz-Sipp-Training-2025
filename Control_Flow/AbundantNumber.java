import java.util.*;

class Main{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

int a=0;
int i=1;
int s=0;
while(i<n){
if(n%i == 0) s+=i;
i++;
}
if(s>n) System.out.println("Abundant Number");
else System.out.println("Not an Abundant Number");
} 
}
