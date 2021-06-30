package com.techlab.test;

import java.util.Iterator;

import com.techlab.model.QueueAdapter;

public class Test {

	public static <T> void main(String[] args) {
		QueueAdapter<String> queueAdapater=new QueueAdapter<String>();	
		
		queueAdapater.enque("A");
		queueAdapater.enque("B");
		queueAdapater.enque("C");
		queueAdapater.enque("D");
		
		for (Iterator<String> iterator = queueAdapater.iterator(); iterator.hasNext();) {
			String data =  iterator.next();
			System.out.print(data);
		}
		System.out.println();
		queueAdapater.dequeue();
		
		for (Iterator<String> iterator = queueAdapater.iterator(); iterator.hasNext();) {
			String data = iterator.next();
			System.out.print(data);
		}
	}

}
