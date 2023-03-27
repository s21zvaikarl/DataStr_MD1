package Service;

import datastr.MyStack;
import datastr.MyQueue;
import datastr.MyDeque;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		try
		{
		//skaitliska tipa elementi
		MyStack<Integer> intStack = new MyStack();
		
		System.out.println("~~~~~~~~~~~~~~~MyStack~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~intStack~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~push 4 elements~~~~~~~~~~~~~~~~~~");
		intStack.push(4);
		intStack.push(6);
		intStack.push(12);
		intStack.push(16);
		intStack.printStack(); // 4, 6, 12, 16
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intStack.size());
		//intStack.push(55); // throws exception
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intStack.isFull());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intStack.isEmpty());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~pop()~~~~~~~~~~~~~~~~~~~~~~");
		intStack.pop(); //removes 16
		intStack.printStack(); //4, 6, 12
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~top()~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intStack.top()); //12
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		intStack.clearStack();
		intStack.printStack();
		
		//Students tipa elementi
		System.out.println("~~~~~~~~~~~~~~~~~~Students~~~~~~~~~~~~~~~~~~~~~~~~");
		MyStack<Student> studentStack = new MyStack();
		
		Student student1 = new Student("Karlis", "Zvaigzne", new int[]{5, 6, 7});
		Student student2 = new Student("Elza", "Pliekšāne", new int[]{9, 10, 8});
		Student student3 = new Student("Jānis", "Pliekšāns", new int[]{9, 6, 10});
		Student student4 = new Student("Vilis", "Plūdons", new int[]{4, 3, 9});
		
		studentStack.push(student1);
		studentStack.push(student2);
		studentStack.push(student3);
		studentStack.push(student4);
		
		System.out.println("~~~~~~~~~~~~~~~push 4 students~~~~~~~~~~~~~~~~~~");
		studentStack.printStack();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentStack.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentStack.isFull()); 
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentStack.isEmpty()); 
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~pop()~~~~~~~~~~~~~~~~~~~~~~");
		studentStack.pop(); 
		studentStack.printStack(); 
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~top()~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentStack.top()); 
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		studentStack.clearStack();
		studentStack.printStack();
		
		
		
		//MyQueue
		System.out.println("\n~~~~~~~~~~~~~~~~~MyQueue~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~intQueue~~~~~~~~~~~~~~~~~");
		//int
		MyQueue<Integer> intQueue = new MyQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intQueue.isFull());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intQueue.isEmpty());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~enqueue() 4 elements~~~~~~~~~~~~~~~~~~~~~");
		intQueue.enqueue(5);
		intQueue.enqueue(7);
		intQueue.enqueue(30);
		intQueue.enqueue(2);
		intQueue.printQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeue()~~~~~~~~~~~~~~~~~~~~~");
		intQueue.dequeue();
		intQueue.printQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intQueue.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		intQueue.clearQueue();
		intQueue.printQueue();
		
		//students
		System.out.println("\n~~~~~~~~~~~~~~~~~Students~~~~~~~~~~~~~~~~~");
		
		MyQueue<Student> studentQueue = new MyQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentQueue.isFull());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentQueue.isEmpty());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~enqueue() 4 elements~~~~~~~~~~~~~~~~~~~~~");
		studentQueue.enqueue(student1);
		studentQueue.enqueue(student2);
		studentQueue.enqueue(student3);
		studentQueue.enqueue(student4);
		studentQueue.printQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeue()~~~~~~~~~~~~~~~~~~~~~");
		studentQueue.dequeue();
		studentQueue.printQueue();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentQueue.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		studentQueue.clearQueue();
		studentQueue.printQueue();
		
		
		//MyDeque
		System.out.println("\n~~~~~~~~~~~~~~~~~MyDeque~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~intDeque~~~~~~~~~~~~~~~~~");
		//int
		MyDeque<Integer> intDeque = new MyDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intDeque.isFull());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intDeque.isEmpty());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~enqueueAtFront() & enqueAtEnd()~~~~~~~~~~~~~~~~~~~~~");
		intDeque.enqueueAtFront(5);//5
		intDeque.enqueueAtEnd(7);//5, 7
		intDeque.enqueueAtEnd(30);//5, 7, 30
		intDeque.enqueueAtFront(2);//2, 5, 7, 30
		intDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeueFromFront()~~~~~~~~~~~~~~~~~~~~~");
		intDeque.dequeueFromFront();//5 7 30
		intDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeueFromEnd()~~~~~~~~~~~~~~~~~~~~~");
		intDeque.dequeueFromEnd();//5 7
		intDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(intDeque.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		intDeque.clearDeque();
		intDeque.printDeque();
		
		//students
		System.out.println("~~~~~~~~~~~~~~~~~studentDeque~~~~~~~~~~~~~~~~~");
		//int
		MyDeque<Student> studentDeque = new MyDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isFull~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentDeque.isFull());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~isEmpty~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentDeque.isEmpty());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~enqueueAtFront() & enqueAtEnd()~~~~~~~~~~~~~~~~~~~~~");
		studentDeque.enqueueAtFront(student1);//
		studentDeque.enqueueAtEnd(student2);//
		studentDeque.enqueueAtEnd(student3);
		studentDeque.enqueueAtFront(student4);
		studentDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeueFromFront()~~~~~~~~~~~~~~~~~~~~~");
		studentDeque.dequeueFromFront();
		studentDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~dequeueFromEnd()~~~~~~~~~~~~~~~~~~~~~");
		studentDeque.dequeueFromEnd();
		studentDeque.printDeque();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~size()~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(studentDeque.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~clear()~~~~~~~~~~~~~~~~~~~~~~");
		studentDeque.clearDeque();
		studentDeque.printDeque();
		
		
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}