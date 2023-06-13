package Project1.src.day4n5.Question4;

final class calculator
{
    protected final int number1=10;
    int number2;


    protected final int sub(int number2) {
        this.number2 = number2;
        return number1 - number2;
    }


    public static void main(String[] args)
    {
        calculator c = new calculator();
        System.out.println("Subtraction of Number1 and Number 2 is : "+c.sub(5));

    }
}
