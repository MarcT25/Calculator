import java.util.Arrays;
import java.util.EmptyStackException;


public class ArrayStack<T> {
	
	//variables
	private T[] stack;        // Array of stack entries
	private int topIndex;    // Index of top entry
	private boolean initialized = false;
	private static final int DEFAULT_CAPACITY = 50;
	private static final int MAX_CAPACITY = 10000;
	
	
	//Constructors
	public ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public ArrayStack(int initialCapacity) {
		
		checkCapacity(initialCapacity);
		
		@SuppressWarnings("unchecked")
		T[] tempStack = (T[]) new Object[initialCapacity];
		stack = tempStack;
		topIndex = -1;
		initialized = true;
	}
	
	/**
	 * Adds a new entry to the top of the stack
	 * @param newEntry An object to be added to the stack
	 */
	public void push(T newEntry) {
		
		checkInitialization();
		ensuredCapacity();
		stack[topIndex + 1] = newEntry;
		topIndex++;
	}
	
	/**
	 * Retrieves this stack's top entry
	 * @return The object at the top of the stack
	 * @throws EmptyStackException if the stack is empty
	 */
	public T peek() {
		
		checkInitialization();
		if(isEmpty())
			throw new EmptyStackException();
		else
			return stack[topIndex];
	}
	
	/**
	 * Removes and returns a stack's top entry
	 * @return The object at the top of the stack
	 * @throws EmptyStackException if the stack is empty before the operation. 
	 */
	public T pop() {
		
		checkInitialization();
		
		if(isEmpty())
			throw new EmptyStackException();
		else {
			
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}
	}
	
	/**
	 * Detects whether the stack is empty
	 * @return True if the stack is empty
	 */
	public boolean isEmpty() {
		
		return topIndex < 0;
	}
	
	/**
	 * Removes all entry from the stack
	 */
	public void clear() {
		
		while(!isEmpty()) {
			stack[topIndex] = null;
			topIndex--;
		}
			
	}
	
	
	public String toString() {
		
		String str = "";
		
		for(int i = 0; i < topIndex + 1; i++) {
			str += stack[i] + ",";
		}
		
		return str;
	}
	
	
	/**
	 * checks if ArrayStack object has been initialized
	 */
	private void checkInitialization() {
		
		if(!initialized)
			throw new SecurityException("ArrayStack object is not initialized properly");
	}
	/**
	 * check if capacity is bigger than MAX_CAPACITY
	 * @param size new capacity
	 */
	private void checkCapacity(int size) {
		
		if(size > MAX_CAPACITY)
			throw new IllegalStateException("bigger than the maximun capacity");
	}
	
	/**
	 * checks if array is full. if full, double is size.
	 */
	private void ensuredCapacity() {
		
		if(topIndex == stack.length - 1) // if array is full, increase capacity
		{
			int newLength = 2 * stack.length;
			checkCapacity(newLength);
			stack = Arrays.copyOf(stack,newLength);
		}
	}

}

