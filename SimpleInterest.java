package HefShine;

public class SimpleInterest
{
    public static void main(String[] args) {
        double amount = 10000;
        double interestRate = 0.05;
        double years = 10;
        double interest = MyInterest(amount, interestRate, years);
        System.out.print("The interest is " + interest);
    }

    private static double MyInterest(double amount, double interestRate, double years)
    {
        return amount * (interestRate / 100) * years;
    }
}
