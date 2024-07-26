import java.util.*;

class find
{
    int max , min; 
    
    find(int mx, int mn)
    {
        max = mx;
        min = mn;
    }
}

class MaxMin
{
    public static void main (String args[])
    {
        int n;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();

        System.out.print ("Enter the terms of array: ");
        for (int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println ("****** ARRAY ******");
        for (int i=0;i<n; i++)
        {
            System.out.print (arr[i]+ " ");
        }

        find meow = new find(0, 0);
        
    }
}