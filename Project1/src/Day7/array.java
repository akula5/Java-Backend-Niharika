package Project1.src.Day7;

public class array
{
    public static void main(String[] args) {
        int i, j;
        int largest=0;
        int arr[] = {7,4,5,2,1};
        for (i = 0; i <arr.length-1; i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    largest = arr[i];
                    arr[i]=arr[j];
                    arr[j]=largest;
                }
            }
        }

        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
}
