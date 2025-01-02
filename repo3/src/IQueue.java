
public interface IQueue {
    /* Adds a new entry to the back of this queue.
	 * @param newEntry An object to be added.*/
    public void enqueue(Object anEntry);
	
	/* Removes and returns the entry at the front of this queue.
	 * @return The object at the front of the queue.*/ 
	public Object dequeue();
	 
	 /* Retrieves the entry at the front of this queue.
	 * @return The object at the front of the queue.*/ 
	public Object getFront();
	 
	 /* Detects whether this queue is empty.
	  * @return True if the queue is empty, or False otherwise.*/ 
	public boolean isEmpty();

}
