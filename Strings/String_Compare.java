import java.util.*;
class String_Compare
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean manual = compare(str1, str2);
        boolean builtIn = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + manual);
        System.out.println("Comparison using equals(): " + builtIn);
    }

    public static boolean compare(String s1, String s2)
    {
        if (s1.length() != s2.length()) 
        {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) 
        {
            if (s1.charAt(i) != s2.charAt(i)) 
            {
                return false;
            }
        }
        return true;
    }
}
