import java.util.ArrayList;
import java.util.List;

public class Stack implements IStack {
	List<Object> tempStack;
	public Stack() {
		tempStack=new ArrayList<Object>();
	}
	@Override
	public void push(Object newEntry) {
		tempStack.add(newEntry);
	}
	@Override
	public Object pop() {
		return tempStack.remove(tempStack.size()-1);
	}
	@Override
	public Object peek() {
		return tempStack.indexOf(tempStack.size()-1);
	}
	@Override
	public boolean isEmpty() {
		return tempStack.size()==0;
	}
	@Override
	public void clear() {
		tempStack.clear();
	}
}

