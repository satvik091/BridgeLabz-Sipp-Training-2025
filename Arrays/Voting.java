import java.util.*;
class Eligibility 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
	System.out.println("Enter the age of all 10  Students: ");
        for (int i = 0; i < age.length; i++) 
	{
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) 
	{
            if (age[i] < 0) 
	    {
                System.out.println("Invalid age");
            } 
	    else if (age[i] >= 18) 
	    {
                System.out.println("The student with the age " + age[i] + " can vote");
            }
	    else 
	    {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }
    }
}