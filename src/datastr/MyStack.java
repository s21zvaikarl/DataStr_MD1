package datastr;

public class MyStack<T> {
	  private MyNodeS<T> topNode;
	  private int length;

	  public MyStack() {
		  topNode = null;
		  length = 0;
	  }

	  public boolean isFull() {
		  //if OutOfMemoryError exception: is true, else false
		  try {
			  MyNodeS<T> newNode = new MyNodeS<T>(null);
		  } catch (OutOfMemoryError e) {
			  return true;
		  }
		  return false;
	  }

	  public boolean isEmpty() {
		  //if topNode is empty, stack is empty
		  return (topNode == null);
	  }

	  public int size() {
		  return length;
	  }

	  public void push(T value) throws Exception {
		  //check if stack is full, throw exception
		  if (isFull()) {
			  throw (new Exception("Stack is full!"));
		  }
		  //create new node at topnode
		  MyNodeS<T> node = new MyNodeS<T>(value);
		  node.setNext(topNode);
		  topNode = node;
		  //increase length
		  length++;
	  }

	  public T pop() throws Exception {
		  //check if stack is empty
		  if (isEmpty()) {
			  throw (new Exception("Stack is empty!"));
		  }
		  //push next node to nodes place and decrease length of stack
		  T value = topNode.getValue();
		  topNode = topNode.getNext();
		  length--;
		  return value;
	  }

	  public T top() throws Exception {
		  //check if empty, no top node in empty stack
		  if (isEmpty()) {
			  throw (new Exception("Stack is empty!"));
		  }
		  //return the value of topnode
		  return topNode.getValue();
	  }

	  public void printStack() {
		  MyNodeS<T> currentNode = topNode;
		  while (currentNode != null) {
			  System.out.print(currentNode.getValue() + " ");
			  currentNode = currentNode.getNext();
		  }
		  System.out.println();
	  }

	  public void clearStack() {
		  topNode = null;
		  length = 0;
	  }
}
	  
