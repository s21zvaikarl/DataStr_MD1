package datastr;

public class MyQueue<T> {
    private MyNodeQ<T> frontNode;
    private MyNodeQ<T> rearNode;
    private int length;

    public MyQueue() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isFull() {
    	try {
    		MyNodeQ<T> newNode = new MyNodeQ<T>(null);
		}catch (OutOfMemoryError e) {
			return true;
		}
		return false;
    }

    public boolean isEmpty() {
    	//queue is empty if there is no length
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void enqueue(T data) {
        MyNodeQ<T> newNode = new MyNodeQ<T>(data);
        //checking if empty
        if (isEmpty()) {
        	// frontnode is newnode if empty
            frontNode = newNode;
        } else {
        	//else rearnode will be newnode
            rearNode.setNext(newNode);
        }
        //rearnode is now newnode
        rearNode = newNode;
        //after that increase length
        length++;
    }

    public T dequeue() throws Exception {
    	//check if empty - throw exception
        if (isEmpty()) {
        	throw (new Exception("Queue is empty!"));
        }
        
        T data = frontNode.getValue();
        //next node is now front node
        frontNode = frontNode.getNext();
        //decrease length of queue
        length--;
        //check if queue is empty - erase rearnode
        if (isEmpty()) {
            rearNode = null;
        }
        return data;
    }

    public void printQueue() {
        MyNodeQ<T> currentNode = frontNode;
        while (currentNode != null) {
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        }
    }

    public void clearQueue() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }
}
