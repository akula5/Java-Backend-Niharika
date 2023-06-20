package Project1.src.Day16;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class traverse {
    public static void main(String args[])
    {
        List<String> names= Arrays.asList("niharika","yasmin","koushika");
        System.out.println("Using For loop: ");
        for(int i=0;i< names.size();i++)
        {
            System.out.println(names.get(i));
        }
        System.out.println("Using Enhanced For loop: ");
        for(String name : names)
        {
            System.out.println(name);
        }
        Iterator<String> namesIterator = names.iterator();
        System.out.println("Using Iterator: ");
        while(namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }
        System.out.println("Using forEach: ");
        names.forEach(System.out::println);
        System.out.println("Using Parallel Stream");
        names
                .parallelStream()
                .forEach(
                        n -> {
                            System.out.println(n);
                        });
    }
}
