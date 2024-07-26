import java.util.Scanner;

class LinearQueue
{
    public static int front= 0, rear =0 , max;
    public static int queue[] = new int[100];

    static void push ()
    {
        Scanner sc = new Scanner (System.in);
        
        if (rear == max)
        {
            System.out.println ("OVERFLOW");
        }
        else
        {
            queue [rear] = sc.nextInt();
            rear = rear+1;
        }
    }

    static void pop()
    {
       
        queue[front] = 0;
        if (front != max)
        {
            front = front+1;
        }
        else{
            System.out.println("UNDERFLOW");
        }
    }

    static void display()
    {
        for (int i =0; i<max ;i++)
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) 
    {
        int ch, wish;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the queue size: ");
        max = sc.nextInt();
        
        do
        {        
            System.out.println ("1. Push (ANY NUMBER EXCEPT 0)");
            System.out.println ("2. Pop");
            System.out.println ("3. Display");
            System.out.print ("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
            }
            System.out.print ("Do you want to continue (1/0)? ");
            wish = sc.nextInt();
        }while (wish!=0);
    }
}