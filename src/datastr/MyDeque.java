package datastr;

public class MyDeque<T> {

    private MyNodeD<T> frontNode;
    private MyNodeD<T> rearNode;
    private int length;

    public MyDeque() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }

    public boolean isFull() {
    	try {
    		MyNodeQ<T> newNode = new MyNodeQ<T>(null);
		} 
    	catch(OutOfMemoryError e) {
    		return true;
		}
		return false;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int size() {
        return length;
    }

    public void enqueueAtFront(T value) {
    	//create new node
        MyNodeD<T> newNode = new MyNodeD<>(value);
        //check if empty - front and rear then are newnode
        if (isEmpty()) {
            frontNode = newNode;
            rearNode = newNode;
        } 
        //else its not empty and front node is decleared as new node
        else {
            newNode.setNext(frontNode);
            frontNode.setPrevious(newNode);
            frontNode = newNode;
        }
        //after increase length of queue
        length++;
    }

    public void enqueueAtEnd(T value) {
        MyNodeD<T> newNode = new MyNodeD<>(value);
        //check if empty - front and rear then are newnode because they are the same one
        if (isEmpty()) {
            frontNode = newNode;
            rearNode = newNode;
        }
        //else its not empty and rear node is newnode
        else {
            newNode.setPrevious(rearNode);
            rearNode.setNext(newNode);
            rearNode = newNode;
        }
        length++;
    }

    public T dequeueFromFront() throws Exception {
        //check if empty, cant dequeue empty queue
    	if (isEmpty()) {
        	throw (new Exception("Deque is empty!"));
        }
    	//remove front node
        T value = frontNode.getValue();
        //check if front and rear are one, then dequeue both
        if (frontNode == rearNode) {
            frontNode = null;
            rearNode = null;
        } 
        //else only remove front node
        else {
            frontNode = frontNode.getNext();
            frontNode.setPrevious(null);
        }
        //decrease length of queue
        length--;
        return value;
    }

    public T dequeueFromEnd() throws Exception {
        //check if empty
    	if (isEmpty()) {
        	throw (new Exception("Deque is empty!"));
        }
        T value = rearNode.getValue();
        //check if front and rear are the same
        if (frontNode == rearNode) {
            frontNode = null;
            rearNode = null;
        } 
        //else dequue rear node
        else {
            rearNode = rearNode.getPrevious();
            rearNode.setNext(null);
        }
        //decrease length
        length--;
        return value;
    }

    public void printDeque() {
        MyNodeD<T> current = frontNode;
        while (current != null) {
            System.out.print(current.toString() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void clearDeque() {
        frontNode = null;
        rearNode = null;
        length = 0;
    }
}