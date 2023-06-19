package Project1.src.Day1415;
import java.util.Arrays;
import java.util.List;

public class First_Stream
{
    public static void main(String[] args)
    {
        List<String> names= Arrays.asList("niharika","yasmin","koushika");
        List<String> data= names.stream().sorted().toList();
        data.forEach(n->System.out.println(n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase()));
    }
}