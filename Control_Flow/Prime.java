import java.util.*;

class Main{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
int c=0;
while(i<n){
if(n%i ==0) c+=1;
i++;
}
if(c>2) System.out.println("Not an Prime Number");
else System.out.println("Prime Number");
} 
}
