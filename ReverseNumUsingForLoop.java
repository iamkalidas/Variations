package HefShine;
public class ReverseNumUsingForLoop
{
    public static void main(String[] args)
    {
        int num=103;
        myCode1(num);
    }
    private static void myCode1(int num)
    {
        int sum = 0;
        for (int i = num; i > 0; i = i / 10)
        {
            int rem = i % 10;
            sum = sum * 10 + rem;
        }
        System.out.println(sum);
    }
}