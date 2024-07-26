
import java.util.*;

class mer2
{
    public void merge (int arr[], int mid, int lb, int ub)
    {
        int b[] = new int[100];
        int i  = lb, j = mid+1, k=lb;
        while (i<=mid && j<=ub)
        {
            if (arr[i]> arr[j])
            {
                b[k] = arr[j];
                j++;
            }
            else
            {
                b[k] = arr[i];
                i++;
            }
            k++;
        }
        while (i<=mid)
        {
            b[k] = arr[i];
            k++;
            i++;
        }
	
        while (j<= ub)
        {
            b[k] = arr[j];
            k++;
            j++;
        }

        k = lb;
        while (k<= ub)
        {
            arr[k] = b[k];
            k++;
        }
    }
}

class mer1
{
    public void mergesort(int arr[], int lb, int ub)
    {
        mer2 conquer =new mer2();
        if (lb<ub)
        {
            int mid = (lb+ub)/2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid+1, ub);
            conquer.merge(arr, mid, lb, ub);
        }
    }
}

public class Mergesort 
{
    public static void main(String[] args) 
    {
        int n;
        int arr[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();

        System.out.println("Enter the array elements");
        for (int i=0; i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("***** ORIGINAL ARRAY *****");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n");

        if (n == 1)
        {
            System.out.println("***** SORTED ARRAY *****");
            System.out.println(arr[0]);
        }

        else if (n == 2)
        {
            if (arr[0]>arr[1])
            {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] =temp;

                System.out.println("***** SORTED ARRAY ******");
                System.out.println(arr[0]+ "  "+ arr[1]);
            }
            else
            {
                System.out.println("***** SORTED ARRAY ******");
                System.out.println(arr[0]+ "  "+ arr[1]);
            }
        }
        else
        {
            mer1 divide = new mer1();
            divide.mergesort(arr, 0, n-1);

            System.out.println("***** SORTED ARRAY *****");
            for (int i=0; i<n; i++)
            {
                System.out.print(arr[i] + "  ");
            }
        }
        sc.close();
    }
}
