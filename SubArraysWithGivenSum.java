package HefShine;
import java.util.*;

public class SubArraysWithGivenSum
{
    public static void main(String[] args)
    {
        int[] a = {10, 2, -2, -20, 10};
        int givenSum = -10;
        int count = 0;

        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                int sum = 0;
                ArrayList<Integer> al = new ArrayList<>();
                for (int k = i; k <= j; k++)
                {
                    al.add(a[k]);
                    sum += a[k];
                }
                if (sum == givenSum)
                {
                    System.out.println(al);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
