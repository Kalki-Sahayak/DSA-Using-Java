import java.util.*;

class Stack
{
    public static  int top = 0;
    public static int stack[]= new int [100];

    static void push ()
    {
        Scanner sc = new Scanner(System.in);
        stack[top] = sc.nextInt();
        top++;
    }

    static void pop()
    {
        int popped = stack[--top];
        System.out.print ("The popped element is: "+ popped);
        System.out.println ();
    }

    static void display()
    {
        for (int i=0; i<top; i++)
        {
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }

    public static void main (String args[])
    {
        int wish;
        int ch;
        Scanner sc = new Scanner (System.in);
        do
        {
            System.out.println ("1. Push");
            System.out.println ("2. Pop");
            System.out.println ("3. Display");
            System.out.print ("Enter your choice: ");
            ch = sc.nextInt();
            switch  (ch)
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
                default:
                    System.out.println("Wrong Choice");
            }
            System.out.print ("Do you wnat to continue (1/0)? ");
            wish = sc.nextInt();
        }while (wish != 0);
    }
}