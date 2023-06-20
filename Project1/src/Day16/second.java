package Project1.src.Day16;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.AbstractList;

public class second {
    public static void main(String args[])
    {
        List<String> names = new ArrayList<String>();
        names.add("niharika");
        names.add("koushika");
        names.add("hello");
        names.add("yasmin");
        names.remove((names.size() -1));
        System.out.println(names);
    }
}
