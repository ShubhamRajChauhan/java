
public class MakingDynamicQueue {
    private int data[];
    private int front; //index of element at the front of the queue
    private int rear; //index of element at the rear of the queue
    private int size;

    public MakingDynamicQueue() {
        data = new int[5];
        front = -1;
        rear = -1;
    }
    public MakingDynamicQueue(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
    }

    //size
    public int size() {  //0(1)
        return size;
    }

    //isEmpty
    public boolean isEmpty() {  //0(1)
        return size == 0;
    }

    //enqueue
    public void enqueue(int elem) {  //0(1)
        if(size == data.length){
            // System.out.println("Queue is full");
            // return;
            doubleCapacity();
        }
        if(size == 0){
            front = 0;
        }
 /*
        rear++;
        if(rear == data.length) {
            rear = 0;
        }
*/      //or
        rear = (rear + 1) % data.length;

        data[rear] = elem;
        size++;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        int index = 0;
        for(int i = front; i<temp.length; i++){
            data[index++] = temp[i];
        }
        for(int i = 0; i<front-1; i++){
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length-1;
    }

    //front
    public int front() {  //0(1)
        if(size == 0){
            System.out.println("Queue is empty");
            return -1; 
        }
        return data[front];
    }

    //dequeue
    public int dequeue() {  //0(1)
        if(size == 0){
            System.out.println("Queue is empty");
            return -1; 
        }
        int temp = data[front];
/* 
        front++;
        if(front == data.length){
            front = 0;
        }
*/      //or
        front = (front + 1) % data.length;

        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public static void main(String[] args) {
        MakingDynamicQueue q = new MakingDynamicQueue(3);
        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.enqueue(40);

        //or
        int arr[] = {10,20,30,40,50};
        for(int elem : arr){
            q.enqueue(elem);
        }

        while (!q.isEmpty()) {
            System.out.println(q.front());
            q.dequeue();
        }
    }
}
