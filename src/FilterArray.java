import java.util.Scanner;

public class FilterArray {

    //Method to convert an array of integers to an array of even integers
    static int[] evenArray(int[] arr)
    {
        int size =arraySize(arr);
        int[] evenArr = new int[size];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[i]%2==0)
            {
                evenArr[j] = arr[i];
                j++;
            }


            if(j==evenArr.length)
                break;
        }
        return evenArr;
    }

    static int arraySize(int[] arr)
    {
        int size = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[i]%2==0)
                size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Your Array : ");

        for (int j:arr)
        {
            System.out.print(j+"  ");
        }

        System.out.println();

        int[] output = evenArray(arr);

        System.out.print("Filtered Array : ");

        for (int j:output)
        {
            System.out.print(j+"  ");
        }
    }
}
