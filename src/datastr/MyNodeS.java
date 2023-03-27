package datastr;

public class MyNodeS<T> {
	private T value;
	private MyNodeS<T> next = null;
	private MyNodeS<T> previous = null;
	
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


	public MyNodeS<T> getNext() {
		return next;
	}

	public void setNext(MyNodeS<T> next) {
		this.next = next;
	}

	public MyNodeS<T> getPrevious() {
		return previous;
	}

	public void setPrevious(MyNodeS<T> previous) {
		this.previous = previous;
	}

	public MyNodeS(T inputElement)
	{
		setValue(inputElement);
	}
	
	public MyNodeS() {
		setValue(null);
		setNext(null);
		setPrevious(null);
	}
	
	public MyNodeS(T element, MyNodeS<T> next, MyNodeS<T> previous) {
		setValue(element);
		setNext(next);
		setPrevious(previous);
	}

	public String toString()
	{
		return "" + value;
	}
}
