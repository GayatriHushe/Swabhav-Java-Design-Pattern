package com.techlab.model;

import java.util.Iterator;

public interface IQueue<E> {
	public <T> T dequeue();
	public <T> void enque(T data);
	Iterator<E> iterator();
}
