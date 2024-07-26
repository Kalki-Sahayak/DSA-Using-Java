import java.util.*;

class Chain
{

    static void Matrix(int arr[], int N)
    {
        int n = N-1;
        int m[][] = new int[N][N];
        for (int i=1 ; i<=n ; i++)
        {
            m[i][i] = 0;
        }
        for (int l = 2; l<=n; l++)
        {
            for (int i = 1; i<=n-l+1; i++)
            {
                int j = i+l-1;
                m[i][j] = 99999;
                for (int k =i; k<j ; k++)
                {
                    int q = m[i][k] + m[k+1][j] + arr[i-1]*arr[k]*arr[j];
                    if (q<m[i][j])
                    {
                        m[i][j] = q;
                    }
                }
            }
        }
        System.out.print ("The minimum number of scalar multiplications required are: " + m[1][n]);
    }

    public static void main (String args[])
    {
        int n;
        int arr[]= new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        n = sc.nextInt();

        System.out.print("Enter the orders of matrices: ");
        for (int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        Matrix(arr,  n);
        sc.close();
    }
}