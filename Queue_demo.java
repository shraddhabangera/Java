import java.util.Scanner;

class QueueException extends Exception{
    public void Error()
    {
        System.out.println("Queue is full");
    }
}
class Queue{
    int front;
    int rear;
    int q[];
    Queue(int n){
        q=new int[n];
    }
    void insert(int ele) throws QueueException
    {
        if(rear==q.length)
        {
            throw new QueueException();
        }
        if(front==-1)
        front=0;
        q[rear++]=ele;
    }

    int delete()
    {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear)
        {
            ele=q[front];
            rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;
    }
    void display()
    {
        int i;
        if(front==-1)
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(i=front;i<rear;i++)
        System.out.println(q[i]+"\t");
    }
}
class Queue_demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Queue Limit");
        int size=sc.nextInt();
        Queue que=new Queue(size);
        try{
            while(true)
            {
                System.out.println("\nQUEUE OPERATIONS\n1.INSERT\n2.DELETE\n3.DISPLAY\n4.EXIT");
                System.out.println("Enter your Choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:System.out.println("Enter the elements to be inserted");
                            que.insert(sc.nextInt());
                            break;
                    case 2:System.out.println("Deleted Item from Queue is:"+que.delete());
                            break;
                    case 3:System.out.println("Queue ELements are:");
                            que.display();
                            break;
                    case 4:System.out.println("Exit");
                            return;
                }
            }
        }
        catch(QueueException e){
            e.Error();
        }
        // catch(ArrayIndexOutOfBoundsException exc){
        //     System.out.println("Index Out Of Bound");
        // }
        sc.close();
    }
}