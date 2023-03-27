package datastr;

public class MyNodeQ<T> {
	private T value;
	private MyNodeQ<T> next = null;
	private MyNodeQ<T> previous = null;
	
	public T getValue() {
		return value;
	}

	public void setValue(T inputElement) {
		if(inputElement != null) {
			value = inputElement;
		}
		else
		{
			value = (T) new Object();
		}
	}


	public MyNodeQ<T> getNext() {
		return next;
	}

	public void setNext(MyNodeQ<T> next) {
		this.next = next;
	}

	public MyNodeQ<T> getPrevious() {
		return previous;
	}

	public void setPrevious(MyNodeQ<T> previous) {
		this.previous = previous;
	}

	public MyNodeQ(T inputElement)
	{
		setValue(inputElement);
	}
	
	public MyNodeQ() {
		setValue(null);
		setNext(null);
		setPrevious(null);
	}
	
	public MyNodeQ(T element, MyNodeQ<T> next, MyNodeQ<T> previous) {
		setValue(element);
		setNext(next);
		setPrevious(previous);
	}

	public String toString()
	{
		return "" + value;
	}
}
