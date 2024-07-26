import java.util.*;

class sort
{
    static void bubble(int arr[], int n)
    {
        int i, j, temp;

        for (i=n-1; i>=1; i--)
        {
            for (j=1; j<=i; j++)
            {
                if (arr[j-1]>arr[j])
                {
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for (i =0; i<n; i++)
        System.out.print(arr[i]+ " ");
        System.out.println(" ");
    }

    static void insertion(int arr[], int n)
    {
        int i, j, temp;
        for (i = 1; i < n; i++) 
        {
            temp = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > temp) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        for (i =0; i<n; i++)
        System.out.print(arr[i]+ " ");
        System.out.println(" ");
    }

    static void selection(int arr[], int n)
    {
        int i,j,temp,minIndex;
        for (i = 0; i < n ; i++) 
        {
            minIndex = i;

            for (j = 1; j < n; j++) 
            {
                
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            // Swap arr[i] with the smallest element
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (i =0; i<n; i++)
        System.out.print(arr[i]+ " ");
        System.out.println(" ");
    }

    public static void main (String args[])
    {
        int n, i, ch;
        int arr[] = new int[100];
        String wish;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();
        do{
        System.out.print ("Enter the terms to be sorted: ");
        for (i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
            System.out.println ("1. Bubble sort");
            System.out.println ("2. Selection sort");
            System.out.println ("3. Insertion sort");
            System.out.print ("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1 -> bubble(arr, n);
                case 2 -> selection(arr, n);
                case 3 -> insertion(arr, n);
            }
            System.out.print ("Do you want to continue? (Y/N)");
            wish = sc.next();
        }while (!"N".equals(wish));

        sc.close();
    }
}