import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Physics Marks");
int a=sc.nextInt();
System.out.println("Maths Marks");
int b=sc.nextInt();
System.out.println("Chem Marks");
int c=sc.nextInt();

int perc=((a+b+c)/3);
if(perc>80 || perc==80)System.out.println("Percentage is :"+perc+" and grade is A. He/She is Level-4 Student.");
else if(perc<80 && perc>=70)System.out.println("Percentage is :"+perc+" and grade is B. He/She is Level-3 Student.");
else if(perc<70 && perc>=60)System.out.println("Percentage is :"+perc+" and grade is C. He/She is Level-2 Student.");
else if(perc<60 && perc>=50)System.out.println("Percentage is :"+perc+" and grade is D. He/She is Level-1 Student.");
else if(perc<50 && perc>=40)System.out.println("Percentage is :"+perc+" and grade is E. He/She is Level-1 Student.");
else if(perc<=39)System.out.println("Percentage is :"+perc+" and grade is R. HE/she required Remedial Classes.");

}
}