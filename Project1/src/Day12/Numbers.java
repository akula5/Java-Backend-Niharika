package Project1.src.Day12;

import java.io.*;
public class Numbers extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.print(i + "\t");
        }
    }
    public static void main(String args[])
    {
        Numbers n = new Numbers();
        n.start();
    }

}
