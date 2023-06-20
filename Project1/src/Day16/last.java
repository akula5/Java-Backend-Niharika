package Project1.src.Day16;

import java.util.ArrayList;

public class last {
    public static void main(String args[])
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("niharika");
        name.add("hello");
        name.add("welcome");
        name.add("Java");
        String[] s = new String[name.size()];
        for (String i : name) {
            System.out.println(i);
        }
    }
}
