class QueueOverflowException extends Exception
{
public QueueOverflowException(String message)
{
super(message);
}
}
class QueueUnderflowException extends Exception
{
public QueueUnderflowException(String message)
{
super(message);
}
}
class Queue
{
private int[] queue;
private int front,rear,size,capacity;
public Queue(int capacity)
{
this.capacity=capacity;
front=0;
rear=-1;
size=0;
}
public void enqueue(int data)throws QueueOverflowException
{
if(size==capacity)
{
throw new QueueOverflowException("Queue overflow:cannot insert"+data);
}
rear=(rear+1)%capacity;
queue[rear]=data;
size++;
System.out.println("Enqueued:"+data);
}
public int dequeue()throws QueueUnderflowException
{
if(size==0)
{
throw new QueueUnderflowException("QueueUnderflow:cannot dequeue");
}
int data=queue[front];
front=(front+1)%capacity;
size--;
System.out.println("Dqueued:"+data);
return data;
}
public void display()
{
System.out.println("Queue:");
for(int i=0; i<size; i++)
{
int index=(front+i)%capacity;
System.out.print(queue[index]+" ");
}
System.out.println();
}
}
public class QueueWithExceptionHandlings
{
public static void main(String[]args)
{
Queue q=new Queue(3);
try
{
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.display();
q.enqueue(40);
}
catch(QueueOverflowException e)
{
System.out.println(e.getMessage());
}
try
{
q.dequeue();
q.dequeue();
q.dequeue();
q.display();
q.dequeue();
}
catch(QueueUnderflowException e)
{
System.out.println(e.getMessage());
}
}
}