import java.util.*;
class String_Length
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = getLength(input);
        int builtinLength = input.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtinLength);
    }

    public static int getLength(String str)
    {
        int count = 0;
        try
        {
            while (true)
            {
                str.charAt(count);
                count++;
            }
        }
        catch (Exception e)
        {
            return count;
        }
    }
}
