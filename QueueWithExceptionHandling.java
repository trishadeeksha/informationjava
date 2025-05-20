// Custom exception for queue overflow
class QueueOverflowException extends Exception {
    public QueueOverflowException(String message) {
        super(message);
    }
}

// Custom exception for queue underflow
class QueueUnderflowException extends Exception {
    public QueueUnderflowException(String message) {
        super(message);
    }
}

// Queue implementation
class Queue {
    private int[] queue;
    private int front, rear, size, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity]; // ✅ Fixed: Initialize the array
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int data) throws QueueOverflowException {
        if (size == capacity) {
            throw new QueueOverflowException("Queue overflow: cannot insert " + data);
        }
        rear = (
