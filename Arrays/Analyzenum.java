import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) 
	{
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
	{
            if (arr[i] > 0) 
	    {
                if (arr[i] % 2 == 0) 
		{
                    System.out.println(arr[i] + " is positive and even");
                } 
		else 
		{
                    System.out.println(arr[i] + " is positive and odd");
                }
            } 
	    else if (arr[i] < 0) 
	    {
                System.out.println(arr[i] + " is negative");
            } 
	    else 
	    {
                System.out.println(arr[i] + " is zero");
            }
        }
        if (arr[0] == arr[4]) 
	{
            System.out.println("First and last elements are equal");
        }
	else if (arr[0] > arr[4]) 
	{
            System.out.println("First element is greater than last");
        } 
	else 
	{
            System.out.println("First element is less than last");
        }
    }
}