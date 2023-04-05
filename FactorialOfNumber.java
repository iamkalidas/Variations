package HefShine;
public class FactorialOfNumber
{
    public static void main(String[] args)
    {
        int number= 7;
        int ans = factorialOfNumber(number);
        System.out.println(ans);
    }

    private static int factorialOfNumber(int number)
    {
        int fact = 1;
        for (int i = 1; i < number; i++)
        {
            fact += fact*i;
        }
        return fact;
    }
}
