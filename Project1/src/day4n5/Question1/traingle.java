package Project1.src.day4n5.Question1;

public class traingle implements Interface1,Interface2
{
    public double Area(int b, int h) {
    return (0.5 * b * h);
}

    public int Perimeter(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        traingle t = new traingle();
        System.out.println("Area of triangle: " + t.Area(5, 5));
        System.out.println("Perimeter of Triangle: " + t.Perimeter(2,3,4));
    }
}
