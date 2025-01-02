import java.util.ArrayList;
import java.util.List;


public class Deque<T> implements IDeque{
	private List<T> deque;
	public Deque() {
		deque = new ArrayList<>();
	}
	@Override
	public T removeFirst() {
		return deque.remove(0);
	}

	@Override
	public T  removeLast() {
		return deque.remove(size()-1);
	}

	@Override
	public T  getFirst() {
		return deque.get(0);
	}

	@Override
	public T  getLast() {

		return deque.get(size()-1);
	}

	@Override
	public boolean isEmpty() {
		return size()==0;		
	}

	@Override
	public int size() {
		return deque.size();		
	}
	public void addAll(List<T> vendorList) {
		deque.addAll(vendorList);
	}
	public void add(T element) {
		deque.add(element);
	
	}

}
