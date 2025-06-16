import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Weight(in kgs)");
double a=sc.nextDouble();
System.out.println("Height(in m)");
double b=sc.nextDouble();

double bmi=(a)/(b*b);
if(bmi>=40.0)System.out.println("BMI is :"+bmi+" and Status is Obese.");
else if(bmi<40.0 && bmi>=25.0)System.out.println("BMI is :"+bmi+" and Status is Overweight.");
else if(bmi<25.0 && bmi>=18.5)System.out.println("BMI is :"+bmi+" and Status is Normal.");
else if(bmi<=18.4)System.out.println("BMI is :"+bmi+" and Status is Underweight.");

}
}