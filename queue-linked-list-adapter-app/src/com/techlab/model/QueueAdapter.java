package com.techlab.model;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<E>  implements IQueue<E>{

	private LinkedList<E> linkedList;

	public QueueAdapter() {
		linkedList=new LinkedList<>();
	}

	@Override
	public <T> void enque(T data) {
		linkedList.addFirst((E) data);
	}

	@Override
	public E dequeue() {
		return linkedList.removeLast();
	}

	@Override
	public Iterator<E> iterator() {
		
		return linkedList.iterator();
		
		
	}

}
