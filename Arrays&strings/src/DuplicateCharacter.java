import java.util.Scanner;
import java.lang.String;

public class DuplicateCharacter {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String str = sc.nextLine();
        System.out.println(duplicateCheck(str));

    }
    public static boolean duplicateCheck(String str)
    {
        if(str.length() > 128)
            return true;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if(!char_set[val])
                return false;
            else
                char_set[val] = false;
        }
     return false;
    }

}
