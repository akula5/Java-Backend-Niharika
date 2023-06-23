package Project1.src.Day18;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset_Creation
{
    public static void main(String[] args)
    {
        HashSet<String> names = new HashSet<String>();
        names.add("Niharika");
        names.add("Sindhu");
        names.add("Akula");
        names.add("Viratkohli");
        names.add("Prabhas");
        names.add("Vinay");
        names.add("Teju");
        names.add("Divi");
        names.add("Java");
        names.add("Laptop");
        System.out.println(names);
        Iterator <String> itr = names.iterator();
        System.out.println("Printing names using iterator: ");
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println("\n"+"printing names using ForEach Loop: ");
        names.forEach(name->System.out.print(name+" "));
        System.out.println("\n"+"Printing names using Streams ForEach is: ");
        names.stream().forEach(name->System.out.print(name+" "));
    }
}