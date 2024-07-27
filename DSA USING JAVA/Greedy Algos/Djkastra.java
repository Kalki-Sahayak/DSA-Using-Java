import java.util.*;

class Djkastra
{
    public static int g[][] = new int[100][100];

    public static void Djkastra (int n, int src)
    {
        int visited[] = new int [100];
        int dist[] = new int [100];
        int min, minindex;

        for (int i=0; i<n;i++)
        {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = 0;
        }

        dist[src] = 0;

        for (int i=0; i<n; i++)
        {
            min = Integer.MAX_VALUE;
            minindex = -1;
            for (int v=0; v<n ;v++)
            {
                if (visited[v] == 0 && dist[v] <= min)
                {
                    min = dist[v];
                    minindex = v;
                }
            }
            visited[minindex] = 1;

            for (int v=0; v<n; v++)
            {
                if (g[minindex][v] != 0 && visited[v] == 0 &&
                    dist[minindex] != Integer.MAX_VALUE &&
                    dist[minindex]+g[minindex][v] < dist[v])
                {
                    dist[v] = dist[minindex] + g[minindex][v];
                }
            }
        }
        System.out.println("Vertex\t Distance from source");
	    for (int i=0; i<n;i++)
		    System.out.println(i+"\t\t"+dist[i]);
    }

    public static void main (String args[])
    {
        int n,src;
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter the number of vertices: ");
        n = sc.nextInt();

        for (int i=0; i<n; i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print ("Edge length between "+i+" and "+j+" is: ");
                g[i][j] = sc.nextInt();
            }
        }
        System.out.println ("The Adjacency Matrix is: ");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print (g[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Enter the starting vertex: ");
        src = sc.nextInt();

        Djkastra (n, src);
    }
}

/*
{0, 4, 0, 0, 0, 0},
{4, 0, 8, 0, 0, 0},
{0, 8, 0, 7, 0, 4},
{0, 0, 7, 0, 9, 14},
{0, 0, 0, 9, 0, 10},
{0, 0, 4, 14, 10, 0}*/