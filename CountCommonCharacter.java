package HefShine;
import java.util.*;

public class CountCommonCharacter
{
    public static void main(String[] args)
    {
        String s1 = "abcd";
        String s2 = "aad";

        int count = 0;
        ArrayList<Character> a1 = new ArrayList<Character>();
        ArrayList<Character> a2 = new ArrayList<Character>();

        for (int i = 0; i < s1.length(); i++)
            a1.add(s1.charAt(i));
        System.out.println(a1);

        for (int i = 0; i < s2.length(); i++)
            a2.add(s2.charAt(i));
        System.out.println(a2);

        for (int i = 0; i < a1.size(); i++)
        {
            for (int j = 0; j < a2.size(); j++)
            {
                if (a1.get(i).equals(a2.get(j)))
                {
                    a2.remove(j);
                    a1.remove(i);
                    i--;
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
