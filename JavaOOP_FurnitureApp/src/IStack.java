
public interface IStack{
	
	/* Adds a new entry to the top of this stack
	 * @param newEntry An object to be added to the stack*/
	public void push(Object newEntry);
	
	/* Removes and returns this stacks's top entry.
	 * @return The object at the top of the stack.*/
	public Object pop();
	 
	 /* Retrieves this stacks's top entry.
	  * @return the object at the top of the stack.*/
	public Object peek();
	  
	  /*Detects whether this stack is empty.
	   * @return True if the stack is empty.*/
	public boolean isEmpty();
	   
	   /* Removes all entries from this stack*/
	public void clear();
	
}


