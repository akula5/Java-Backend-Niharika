package Project1.src.Day6;

import java.util.Scanner;

public class Fibonacci
{
    int res=0;
    int number1=0;
    int number2=1;
    public void fibonacci(int number)
    {
        System.out.print("Fibonacci Series upto "+number+"th series"+"\t");
        for(int i=1;i<=number;i++)
        {
            res = number1+number2;
            System.out.print(number1+"\t");
            number1=number2;
            number2=res;;
        }

    }
    public static void main(String[] args)
    {
        Fibonacci fs = new Fibonacci();
        //.fibonacci(10);
        System.out.print("Enter Nth term: "+"\t");
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        fs.fibonacci(b);
    }
}