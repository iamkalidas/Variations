package HefShine;
import java.util.Scanner;

public class ScannerClass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int sum=num+num2;
        System.out.println("Sum : "+sum);
    }
}
