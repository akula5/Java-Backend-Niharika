package Project1.src.Day2;
public class person {
        int height;
        int weight;
        public void calculateBMI()
        {
            float BMI= weight/(height*height);
            System.out.println(BMI);
        }
        public void walk()
        {
            System.out.println("Day2.Person is walking");
        }
    }

