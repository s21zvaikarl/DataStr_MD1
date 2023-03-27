package datastr;

public class MyNodeD<T> {
	private T value;
	private MyNodeD<T> next = null;
	private MyNodeD<T> previous = null;
	
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


	public MyNodeD<T> getNext() {
		return next;
	}

	public void setNext(MyNodeD<T> next) {
		this.next = next;
	}

	public MyNodeD<T> getPrevious() {
		return previous;
	}

	public void setPrevious(MyNodeD<T> previous) {
		this.previous = previous;
	}

	public MyNodeD(T inputElement)
	{
		setValue(inputElement);
	}
	
	public MyNodeD() {
		setValue(null);
		setNext(null);
		setPrevious(null);
	}
	
	public MyNodeD(T element, MyNodeD<T> next, MyNodeD<T> previous) {
		setValue(element);
		setNext(next);
		setPrevious(previous);
	}

	public String toString()
	{
		return "" + value;
	}
}
