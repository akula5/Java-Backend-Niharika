package Project1.src.Day11;

import java.util.*;

public class String2Int {
    public static void stringtoint(String s2) {
        try {
            int number = Integer.parseInt(s2);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Given String cannot be converted into Integer");
        }
    }
    public static void main(String[] args)
    {

        stringtoint("23");
        stringtoint("45.67");
        stringtoint("test");
        stringtoint("21f");

    }
}