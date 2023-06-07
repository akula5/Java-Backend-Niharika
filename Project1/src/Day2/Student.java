package Day2;

public class Student {
    String Name="Niharika";
    public String getName() {
        return Name;
    }

    public String setName(String n) {
        Name = n;
        return Name;
    }
public static void main(String[] args)
{
    Student s = new Student();
    System.out.println(s.getName());
    System.out.println(s.setName("Niha"));
}
}
