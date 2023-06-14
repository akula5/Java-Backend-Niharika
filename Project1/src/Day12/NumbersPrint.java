package Project1.src.Day12;
import java.io.*;

public class NumbersPrint implements Runnable{
    public static void main(String args[])
    {
        NumbersPrint n = new NumbersPrint();
        Runnable NumbersPrint;
        Thread t = new Thread(n, "Printing Numbers");
        t.start();
        System.out.println(t.getName());
    }
    @Override
    public void run() {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i + "\t");
        }
    }
}
